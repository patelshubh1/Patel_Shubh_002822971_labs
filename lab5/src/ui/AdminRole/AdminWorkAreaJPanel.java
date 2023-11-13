package ui.AdminRole;

import model.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shubh
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSuppliers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 240));
        setPreferredSize(new java.awt.Dimension(650, 600));

        btnManageSuppliers.setText("Manage Suppliers >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator's Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManageSuppliers)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(btnManageSuppliers)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
    ManageSuppliersJPanel ms = new ManageSuppliersJPanel(userProcessContainer, supplierDirectory);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
