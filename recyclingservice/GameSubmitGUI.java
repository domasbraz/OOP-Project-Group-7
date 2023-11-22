/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recyclingservice;

import java.awt.Color;
import javax.swing.JScrollPane;


/**
 *
 * @author domas
 */
public class GameSubmitGUI extends javax.swing.JFrame
{

    /**
     * Creates new form GameSubmitGUI
     */
    public GameSubmitGUI()
    {
        
        initComponents();
        getContentPane().setBackground( new Color(30,30,30) );
        //https://stackoverflow.com/questions/5583495/how-do-i-speed-up-the-scroll-speed-in-a-jscrollpane-when-using-the-mouse-wheel
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblFinalScore = new javax.swing.JLabel();
        lblScoreVal = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        tfLName = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        tfFName = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        cbHideName = new javax.swing.JCheckBox();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        cbHideEmail = new javax.swing.JCheckBox();
        lblGender = new javax.swing.JLabel();
        cbbGender = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnRetry = new javax.swing.JButton();
        btnLeaderboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel1.setBackground(new Color(30,30,30));
        jPanel1.setForeground(new Color(111,162,202)
        );

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new Color(111, 162, 202));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Submit Your Score");

        lblFinalScore.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFinalScore.setForeground(new Color(111, 162, 202));
        lblFinalScore.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFinalScore.setText("Final Score:");

        lblScoreVal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblScoreVal.setForeground(new Color(111, 162, 202));
        lblScoreVal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblScoreVal.setText("0");

        lblLName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLName.setForeground(new Color(111, 162, 202));
        lblLName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLName.setText("Last Name:");

        tfLName.setBackground(new java.awt.Color(51, 51, 51));
        tfLName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfLName.setForeground(new Color(111, 162, 202));
        tfLName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfLName.setCaretColor(new java.awt.Color(204, 204, 204));
        tfLName.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        lblFName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFName.setForeground(new Color(111, 162, 202));
        lblFName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFName.setText("First Name:");

        tfFName.setBackground(new java.awt.Color(51, 51, 51));
        tfFName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfFName.setForeground(new Color(111, 162, 202));
        tfFName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfFName.setCaretColor(new java.awt.Color(204, 204, 204));
        tfFName.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        tfUsername.setBackground(new java.awt.Color(51, 51, 51));
        tfUsername.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfUsername.setForeground(new Color(111, 162, 202));
        tfUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfUsername.setCaretColor(new java.awt.Color(204, 204, 204));
        tfUsername.setMinimumSize(new java.awt.Dimension(200, 36));
        tfUsername.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblUsername.setForeground(new Color(111, 162, 202));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username:");

        cbHideName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbHideName.setForeground(new Color(111,162,202));
        cbHideName.setText("Hide Name");
        cbHideName.setToolTipText("Hides your name in the scoreboard");
        cbHideName.setContentAreaFilled(false);
        cbHideName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbHideNameActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEmail.setForeground(new Color(111, 162, 202));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("E-Mail:");

        tfEmail.setBackground(new java.awt.Color(51, 51, 51));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tfEmail.setForeground(new Color(111, 162, 202));
        tfEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfEmail.setCaretColor(new java.awt.Color(204, 204, 204));
        tfEmail.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        cbHideEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbHideEmail.setForeground(new Color(111,162,202));
        cbHideEmail.setText("Hide E-Mail");
        cbHideEmail.setToolTipText("Hides your e-mail in the scoreboard");
        cbHideEmail.setContentAreaFilled(false);
        cbHideEmail.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbHideEmailActionPerformed(evt);
            }
        });

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblGender.setForeground(new Color(111, 162, 202));
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        cbbGender.setBackground(new Color(30,30,30));
        cbbGender.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbbGender.setForeground(new java.awt.Color(102, 102, 255));
        cbbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", "Prefer not to say" }));
        cbbGender.setSelectedIndex(3);

        btnSubmit.setBackground(new Color(30,30,30));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSubmit.setForeground(new Color(111,162,202)
        );
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRetry.setBackground(new Color(30,30,30));
        btnRetry.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnRetry.setForeground(new Color(111,162,202)
        );
        btnRetry.setText("Retry");
        btnRetry.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRetryActionPerformed(evt);
            }
        });

        btnLeaderboard.setBackground(new Color(30,30,30));
        btnLeaderboard.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnLeaderboard.setForeground(new Color(111,162,202)
        );
        btnLeaderboard.setText("View Leaderboard");
        btnLeaderboard.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLeaderboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinalScore)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblScoreVal, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfLName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHideName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfFName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbHideEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(517, 517, 517))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRetry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnLeaderboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFinalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblScoreVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHideName)
                            .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbHideEmail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cbbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(18, 18, 18)
                .addComponent(btnRetry)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLeaderboard)
                .addGap(53, 53, 53))
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

    
    private void cbHideEmailActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbHideEmailActionPerformed
    {//GEN-HEADEREND:event_cbHideEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHideEmailActionPerformed

    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRetryActionPerformed
    {//GEN-HEADEREND:event_btnRetryActionPerformed
        // TODO add your handling code here:
        new GamePlayGUI().main(null);
        dispose();
    }//GEN-LAST:event_btnRetryActionPerformed

    private void btnLeaderboardActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLeaderboardActionPerformed
    {//GEN-HEADEREND:event_btnLeaderboardActionPerformed
        // TODO add your handling code here:
        new GameLeaderboardGUI().main(null);
        dispose();
    }//GEN-LAST:event_btnLeaderboardActionPerformed

    private void cbHideNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbHideNameActionPerformed
    {//GEN-HEADEREND:event_cbHideNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHideNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        new GameLeaderboardGUI().main(null);
        dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(GameSubmitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GameSubmitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GameSubmitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GameSubmitGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GameSubmitGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeaderboard;
    private javax.swing.JButton btnRetry;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbHideEmail;
    private javax.swing.JCheckBox cbHideName;
    private javax.swing.JComboBox<String> cbbGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFinalScore;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblScoreVal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFName;
    private javax.swing.JTextField tfLName;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables


}
