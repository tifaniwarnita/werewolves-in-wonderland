/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werewolvesinwonderland.server;

import werewolvesinwonderland.protocol.Identification;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import werewolvesinwonderland.protocol.model.ClientInfo;

/**
 *
 * @author Ahmad Naufal Farhan
 */
public class ClientHandler implements Runnable {

    private final Socket mSocket;
    private Thread mThread;

    private ServerController mServerHandle;

    // descriptors to socket input and output
    private DataInputStream is;
    private DataOutputStream os;

    private int playerId = -1;
    private boolean isConnected = false;
    
    private ClientInfo clientInfo;

    /**
     * The main constructor for client handlers
     * @param newSocket the connected client socket
     * @param handle
     */
    public ClientHandler(Socket newSocket, ServerController handle) {
        mSocket = newSocket;
        mServerHandle = handle;

        try {

            is = new DataInputStream(mSocket.getInputStream());
            os = new DataOutputStream(mSocket.getOutputStream());

            isConnected = true;

            mThread = new Thread(this);
            start();
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DataOutputStream getOutputStream() {
      return os;
    }

    public int getPlayerId() {
      return playerId;
    }

    /**
     * Method to start the handler
     */
    private void start() {
        if (mThread == null)
            mThread = new Thread(this);

        mThread.start();
    }

    /**
     * Implementing Run method from Runnable
     */
    @Override
    public void run() {
        try {
            while (isConnected) {
                String request = "";
                while (is.available() > 0)
                    request += is.readUTF();

                try {
                    JSONObject requestObj = new JSONObject(request);
                    String requestMethod = requestObj.getString(Identification.PRM_METHOD);
                    switch (requestMethod) {
                        case Identification.METHOD_JOIN :
                            String username = requestObj.getString(Identification.PRM_USERNAME);
                            String udpAddress = requestObj.getString(Identification.PRM_UDPADDR);
                            int udpPort = requestObj.getInt(Identification.PRM_UDPPORT);
                            int _playerId = mServerHandle.getGame().addPlayer(username,udpAddress,udpPort);
                            switch (_playerId) {
                                case -1:    // existing user
                                    ServerSender.sendJoinGameResponseFailUserExist(os);
                                    break;
                                case -2:    // game is running: join game is unable
                                    ServerSender.sendJoinGameResponseFailGameRunning(os);
                                    break;
                                default:
                                    playerId = _playerId;
                                    mServerHandle.mapPlayerClient(this);
                                    ServerSender.sendJoinGameResponseOK(playerId, os);
                                    break;
                            }
                            break;

                        case Identification.METHOD_LEAVE :
                            isConnected = false;
                            // TODO ini remove player return sesuatu aja ya, biar ada fail response nya
                            mServerHandle.getGame().removePlayer(playerId);
                            if (true) // stub
                                ServerSender.sendResponseOK(os);
                            else
                                ServerSender.sendResponseFail(os);
                            break;

                        case Identification.METHOD_READY :
                            mServerHandle.getGame().increaseReady();
                            ServerSender.sendResponseReadyUpOK(os);
                            break;

                        case Identification.METHOD_CLIENTADDR :
                            ServerSender.sendResponseClientList(mServerHandle.getGame().getPlayersList(),os);
                            break;

                        case Identification.METHOD_ACCEPTPROPOSAL :
                            int kpuId = requestObj.getInt(Identification.PRM_KPUID);
                            mServerHandle.getGame().addKpuProposal(kpuId);
                            ServerSender.sendResponseOK(os);
                            break;

                        case Identification.METHOD_VOTERESULT_WEREWOLF_KILLED :
                        case Identification.METHOD_VOTERESULT_CIVILIAN_KILLED :
                        case Identification.METHOD_VOTERESULT :
                            if (playerId==mServerHandle.getGame().getSelectedKpu()) {
                              int status = requestObj.getInt(Identification.PRM_STATUS);
                              if (status==1) {
                                int killedId = requestObj.getInt(Identification.PRM_PLAYERKILLED);
                                mServerHandle.getGame().killPlayer(killedId);
                              } else if (status==-1) {
                                mServerHandle.getGame().tieVote();
                              } else {
                                ServerSender.sendResponseError(os);
                              }
                            } else {
                              ServerSender.sendResponseError(os);
                            }
                            break;

                        default:
                            // No valid actions: send error response: invalid request
                            ServerSender.sendResponseError(os);
                    }
                } catch (JSONException ex) {
                    System.err.println(ex);
                    System.err.println("Sending error response to responsible client...");
                    ServerSender.sendResponseError(os);
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            // Closing all the sockets and streams
            if (os != null)
                os.close();
            if (is != null)
                is.close();
            if (mSocket != null)
                mSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
