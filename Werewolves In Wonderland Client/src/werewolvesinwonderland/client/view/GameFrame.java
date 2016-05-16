/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werewolvesinwonderland.client.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import werewolvesinwonderland.client.ClientController;
import werewolvesinwonderland.client.controller.GameController;
import werewolvesinwonderland.client.view.NewGameDialog.NewGameDialogListener;
import werewolvesinwonderland.protocol.Identification;
import werewolvesinwonderland.protocol.model.Player;
/**
 *
 * @author Tifani
 */
public class GameFrame extends javax.swing.JFrame implements NewGameDialogListener {

    /**
     * Creates new form GameFrame
     */
    public GameFrame() {
        initComponents();
        spTable.setOpaque(false);
        spTable.getViewport().setOpaque(false);
        spTable.setColumnHeaderView(null);
        // initPlayerListBoard(); //dummy

        ImageIcon img = new ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/icon_werewolf.png"));
        this.setIconImage(img.getImage());
        this.setTitle("Werewolf in Wonderland");
        changeScreen("homePanel");
//        Player currentPlayer = new Player(1, true, "123", 8080, "Tifani", Identification.ROLE_CIVILIAN); //TEST
//        PlayerAvatarMaker.addPlayer(currentPlayer);
//        setPlayerInfo(currentPlayer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        bgHome = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        coloredInfoScrollPane = new javax.swing.JScrollPane();
        coloredInfoTextArea = new javax.swing.JTextPane();
        infoScrollPane = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        spTable = new javax.swing.JScrollPane();
        tblPlayerList = new javax.swing.JTable();
        btnReadyUp = new javax.swing.JButton();
        btnLeaveGame = new javax.swing.JButton();
        imgPhase = new javax.swing.JLabel();
        lbDeadPlayers = new javax.swing.JLabel();
        lbAlivePlayers = new javax.swing.JLabel();
        lbDay = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        icPlayer = new javax.swing.JLabel();
        lbU = new javax.swing.JLabel();
        lbR = new javax.swing.JLabel();
        lbS = new javax.swing.JLabel();
        iconTitle = new javax.swing.JLabel();
        bgInfoWhite = new javax.swing.JLabel();
        bgTable = new javax.swing.JLabel();
        bgProfile = new javax.swing.JLabel();
        bgInfo = new javax.swing.JLabel();
        bgGame = new javax.swing.JLabel();
        lbUsername2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        homePanel.setLayout(null);

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/btn_start.png"))); // NOI18N
        btnStart.setBorder(null);
        btnStart.setBorderPainted(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setFocusPainted(false);
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        homePanel.add(btnStart);
        btnStart.setBounds(580, 600, 211, 74);

        bgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_home.png"))); // NOI18N
        homePanel.add(bgHome);
        bgHome.setBounds(0, 0, 1370, 760);

        mainPanel.add(homePanel, "homePanel");

        gamePanel.setLayout(null);

        coloredInfoScrollPane.setViewportView(coloredInfoTextArea);

        gamePanel.add(coloredInfoScrollPane);
        coloredInfoScrollPane.setBounds(1050, 420, 230, 240);

        infoScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        infoScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        infoScrollPane.setPreferredSize(new java.awt.Dimension(273, 323));

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setLineWrap(true);
        infoTextArea.setRows(5);
        infoTextArea.setWrapStyleWord(true);
        infoTextArea.setPreferredSize(null);
        infoScrollPane.setViewportView(infoTextArea);

        gamePanel.add(infoScrollPane);
        infoScrollPane.setBounds(1050, 420, 230, 240);

        spTable.setBackground(new Color(0,0,0,0));
        spTable.setBorder(null);
        spTable.setForeground(new Color(0,0,0,0));
        spTable.setFocusable(false);
        spTable.setOpaque(false);

        tblPlayerList.setBackground(new Color(0,0,0,0));
        tblPlayerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tblPlayerList.setColumnSelectionAllowed(true);
        tblPlayerList.setFocusable(false);
        tblPlayerList.setOpaque(false);
        tblPlayerList.setRowSelectionAllowed(false);
        tblPlayerList.setSelectionBackground(new Color(0,0,0,0));
        tblPlayerList.setSelectionForeground(new Color(0,0,0,0));
        tblPlayerList.setShowHorizontalLines(false);
        tblPlayerList.setShowVerticalLines(false);
        tblPlayerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlayerListMouseClicked(evt);
            }
        });
        spTable.setViewportView(tblPlayerList);

        gamePanel.add(spTable);
        spTable.setBounds(60, 130, 930, 560);

        btnReadyUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/btn_readyup.png"))); // NOI18N
        btnReadyUp.setBorder(null);
        btnReadyUp.setBorderPainted(false);
        btnReadyUp.setContentAreaFilled(false);
        btnReadyUp.setFocusPainted(false);
        btnReadyUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReadyUpMouseClicked(evt);
            }
        });
        gamePanel.add(btnReadyUp);
        btnReadyUp.setBounds(1030, 10, 269, 49);

        btnLeaveGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/btn_leavegame.png"))); // NOI18N
        btnLeaveGame.setBorder(null);
        btnLeaveGame.setBorderPainted(false);
        btnLeaveGame.setContentAreaFilled(false);
        btnLeaveGame.setFocusPainted(false);
        btnLeaveGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLeaveGameMouseClicked(evt);
            }
        });
        gamePanel.add(btnLeaveGame);
        btnLeaveGame.setBounds(1070, 70, 192, 41);

        imgPhase.setBackground(new java.awt.Color(255, 255, 255));
        imgPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/phase_night.png"))); // NOI18N
        gamePanel.add(imgPhase);
        imgPhase.setBounds(1060, 320, 72, 72);

        lbDeadPlayers.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbDeadPlayers.setText("0 players dead");
        gamePanel.add(lbDeadPlayers);
        lbDeadPlayers.setBounds(1150, 370, 120, 19);

        lbAlivePlayers.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbAlivePlayers.setText("0 players alive");
        gamePanel.add(lbAlivePlayers);
        lbAlivePlayers.setBounds(1150, 350, 120, 19);

        lbDay.setFont(new java.awt.Font("Abel", 1, 18)); // NOI18N
        lbDay.setForeground(new java.awt.Color(102, 51, 0));
        lbDay.setText("Day 0");
        gamePanel.add(lbDay);
        lbDay.setBounds(1150, 320, 60, 24);

        lbStatus.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbStatus.setText("Alive");
        gamePanel.add(lbStatus);
        lbStatus.setBounds(1230, 200, 60, 19);

        lbRole.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbRole.setText("Werewolf");
        gamePanel.add(lbRole);
        lbRole.setBounds(1230, 170, 60, 19);

        lbUsername.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbUsername.setText("Snowball");
        gamePanel.add(lbUsername);
        lbUsername.setBounds(1230, 140, 60, 19);

        icPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/ic_player110_werewolf2.png"))); // NOI18N
        gamePanel.add(icPlayer);
        icPlayer.setBounds(1040, 140, 110, 110);

        lbU.setFont(new java.awt.Font("Abel", 1, 14)); // NOI18N
        lbU.setForeground(new java.awt.Color(102, 51, 0));
        lbU.setText("Username");
        gamePanel.add(lbU);
        lbU.setBounds(1160, 140, 60, 19);

        lbR.setFont(new java.awt.Font("Abel", 1, 14)); // NOI18N
        lbR.setForeground(new java.awt.Color(102, 51, 0));
        lbR.setText("Role");
        gamePanel.add(lbR);
        lbR.setBounds(1160, 170, 60, 19);

        lbS.setFont(new java.awt.Font("Abel", 1, 14)); // NOI18N
        lbS.setForeground(new java.awt.Color(102, 51, 0));
        lbS.setText("Status");
        gamePanel.add(lbS);
        lbS.setBounds(1160, 200, 60, 19);

        iconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/icon_title.png"))); // NOI18N
        gamePanel.add(iconTitle);
        iconTitle.setBounds(50, 20, 947, 100);

        bgInfoWhite.setBackground(new java.awt.Color(255, 255, 255));
        bgInfoWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_white.png"))); // NOI18N
        gamePanel.add(bgInfoWhite);
        bgInfoWhite.setBounds(1050, 310, 232, 92);

        bgTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_table1.png"))); // NOI18N
        gamePanel.add(bgTable);
        bgTable.setBounds(60, 130, 933, 561);

        bgProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_profile.png"))); // NOI18N
        gamePanel.add(bgProfile);
        bgProfile.setBounds(1030, 130, 275, 129);

        bgInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_info.png"))); // NOI18N
        gamePanel.add(bgInfo);
        bgInfo.setBounds(1030, 290, 276, 396);

        bgGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_game_day.png"))); // NOI18N
        gamePanel.add(bgGame);
        bgGame.setBounds(0, 0, 1366, 768);

        lbUsername2.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbUsername2.setForeground(new java.awt.Color(102, 51, 0));
        lbUsername2.setText("Role");
        gamePanel.add(lbUsername2);
        lbUsername2.setBounds(1160, 170, 60, 19);

        mainPanel.add(gamePanel, "gamePanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1339, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        newGameDialog = new NewGameDialog(this);
    }//GEN-LAST:event_btnStartMouseClicked

    private void btnReadyUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadyUpMouseClicked
        gameController.readyUp();
        initializePhaseInfoReady();
        showProgressDialog();
    }//GEN-LAST:event_btnReadyUpMouseClicked

    private void btnLeaveGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeaveGameMouseClicked
        gameController.leaveGame();
        showProgressDialog();
    }//GEN-LAST:event_btnLeaveGameMouseClicked

    private void tblPlayerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlayerListMouseClicked
        if (tblPlayerList.isEnabled() && gameController.voteNow) {
            int row = tblPlayerList.getSelectedRow();
            int col = tblPlayerList.getSelectedColumn();
            //int playerPos = (row * 4) + col;
            if (tblPlayerList.getValueAt(row,col)!=null) {
                Player player = (Player)tblPlayerList.getValueAt(row,col);
                gameController.voteVictim(player.getPlayerId());
                System.out.println("row: " + row + " col:" + col);
                System.out.println("Selected player:" + player.getUsername());
                gameController.voteNow = false;
            }
        }
    }//GEN-LAST:event_tblPlayerListMouseClicked

    private final GameController gameController = new GameController(this);
    private ClientController clientController;
    private JFrame newGameDialog;
    private JDialog progressDialog = createProgressDialog();
    private String textInfo = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgGame;
    private javax.swing.JLabel bgHome;
    private javax.swing.JLabel bgInfo;
    private javax.swing.JLabel bgInfoWhite;
    private javax.swing.JLabel bgProfile;
    private javax.swing.JLabel bgTable;
    private javax.swing.JButton btnLeaveGame;
    private javax.swing.JButton btnReadyUp;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane coloredInfoScrollPane;
    private javax.swing.JTextPane coloredInfoTextArea;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel icPlayer;
    private javax.swing.JLabel iconTitle;
    private javax.swing.JLabel imgPhase;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JLabel lbAlivePlayers;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbDeadPlayers;
    private javax.swing.JLabel lbR;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbS;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbU;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsername2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTable tblPlayerList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onJoinGameButtonClicked(String username, String serverAddress, int serverPort, int clientPort) {
        System.out.println(NewGameDialog.class.getSimpleName() +
                    ": [Join Game] " +
                    "Username: " + username + ", " +
                    "Server Address: " + serverAddress + ", " +
                    "Server Port: " + serverPort + ", " +
                    "Client Port: " + clientPort);

        JDialog dlgProgress = createProgressDialog();

        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                int ret = gameController.joinGame(username, serverAddress, serverPort, clientPort);
                System.out.println("Do in background join game");
                while (ClientController.isWaitingResponse()) {
                    // Waiting
                    Thread.sleep(1000);
                }
                // if (ret != 0) showErrorMessage("Error joining game");
                System.out.println("Game is connected.");
                return null;
            }

            @Override
            protected void done() {
                dlgProgress.dispose();//close the modal dialog
                newGameDialog.dispose();
            }
        };

        sw.execute(); // this will start the processing on a separate thread
        dlgProgress.setVisible(true); //this will block user input as long as the processing task is working
    }

    private void initPlayerListBoard () {
        // TEST
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(2, true, "123", 8080, "Nilta", Identification.ROLE_CIVILIAN));
        Player player = new Player(3, true, "123", 8080, "Yoru", Identification.ROLE_CIVILIAN);
        player.setAlive(false);
        players.add(player);
        player = new Player(4, true, "123", 8080, "Nami", Identification.ROLE_WEREWOLF);
        player.setAlive(false);
        players.add(player);
        players.add(new Player(5, true, "123", 8080, "Ahmad", Identification.ROLE_CIVILIAN));
        players.add(new Player(6, true, "123", 8080, "Inocchi", Identification.ROLE_CIVILIAN));
        players.add(new Player(7, true, "123", 8080, "Snowball", Identification.ROLE_CIVILIAN));
        players.add(new Player(8, true, "123", 8080, "Quincy", Identification.ROLE_CIVILIAN));
        players.add(new Player(9, true, "123", 8080, "Sakamoto", Identification.ROLE_CIVILIAN));
        players.add(new Player(10, true, "123", 8080, "Moci", Identification.ROLE_CIVILIAN));
        players.add(new Player(11, true, "123", 8080, "Tanpopo", Identification.ROLE_CIVILIAN));

        tblPlayerList.setModel(new DefaultTableModel(2, 4));
        for(int i=0; i<3; i++) {
            tblPlayerList.setRowHeight(i, 232);
            for (int j=0; j<4; j++) {
                int x = (i * 4 + j) % 10;
                PlayerAvatarMaker.addPlayer(players.get(x));
                if (!players.get(x).isAlive())
                    PlayerAvatarMaker.setPlayerHasDied(players.get(x));
//                tblPlayerList.getColumnModel().getColumn(j).setCellRenderer(new PlayerPanel(this, players.get(x)));
            }
        }
    }

    public void updateBoard(boolean voteNow) {
        int size = gameController.getGame().getListPlayers().size();
        tblPlayerList.setModel(new DefaultTableModel(size/4 + 1, 4){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        int columnCount = 0;
        int rowCount = 0;
        for (int i=0; i<size/4 + 1; i++) {
            tblPlayerList.setRowHeight(i, 232);
        }
        for (int i=0;i<4;i++) {
            PlayerPanel playerPanel = new PlayerPanel();
            if (voteNow)
                playerPanel.enablePanel();
            else
                playerPanel.disablePanel();
            tblPlayerList.getColumnModel().getColumn(i).setCellRenderer(playerPanel);
        }
        for (Map.Entry<Integer, Player> entry : gameController.getGame().getListPlayers().entrySet()) {
            if (entry.getValue().getPlayerId()!=gameController.getGame().getCurrentPlayer().getPlayerId()) {
              PlayerAvatarMaker.addPlayer(entry.getValue()); // harusnya ga di sini
              if (!entry.getValue().isAlive())
                  PlayerAvatarMaker.setPlayerHasDied(entry.getValue());
              tblPlayerList.setValueAt(entry.getValue(),rowCount,columnCount);
              columnCount++;
              if (columnCount == 4) {
                  columnCount = 0;
                  rowCount++;
              }
            }
        }
        gamePanel.revalidate();
    }

    private void changeScreen(String screenName) {
        ((java.awt.CardLayout)mainPanel.getLayout()).show(mainPanel,screenName);
    }

    private JDialog createProgressDialog() {
        JDialog dlgProgress = new JDialog(this, "Please wait...", true);//true means that the dialog created is modal
        JLabel lblStatus = new JLabel("Working..."); // this is just a label in which you can indicate the state of the processing
        dlgProgress.setLocationRelativeTo(null);
        dlgProgress.setUndecorated(true);

        JProgressBar pbProgress = new JProgressBar(0, 100);
        pbProgress.setIndeterminate(true); //we'll use an indeterminate progress bar

        dlgProgress.add(BorderLayout.NORTH, lblStatus);
        dlgProgress.add(BorderLayout.CENTER, pbProgress);
        dlgProgress.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); // prevent the user from closing the dialog
        dlgProgress.setSize(300, 90);
        return dlgProgress;
    }

    public void joinGameSuccess(Player currentPlayer)  {
        changeScreen("gamePanel");
        initializePhaseInfo();
        setPlayerInfo(currentPlayer);
    }

    public void joinGameFailed(String message) {
        newGameDialog.setVisible(true);
        showErrorMessage(message);
    }

    public void showInformationMessage(String message) {
        showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public void showErrorMessage(String message) {
        showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void setBackground(String time) {
        if (time.equals(Identification.TIME_DAY)) {
            bgGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_game_day.png")));
        } else {
            bgGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/bg_game_night.png")));
        }
    }

    public void setPlayerInfo(Player currentPlayer) {
        icPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                PlayerAvatarMaker.createStringImageResource(currentPlayer, "110"))));
        lbUsername.setText(currentPlayer.getUsername());
        if (currentPlayer.getRole() == null) {
            lbRole.setText("-");
        } else {
            lbRole.setText(currentPlayer.getRole().substring(0, 1).toUpperCase()
                + currentPlayer.getRole().substring(1));
        }
        if (currentPlayer.isAlive()) lbStatus.setText("Alive");
            else lbStatus.setText("Died");
    }

    public void leaveGameSuccess() {
        changeScreen("homePanel");
    }

    public void showProgressDialog() {
        progressDialog.setVisible(true);
    }

    public void dismissProgressDialog() {
        if (progressDialog != null)
            progressDialog.dispose();
    }
    
    public void initializePhaseInfo() {
        bgInfo.setVisible(false);
        bgInfoWhite.setVisible(false);
        imgPhase.setVisible(false);
        lbDay.setVisible(false);
        lbAlivePlayers.setVisible(false);
        lbDeadPlayers.setVisible(false);
        infoScrollPane.setVisible(false);
        infoTextArea.setVisible(false);
        coloredInfoScrollPane.setVisible(false);
        coloredInfoTextArea.setVisible(false);
    }
    
    public void initializePhaseInfoReady() {
        bgInfo.setVisible(true);
        bgInfoWhite.setVisible(true);
        imgPhase.setVisible(true);
        lbDay.setVisible(true);
        lbAlivePlayers.setVisible(true);
        lbDeadPlayers.setVisible(true);
        infoScrollPane.setVisible(true);
        infoTextArea.setVisible(true);
        coloredInfoScrollPane.setVisible(true);
        coloredInfoTextArea.setVisible(true);
        changePhaseInfo(Identification.PHASE_DAY, 0);
        changeNumberOfPlayersInfo(1, 0);
    }
    
    public void changePhaseInfo(String phase, int day) {
        setBackground(phase);
        if (phase.equals(Identification.TIME_DAY)) {
            imgPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/phase_day.png")));
        } else {
            imgPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/phase_night.png")));
        }
        lbDay.setText("Day " + day);
    }
    
    public void changeNumberOfPlayersInfo(int alivePlayers, int deadPlayers) {
        lbAlivePlayers.setText(alivePlayers + " players alive");
        lbDeadPlayers.setText(deadPlayers + " players dead");
    }
    
    public void changePhaseInfo(String phase, int day, int alivePlayers, int deadPlayers) {
        setBackground(phase);
        if (phase.equals(Identification.TIME_DAY)) {
            imgPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/phase_day.png")));
        } else {
            imgPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/phase_night.png")));
        }
        lbDay.setText("Day " + day);
        lbAlivePlayers.setText(alivePlayers + " players alive");
        lbDeadPlayers.setText(deadPlayers + " players dead");
    }
    
    public void addInfoToInfoPane(String info) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy:hh:mm");
        String currentTime = dateFormat.format(date);
