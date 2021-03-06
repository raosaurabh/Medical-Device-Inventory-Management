/*
 * CreateProductJPanel.java
 *
 *
 */
package UserInterface.SupplierRole;

import Business.Enterprise.Product;
import Business.Enterprise.ProductCatalog;
import Business.Enterprise.SupplierEnterprise;
import Business.IntegerVerifier;
import Business.StringVerifier;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    SupplierEnterprise supplierenterprise;
    JPanel userProcessContainer;
    ProductCatalog productcatalog;

    /**
     * Creates new form CreateProductJPanel
     */
    public CreateNewProductJPanel(JPanel userProcessContainer, ProductCatalog productcatalog) {
        initComponents();
        this.productcatalog = productcatalog;
        this.userProcessContainer = userProcessContainer;
        InputVerifier integerverifier = new IntegerVerifier();
        InputVerifier stringverifier = new StringVerifier();
        nameField1.setInputVerifier(stringverifier);
        priceField.setInputVerifier(integerverifier);
        availabilityJTextField.setInputVerifier(integerverifier);
        dateJTxt.setInputVerifier(stringverifier);
        backupJTxt.setInputVerifier(integerverifier);
        barCodeJTxt.setInputVerifier(stringverifier);
        batchidJTxt.setInputVerifier(stringverifier);
        warrantyJTxt.setInputVerifier(integerverifier);
        categoryJTxt.setInputVerifier(stringverifier);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availabilityJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backupJTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        barCodeJTxt = new javax.swing.JTextField();
        batchidJTxt = new javax.swing.JTextField();
        warrantyJTxt = new javax.swing.JTextField();
        categoryJTxt = new javax.swing.JTextField();
        dateJTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        idField.setEditable(false);
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 110, 30));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 210, 20));

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Add Product >>");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));
        add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 210, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Availability");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        availabilityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityJTextFieldActionPerformed(evt);
            }
        });
        add(availabilityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Manufacture Date");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 30));

        backupJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupJTxtActionPerformed(evt);
            }
        });
        add(backupJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("BarcodeId");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("BatchId");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Warranty Months");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("BatteryBackupHours");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Category");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        barCodeJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCodeJTxtActionPerformed(evt);
            }
        });
        add(barCodeJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 210, -1));

        batchidJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchidJTxtActionPerformed(evt);
            }
        });
        add(batchidJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 210, -1));

        warrantyJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyJTxtActionPerformed(evt);
            }
        });
        add(warrantyJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 210, -1));

        categoryJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJTxtActionPerformed(evt);
            }
        });
        add(categoryJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 210, -1));

        dateJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateJTxtActionPerformed(evt);
            }
        });
        add(dateJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 210, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:

        if (nameField1.getText().length() > 0
                && priceField.getText().length() > 0
                && availabilityJTextField.getText().length() > 0
                && dateJTxt.getText().length() > 0
                && backupJTxt.getText().length() > 0
                && barCodeJTxt.getText().length() > 0
                && batchidJTxt.getText().length() > 0
                && warrantyJTxt.getText().length() > 0
                && categoryJTxt.getText().length() > 0) {
            //Do Nothing
        } else {
            JOptionPane.showMessageDialog(this, "The textbox cannot be blank ");
            return;
        }

        Product product = productcatalog.addProduct();
        product.setProdName(nameField1.getText());
        String stringPrice = priceField.getText();
        if (stringPrice.isEmpty() == false) {
            int price = Integer.parseInt(stringPrice);
            product.setPrice(price);
        }
        int availability = Integer.parseInt(availabilityJTextField.getText());
        product.setAvailability(availability);
        product.additem(availability);
        product.setManufactureDate(dateJTxt.getText());
        product.setBatteryBackupHours(Integer.parseInt(backupJTxt.getText()));
        product.setBarcodeId(barCodeJTxt.getText());
        product.setBatchId(batchidJTxt.getText());
        product.setWarrantyMonths(Integer.parseInt(warrantyJTxt.getText()));
        product.setCategory(categoryJTxt.getText());

        System.out.println("New product " +nameField1.getText() + "added successfully");
        nameField1.setText("");
        priceField.setText("");
        availabilityJTextField.setText("");
        dateJTxt.setText("");
        backupJTxt.setText("");
        barCodeJTxt.setText("");
        batchidJTxt.setText("");
        warrantyJTxt.setText("");
        categoryJTxt.setText("");

}//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_backButton1ActionPerformed

    private void availabilityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabilityJTextFieldActionPerformed

    private void backupJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backupJTxtActionPerformed

    private void barCodeJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCodeJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barCodeJTxtActionPerformed

    private void batchidJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchidJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchidJTxtActionPerformed

    private void warrantyJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warrantyJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warrantyJTxtActionPerformed

    private void categoryJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryJTxtActionPerformed

    private void dateJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateJTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityJTextField;
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField backupJTxt;
    private javax.swing.JTextField barCodeJTxt;
    private javax.swing.JTextField batchidJTxt;
    private javax.swing.JTextField categoryJTxt;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dateJTxt;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField warrantyJTxt;
    // End of variables declaration//GEN-END:variables
}
