/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shubh
 */
public class AccountMngWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel UserProcessContainer;
    private AccountDirectory accountDirectory;
    
    

    /**
     * Creates new form AccountMngWorkAreaJPanel
     */

    
    AccountMngWorkAreaJPanel (JPanel UserProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.accountDirectory = accountDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageAccount = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();

        btnManageAccount.setText("Manage Account");
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });

        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        CreateAccountJPanel panel = new CreateAccountJPanel (UserProcessContainer, accountDirectory);
        UserProcessContainer.add("CreateAccountJPanel", panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
        
        
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        // TODO add your handling code here:
        ManageAccountJPanel panel = new ManageAccountJPanel(UserProcessContainer, accountDirectory);
        UserProcessContainer.add("ManageAccountJPanel", panel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnManageAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnManageAccount;
    // End of variables declaration//GEN-END:variables
}
