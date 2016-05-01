/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werewolvesinwonderland.client.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.table.TableModel;
import werewolvesinwonderland.client.ClientController;
import werewolvesinwonderland.client.ClientSender;
import werewolvesinwonderland.client.view.NewGameDialog.NewGameDialogListener;
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
        initPlayerListBoard();
        
        ImageIcon img = new ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/icon_werewolf.png"));
        this.setIconImage(img.getImage());
        this.setTitle("Werewolf in Wonderland");
        changeScreen("gamePanel");
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
        spTable = new javax.swing.JScrollPane();
        tblPlayerList = new javax.swing.JTable();
        btnReadyUp = new javax.swing.JButton();
        btnLeaveGame = new javax.swing.JButton();
        iconTitle = new javax.swing.JLabel();
        bgTable = new javax.swing.JLabel();
        bgProfile = new javax.swing.JLabel();
        bgInfo = new javax.swing.JLabel();
        bgGame = new javax.swing.JLabel();

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
        tblPlayerList.setFocusable(false);
        tblPlayerList.setGridColor(new Color(0,0,0,0));
        tblPlayerList.setOpaque(false);
        tblPlayerList.setSelectionBackground(new Color(0,0,0,0));
        tblPlayerList.setSelectionForeground(new Color(0,0,0,0));
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

        iconTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/werewolvesinwonderland/client/assets/icon_title.png"))); // NOI18N
        gamePanel.add(iconTitle);
        iconTitle.setBounds(50, 20, 947, 100);

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

        mainPanel.add(gamePanel, "gamePanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        new NewGameDialog(this);
    }//GEN-LAST:event_btnStartMouseClicked

    private void btnReadyUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadyUpMouseClicked
        // TODO: request ready up
    }//GEN-LAST:event_btnReadyUpMouseClicked

    private void btnLeaveGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeaveGameMouseClicked
        // TODO: request leave game
    }//GEN-LAST:event_btnLeaveGameMouseClicked

    private ClientController clientController = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgGame;
    private javax.swing.JLabel bgHome;
    private javax.swing.JLabel bgInfo;
    private javax.swing.JLabel bgProfile;
    private javax.swing.JLabel bgTable;
    private javax.swing.JButton btnLeaveGame;
    private javax.swing.JButton btnReadyUp;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel iconTitle;
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
        
        clientController = new ClientController(serverAddress, serverPort, clientPort);
        clientController.initClientConnection();

        JDialog dlgProgress = createProgressDialog();

        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                // TODO: Request join game
                return null;
            }

            @Override
            protected void done() {
                dlgProgress.dispose();//close the modal dialog
            }
        };

        sw.execute(); // this will start the processing on a separate thread
        dlgProgress.setVisible(true); //this will block user input as long as the processing task is working
    }
    
    private void initPlayerListBoard () {
        for(int i=0; i<3; i++) {
            tblPlayerList.setRowHeight(i, 232);
            for (int j=0; j<4; j++) {
                //tblPlayerList.getColumnModel().getColumn(i*4 + j).setCellRenderer(new PlayerPanel());
            }
        }
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
    
}
