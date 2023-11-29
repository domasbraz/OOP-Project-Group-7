/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recyclingservice;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.*;
import recyclingservice.data.player.PlayerHighScore;
import recyclingservice.data.leaderboard.LeaderBoardData;


/**
 *
 * @author domas
 */
public class GameLeaderboardGUI extends javax.swing.JFrame
{
    private Color bgColor = new Color(30,30,30);
    private Color fgColor = new Color(111,162,202);
    
    


    /**
     * Creates new form GameLeaderboard
     */
    public GameLeaderboardGUI()
    {
        initComponents();
        setExtraStyling();
        setLeaderBoardValues();
        
        
        //tblLeaderboard.setValueAt("balls", 0, 0);
    }
    
    private void setLeaderBoardValues()
    {
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        File inFilePlayer, inFileLeaderboard;
        FileInputStream fStreamPlayer, fStreamLeaderboard;
        ObjectInputStream oStreamPlayer, oStreamLeaderboard;  
        

        try 
        {
            inFileLeaderboard = new File("src/recyclingservice/data/leaderboard/leaderboard.dat");
            fStreamLeaderboard = new FileInputStream(inFileLeaderboard);
            oStreamLeaderboard = new ObjectInputStream(fStreamLeaderboard);

            LeaderBoardData lbi = (LeaderBoardData) oStreamLeaderboard.readObject();
            
            String[][] leaderboardValues = lbi.getLeaderboadValues();
            
            oStreamLeaderboard.close();
            
            inFilePlayer = new File("src/recyclingservice/data/player/playerHighScore.dat");
            fStreamPlayer = new FileInputStream(inFilePlayer);
            oStreamPlayer = new ObjectInputStream(fStreamPlayer);
            
            PlayerHighScore pi = (PlayerHighScore) oStreamPlayer.readObject();
            
            leaderboardValues[10] = pi.getPlayerValues();
            
            oStreamPlayer.close();
            
            leaderboardValues = sortTable(leaderboardValues);
            
            
            
            for (int row = 0; row < 10; row++)
            {
                for (int col = 1; col < 5; col++)
                {
                    tblLeaderboard.setValueAt(leaderboardValues[row][col-1], row, col);
                }
            }
            
            saveLeaderboard(leaderboardValues);
        
        } 
        catch (IOException e1) 
        {
            System.out.println(e1);
        }
        catch (ClassNotFoundException e2)
        {
            System.out.println(e2); 
        }

        
    }
    
    private String[][] sortTable(String[][] table)
    {
        boolean failState;
        do{
            failState = false;
            
            for (int x = 0; x < table.length - 1 ; x++)
            {
                if (Integer.parseInt(table[x][0]) < Integer.parseInt(table[x + 1][0]))
                {
                    String[] tempval = table[x];

                    table[x] = table[x + 1];

                    table[x + 1] = tempval;

                    failState = true;
                }
            }
        }
        while (failState);
        
        return table;
    }
    
    private void saveLeaderboard(String[][] leaderboard)
    {
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try
        {
            LeaderBoardData lbd = new LeaderBoardData();
            
            outFile = new File("src/recyclingservice/data/leaderboard/leaderboard.dat");
            fStream= new FileOutputStream(outFile);
            oStream = new ObjectOutputStream(fStream);
            
            lbd.setLeaderboadValues(leaderboard);
            
            oStream.writeObject(lbd);
            
            oStream.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        /*catch (ClassNotFoundException e2)
        {
            
        }*/
    }
    
    //sets extra styling for tables
    private void setExtraStyling()
    {
        //https://stackoverflow.com/questions/4408644/how-can-i-change-the-font-of-a-jtables-header
        tblLeaderboard.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 36));
        tblLeaderboard.getTableHeader().setForeground(fgColor);
        tblResult.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 36));
        tblResult.getTableHeader().setForeground(fgColor);
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        tblLeaderboard.getTableHeader().setOpaque(true);
        tblLeaderboard.getTableHeader().setBackground(bgColor);
        
        //couldn't find any other way to change the table header background colour
        //https://stackoverflow.com/a/15280574
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();

        headerRenderer.setBackground(new Color(35,35,35));

        for (int i = 0; i < tblLeaderboard.getModel().getColumnCount(); i++) 
        {
            tblLeaderboard.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        for (int i = 0; i < tblResult.getModel().getColumnCount(); i++) 
        {
            tblResult.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLeaderboard = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnReplay = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel1.setBackground(bgColor);
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 919));

        jScrollPane4.setPreferredSize(new java.awt.Dimension(400, 412));

        tblLeaderboard.setBackground(bgColor);
        tblLeaderboard.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tblLeaderboard.setForeground(fgColor);
        tblLeaderboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1.", "0", "x", "y", "z"},
                {"2.", "0", "x", "y", "z"},
                {"3.", "0", "x", "y", "z"},
                {"4.", "0", "x", "y", "z"},
                {"5.", "0", "x", "y", "z"},
                {"6.", "0", "x", "y", "z"},
                {"7.", "0", "x", "y", "z"},
                {"8.", "0", "x", "y", "z"},
                {"9.", "0", "x", "y", "z"},
                {"10.", "0", "x", "y", "z"}
            },
            new String [] {
                "Top", "Score", "Username", "Name", "Surname"
            }
        ));
        tblLeaderboard.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblLeaderboard.setRowHeight(40);
        tblLeaderboard.setShowGrid(true);
        jScrollPane4.setViewportView(tblLeaderboard);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(16, 200));

        tblResult.setBackground(bgColor);
        tblResult.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tblResult.setForeground(fgColor);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0%", "0", "x", "y", "z"}
            },
            new String [] {
                "Top", "Score", "Username", "Name", "Surname"
            }
        ));
        tblResult.setRowHeight(50);
        tblResult.setShowGrid(true);
        jScrollPane2.setViewportView(tblResult);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(fgColor);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Result");

        btnReplay.setBackground(bgColor);
        btnReplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReplay.setForeground(fgColor);
        btnReplay.setText("Retry");
        btnReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplayActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(bgColor);
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubmit.setForeground(fgColor);
        btnSubmit.setText("Submit Score");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnHome.setBackground(bgColor);
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHome.setForeground(fgColor);
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReplayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReplayActionPerformed
    {//GEN-HEADEREND:event_btnReplayActionPerformed
        // TODO add your handling code here:
        new GamePlayGUI().main(null);
        dispose();
    }//GEN-LAST:event_btnReplayActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        new GameSubmitGUI().main(null);
        dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHomeActionPerformed
    {//GEN-HEADEREND:event_btnHomeActionPerformed
        dispose();
        HomePage HPUI = new HomePage();
        HPUI.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GameLeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GameLeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GameLeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GameLeaderboardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new GameLeaderboardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnReplay;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblLeaderboard;
    private javax.swing.JTable tblResult;
    // End of variables declaration//GEN-END:variables
}
