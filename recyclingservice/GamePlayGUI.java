/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recyclingservice;

import java.awt.Color;

/**
 *
 * @author domas
 */


public class GamePlayGUI extends javax.swing.JFrame
{

    /**
     * Creates new form GamePlayGUI
     */
    public GamePlayGUI()
    {
        initComponents();
        getContentPane().setBackground( new Color(30,30,30) );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnTrue = new javax.swing.JButton();
        lblTimeVal = new javax.swing.JLabel();
        btnFalse = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblScoreVal = new javax.swing.JLabel();
        btnPlaceholder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new Color(111, 162, 202));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Recycling Game");

        btnTrue.setBackground(new java.awt.Color(30, 128, 30));
        btnTrue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTrue.setForeground(new java.awt.Color(255, 255, 255));
        btnTrue.setText("Recyclable");
        btnTrue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrue.setBorderPainted(false);
        btnTrue.setFocusPainted(false);
        btnTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrueActionPerformed(evt);
            }
        });

        lblTimeVal.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        lblTimeVal.setForeground(new Color(111, 162, 202));
        lblTimeVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimeVal.setText("0");

        btnFalse.setBackground(new java.awt.Color(110, 82, 43));
        btnFalse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFalse.setForeground(new java.awt.Color(255, 255, 255));
        btnFalse.setText("Non-Recyclable");
        btnFalse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFalse.setBorderPainted(false);
        btnFalse.setFocusPainted(false);
        btnFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalseActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTime.setForeground(new Color(111, 162, 202));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Time");

        lblScore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblScore.setForeground(new Color(111, 162, 202));
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("Score");

        lblScoreVal.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        lblScoreVal.setForeground(new Color(111, 162, 202));
        lblScoreVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreVal.setText("0");

        btnPlaceholder.setText("Redirect Placeholder");
        btnPlaceholder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceholderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new Color(111, 162, 202));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prompt Placeholder");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTimeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblScoreVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(btnPlaceholder)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btnFalse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblScoreVal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFalse)
                    .addComponent(btnTrue))
                .addGap(16, 16, 16)
                .addComponent(btnPlaceholder)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void btnTrueActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTrueActionPerformed
    {//GEN-HEADEREND:event_btnTrueActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_btnTrueActionPerformed

    private void btnFalseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFalseActionPerformed
    {//GEN-HEADEREND:event_btnFalseActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnFalseActionPerformed

    private void btnPlaceholderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlaceholderActionPerformed
    {//GEN-HEADEREND:event_btnPlaceholderActionPerformed
        // TODO add your handling code here:
        new GameLeaderboardGUI().main(null);
       dispose();
    }//GEN-LAST:event_btnPlaceholderActionPerformed

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
            java.util.logging.Logger.getLogger(GamePlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GamePlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GamePlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GamePlayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //d1.getContentPane().setBackground( new Color(1,1,1) );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                
                new GamePlayGUI().setVisible(true);
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFalse;
    private javax.swing.JButton btnPlaceholder;
    private javax.swing.JButton btnTrue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreVal;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeVal;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}