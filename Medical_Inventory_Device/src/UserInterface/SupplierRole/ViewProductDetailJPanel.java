/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */
package UserInterface.SupplierRole;

import Business.Enterprise.Product;
import Business.IntegerVerifier;
import Business.StringVerifier;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Product product;

    /**
     * Creates new form CreateProductJPanel
     */
    public ViewProductDetailJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        nameField.setText(p.getProdName());
        idField.setText(convertInteger(p.getModelNumber()));
        priceField.setText(convertInteger(p.getPrice()));
        dateJTxt.setText(p.getManufactureDate());
        backupJTxt.setText(convertInteger(p.getBatteryBackupHours()));
        barCodeJTxt.setText(p.getBarcodeId());
        batchidJTxt.setText(p.getBatchId());
        warrantyJTxt.setText(convertInteger(p.getWarrantyMonths()));
        categoryJTxt.setText(p.getCategory());
        InputVerifier integerverifier = new IntegerVerifier();
        InputVerifier stringverifier = new StringVerifier();
        nameField.setInputVerifier(stringverifier);
        priceField.setInputVerifier(integerverifier);
        dateJTxt.setInputVerifier(stringverifier);
        backupJTxt.setInputVerifier(integerverifier);
        barCodeJTxt.setInputVerifier(stringverifier);
        batchidJTxt.setInputVerifier(stringverifier);
        warrantyJTxt.setInputVerifier(integerverifier);
        categoryJTxt.setInputVerifier(stringverifier);
    }

    public static String convertInteger(int i) {
        return Integer.toString(i);
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
        nameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        dateJTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backupJTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        barCodeJTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        batchidJTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        warrantyJTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        categoryJTxt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        nameField.setEditable(false);
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 90, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        priceField.setEditable(false);
        priceField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 170, 200, -1));

        createButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createButton.setText("Update Product");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 176, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        idField.setEditable(false);
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 130, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        saveButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButton.setText("SAVE");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 70, 30));

        dateJTxt.setEditable(false);
        dateJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateJTxtActionPerformed(evt);
            }
        });
        add(dateJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Manufacture Date");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("BatteryBackupHours");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        backupJTxt.setEditable(false);
        backupJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupJTxtActionPerformed(evt);
            }
        });
        add(backupJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("BarcodeId");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        barCodeJTxt.setEditable(false);
        barCodeJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCodeJTxtActionPerformed(evt);
            }
        });
        add(barCodeJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("BatchId");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        batchidJTxt.setEditable(false);
        batchidJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchidJTxtActionPerformed(evt);
            }
        });
        add(batchidJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Warranty Months");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        warrantyJTxt.setEditable(false);
        warrantyJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warrantyJTxtActionPerformed(evt);
            }
        });
        add(warrantyJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Category");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        categoryJTxt.setEditable(false);
        categoryJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJTxtActionPerformed(evt);
            }
        });
        add(categoryJTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        nameField.setEditable(true);
        priceField.setEditable(true);
        saveButton.setEnabled(true);
        dateJTxt.setEditable(true);
        backupJTxt.setEditable(true);
        barCodeJTxt.setEditable(true);
        batchidJTxt.setEditable(true);
        warrantyJTxt.setEditable(true);
        categoryJTxt.setEditable(true);
}//GEN-LAST:event_createButtonActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (nameField.getText().length()>0|| priceField.getText().length()>0|| dateJTxt.getText().length()>0
                || backupJTxt.getText().length()>0|| barCodeJTxt.getText().length()>0|| batchidJTxt.getText().length()>0|| warrantyJTxt.getText().length()>0
                || categoryJTxt.getText().length()>0) {
            product.setPrice(Integer.parseInt(priceField.getText()));
            product.setProdName(nameField.getText());
            product.setManufactureDate(dateJTxt.getText());
            product.setBatteryBackupHours(Integer.parseInt(backupJTxt.getText()));
            product.setBarcodeId(barCodeJTxt.getText());
            product.setBatchId(batchidJTxt.getText());
            product.setWarrantyMonths(Integer.parseInt(warrantyJTxt.getText()));
            product.setCategory(categoryJTxt.getText());
        } else {
            JOptionPane.showMessageDialog(this, "The textbox cannot be blank ");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void dateJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateJTxtActionPerformed

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

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField warrantyJTxt;
    // End of variables declaration//GEN-END:variables
}
