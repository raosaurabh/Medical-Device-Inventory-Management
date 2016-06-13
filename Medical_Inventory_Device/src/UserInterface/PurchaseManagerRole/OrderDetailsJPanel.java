/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PurchaseManagerRole;

import Business.EcoSystem;
import Business.Order.MasterOrderCatalog;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class OrderDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private MasterOrderCatalog moc;
    private UserAccount useraccount;

    public OrderDetailsJPanel(JPanel upc, EcoSystem b, MasterOrderCatalog moc, UserAccount ua) {
        initComponents();
        userProcessContainer = upc;
        business = b;
        this.moc = moc;
        this.useraccount = ua;
        populateOrderTable();
    }

    public void populateOrderTable() {

        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
        dtm.setRowCount(0);

        for (Order o : moc.getMasterorderatalog()) {
            Object row[] = new Object[2];

            if (o.getEmployeeId() == useraccount.getEmployee().getId()) {

                row[0] = o;
                dtm.addRow(row);
            }

        }

    }

    public void populateItemsTable() {
        int selectedrow = orderTable.getSelectedRow();
        Order o = (Order) orderTable.getValueAt(selectedrow, 0);
        if (selectedrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        DefaultTableModel dtm = (DefaultTableModel) itemsTable.getModel();
        dtm.setRowCount(0);

        for (OrderItem oi : o.getOrderlist()) {

            Object row[] = new Object[3];
            row[0] = oi.getProductItem().getProductName();
            row[1] = oi.getProductItem().getModelNumber();
            row[2] = oi.getProductItem().getPrice();
            dtm.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        getDetailsBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Orderid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
        }

        getDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getDetailsBtn.setText("Get Details");
        getDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDetailsBtnActionPerformed(evt);
            }
        });

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ProductName", "Quantity", "UnitPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemsTable);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setText("<<Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Review Orders Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(getDetailsBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getDetailsBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDetailsBtnActionPerformed
        // TODO add your handling code here:
        populateItemsTable();
    }//GEN-LAST:event_getDetailsBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton getDetailsBtn;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