//        textInfo = "[" + currentTime + "] " + info + "\n" + textInfo;
//        infoTextArea.setText(textInfo);
        
        StyledDocument doc = coloredInfoTextArea.getStyledDocument();
        Style style = coloredInfoTextArea.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, new Color(46, 158, 105));
        try {
            doc.insertString(0, "[" + currentTime + "] ", style);
        }
        catch (BadLocationException e) {
            e.printStackTrace();
        }
        int size = (new String("[" + currentTime + "] ")).length();
        StyleConstants.setForeground(style, Color.black);
        try {
            doc.insertString(size, info + "\n", style);
        }
        catch (BadLocationException e){
            e.printStackTrace();
        }
    }
    
    public void addErrorToInfoPane(String error) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy:hh:mm");
        String currentTime = dateFormat.format(date);
        
        StyledDocument doc = coloredInfoTextArea.getStyledDocument();
        Style style = coloredInfoTextArea.addStyle("I'm a Style", null);
        StyleConstants.setForeground(style, new Color(46, 158, 105));
        try {
            doc.insertString(0, "[" + currentTime + "] ", style);
        }
        catch (BadLocationException e) {
            e.printStackTrace();
        }
        int size = (new String("[" + currentTime + "] ")).length();
        StyleConstants.setForeground(style, Color.red);
        try {
            doc.insertString(size, error + "\n", style);
        }
        catch (BadLocationException e){
            e.printStackTrace();
        }
    }
}
