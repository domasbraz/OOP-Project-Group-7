package recyclingservice;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adamp
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        getContentPane().setBackground(new Color(30, 30, 30));
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

        jLabel1 = new javax.swing.JLabel();
        playGameBtn = new javax.swing.JButton();
        goalsBtn = new javax.swing.JButton();
        recyclingInfoBtn = new javax.swing.JButton();
        accountCreationBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 162, 202));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to DADA Recycling");

        playGameBtn.setBackground(new java.awt.Color(30, 30, 30));
        playGameBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playGameBtn.setForeground(new java.awt.Color(111, 162, 202));
        playGameBtn.setText("Play Game");
        playGameBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                playGameBtnActionPerformed(evt);
            }
        });

        goalsBtn.setBackground(new java.awt.Color(30, 30, 30));
        goalsBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        goalsBtn.setForeground(new java.awt.Color(111, 162, 202));
        goalsBtn.setText("Create Goals");
        goalsBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                goalsBtnActionPerformed(evt);
            }
        });

        recyclingInfoBtn.setBackground(new java.awt.Color(30, 30, 30));
        recyclingInfoBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        recyclingInfoBtn.setForeground(new java.awt.Color(111, 162, 202));
        recyclingInfoBtn.setText("Recycling Info");
        recyclingInfoBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                recyclingInfoBtnActionPerformed(evt);
            }
        });

        accountCreationBtn.setBackground(new java.awt.Color(30, 30, 30));
        accountCreationBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        accountCreationBtn.setForeground(new java.awt.Color(111, 162, 202));
        accountCreationBtn.setText("Account Creation");
        accountCreationBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                accountCreationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(accountCreationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playGameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goalsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recyclingInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addGap(170, 170, 170))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goalsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountCreationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recyclingInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playGameBtnActionPerformed
        dispose();
        GameRulesGUI myGUI = new GameRulesGUI();
        myGUI.setVisible(true);
    }//GEN-LAST:event_playGameBtnActionPerformed

    private void goalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalsBtnActionPerformed
        dispose();
        goalsGUI myGoalGUI = new goalsGUI();
        myGoalGUI.setVisible(true);                            
    }//GEN-LAST:event_goalsBtnActionPerformed

    private void recyclingInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recyclingInfoBtnActionPerformed
        dispose();
        RecyclingListGUI RLGUI = new RecyclingListGUI();
        RLGUI.setVisible(true);
    }//GEN-LAST:event_recyclingInfoBtnActionPerformed

    private void accountCreationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountCreationBtnActionPerformed
        dispose();
        UserQuestionUI UI = new UserQuestionUI();
        UI.setVisible(true);
    }//GEN-LAST:event_accountCreationBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountCreationBtn;
    private javax.swing.JButton goalsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playGameBtn;
    private javax.swing.JButton recyclingInfoBtn;
    // End of variables declaration//GEN-END:variables
}
