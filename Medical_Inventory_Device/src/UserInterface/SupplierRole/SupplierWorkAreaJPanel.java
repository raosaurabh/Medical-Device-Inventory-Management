/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.SupplierRole;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount useraccount;
    private EcoSystem business;
    private SupplierOrganization supplierOrganization;
    private SupplierEnterprise supplierenterprise;

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    public SupplierWorkAreaJPanel(JPanel upc, SupplierOrganization supplierOrganization, EcoSystem b, UserAccount ua, SupplierEnterprise enterprise) {

        initComponents();
        userProcessContainer = upc;
        this.useraccount = ua;
        this.business = b;
        this.supplierOrganization = supplierOrganization;
        this.supplierenterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();
        checkPaymentBtn = new javax.swing.JButton();
        checkMaintainenceBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Product Manager Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        managePButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        managePButton.setText("Manage Product Catalog >>");
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 140, 300, -1));

        checkPaymentBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkPaymentBtn.setText("Check Payment Request >>");
        checkPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPaymentBtnActionPerformed(evt);
            }
        });
        add(checkPaymentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 300, 30));

        checkMaintainenceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkMaintainenceBtn.setText("Check Maintainence Request >>");
        checkMaintainenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMaintainenceBtnActionPerformed(evt);
            }
        });
        add(checkMaintainenceBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 300, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed
        // TODO add your handling code here:
        Employee employee = useraccount.getEmployee();
        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplierenterprise, business, supplierOrganization);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    
    }//GEN-LAST:event_managePButtonActionPerformed
               
        

    private void checkPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPaymentBtnActionPerformed
        /* ApprovalStatusJPanel apst = new ApprovalStatusJPanel(userProcessContainer, useraccount, moc, business);
         userProcessContainer.add("ApprovalStatusJPanel", apst);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         layout.next(userProcessContainer);*/

        SendPaymentRequestJPanel spr = new SendPaymentRequestJPanel(userProcessContainer, useraccount, supplierenterprise, business, supplierOrganization);
        userProcessContainer.add("SendPaymentRequest", spr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_checkPaymentBtnActionPerformed

    private void checkMaintainenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMaintainenceBtnActionPerformed
        MaintainenceRequestJPanel mrp = new MaintainenceRequestJPanel(userProcessContainer, useraccount, supplierenterprise, business, supplierOrganization);
        userProcessContainer.add("maintainenceRequest", mrp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkMaintainenceBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkMaintainenceBtn;
    private javax.swing.JButton checkPaymentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
}