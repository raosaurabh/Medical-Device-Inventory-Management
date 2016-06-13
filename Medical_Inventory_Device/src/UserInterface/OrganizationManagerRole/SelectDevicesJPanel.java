/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.OrganizationManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.WarehouseEnterprise;
import Business.FinalAssignmentCatalog;
import Business.Inventory.InventoryItem;
import Business.Inventory.InventoryItemAssignment;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganizationManagerWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author hp
 */
public class SelectDevicesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount useraccount;
    OrganizationManagerWorkRequest omwr;
    FinalAssignmentCatalog fac;

    public SelectDevicesJPanel(EcoSystem system, UserAccount useraccount, JPanel userProcessContainer, OrganizationManagerWorkRequest omwr) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.system = system;
        this.omwr = omwr;
        fac = EcoSystem.getFinalAssignmentCatalog();
//        populateProductTable();
        populatePreferredDate();
        populateSlots();
        populateNetworkComboBox();
        DefaultTableModel model = (DefaultTableModel) reserveJTable.getModel();
        model.setRowCount(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        slotCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        networkCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        enterpriseCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        reserveJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        inventoryJTable = new javax.swing.JTable();
        reserveJBtn = new javax.swing.JButton();
        createPurchase = new javax.swing.JButton();
        ackJBtn = new javax.swing.JButton();
        careTeamAckCombo = new javax.swing.JComboBox();
        viewUsageJBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select Devices For Surgery");

        jLabel2.setText("Select Date");

        dateCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateComboActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Slot");

        slotCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotComboActionPerformed(evt);
            }
        });

        jLabel5.setText("Select Network");

        networkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboActionPerformed(evt);
            }
        });

        jLabel6.setText("Select Enterprise");

        enterpriseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboActionPerformed(evt);
            }
        });

        reserveJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Model Number", "Serial Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reserveJTable);
        if (reserveJTable.getColumnModel().getColumnCount() > 0) {
            reserveJTable.getColumnModel().getColumn(0).setResizable(false);
            reserveJTable.getColumnModel().getColumn(1).setResizable(false);
            reserveJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ProductName", "ModelNumber", "SerialNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(inventoryJTable);
        if (inventoryJTable.getColumnModel().getColumnCount() > 0) {
            inventoryJTable.getColumnModel().getColumn(0).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(1).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        reserveJBtn.setText("Reserve");
        reserveJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveJBtnActionPerformed(evt);
            }
        });

        createPurchase.setText("Create Purchase Request");
        createPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPurchaseActionPerformed(evt);
            }
        });

        ackJBtn.setText("Send Acknowledgement to CareTeam");
        ackJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ackJBtnActionPerformed(evt);
            }
        });

        careTeamAckCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reserved", "Request on Hold" }));
        careTeamAckCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careTeamAckComboActionPerformed(evt);
            }
        });

        viewUsageJBtn.setText("View Usage");
        viewUsageJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsageJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(careTeamAckCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(ackJBtn)
                .addGap(45, 45, 45)
                .addComponent(createPurchase)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(viewUsageJBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateCombo, 0, 158, Short.MAX_VALUE)
                                .addComponent(slotCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(networkCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(reserveJBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(slotCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterpriseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(reserveJBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ackJBtn)
                    .addComponent(careTeamAckCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPurchase))
                .addGap(35, 35, 35)
                .addComponent(viewUsageJBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkCombo.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);

        }
    }//GEN-LAST:event_networkComboActionPerformed

    private void reserveJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveJBtnActionPerformed
        String date = (String) dateCombo.getSelectedItem();
        String slot = (String) slotCombo.getSelectedItem();
        int selectedRow = inventoryJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
            return;
        }
        InventoryItem inventoryItem = (InventoryItem) inventoryJTable.getValueAt(selectedRow, 0);
        if(inventoryItem.getMaintainenceStatus().equalsIgnoreCase("Under Maintainence")){
            JOptionPane.showMessageDialog(this, "The selected Device is under maintainence and so cannot be reserved");
        }else if(inventoryItem.getMaintainenceDate().equals(date)){
            JOptionPane.showMessageDialog(this, "The selected Device is under scheduled maintainence on this date and so cannot be reserved");
        }
        else{
        InventoryItemAssignment itemAssignment = omwr.getInventoryItemAssignmentCatalog().addInventoryItemAssignment();
        itemAssignment.setInventoryItem(inventoryItem);
        itemAssignment.getSchedule().setDate(date);
        itemAssignment.getSchedule().setSlot(slot);
      //  itemAssignment.getInventoryItem().setEnterprise((Enterprise)enterpriseCombo.getSelectedItem());
        populateReserveItemsTable();
        populateItemInventoryTable();
            System.out.println(inventoryItem+ "added to the AsignmentList successfully");
        }
    }//GEN-LAST:event_reserveJBtnActionPerformed

    private void ackJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ackJBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) reserveJTable.getModel();
        int rowCount = model.getRowCount();
      if(rowCount>0)  {
        String value = (String) careTeamAckCombo.getSelectedItem();

        if (value.equalsIgnoreCase("Reserved")) {
            if (omwr.getStatus().equalsIgnoreCase("Request on Hold")) {
                JOptionPane.showMessageDialog(this, "The request  cannot be set again");
            } else {
                omwr.setStatus("Reserved");
                System.out.println("The items have been reserved and acknowledged to care team");
                        
            }
        }
        else if (value.equalsIgnoreCase("Request on Hold")) {
             if (omwr.getStatus().equalsIgnoreCase("Reserved")) {
                JOptionPane.showMessageDialog(this, "The request  cannot be set again");
            } else {
               omwr.setStatus("Request on Hold");
            }
            
        }
      } else{
          JOptionPane.showMessageDialog(this, "You need to Reserve an item before Acknowledging to care Team");
      }
    }//GEN-LAST:event_ackJBtnActionPerformed

    private void createPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPurchaseActionPerformed
        Network n = (Network) networkCombo.getSelectedItem();

        int enterpriseId = omwr.getEnterpriseId();
        CreatePurchaseRequestJPanel cprj = new CreatePurchaseRequestJPanel(userProcessContainer, useraccount, system, n, enterpriseId);
        userProcessContainer.add("CreatePurchase", cprj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        System.out.println("Creating purchase request");
    }//GEN-LAST:event_createPurchaseActionPerformed

    private void enterpriseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboActionPerformed
        populateItemInventoryTable();
    }//GEN-LAST:event_enterpriseComboActionPerformed

    private void slotComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotComboActionPerformed

    }//GEN-LAST:event_slotComboActionPerformed

    private void dateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateComboActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_dateComboActionPerformed

    private void viewUsageJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsageJBtnActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        HospitalEnterprise he = null;
        try {
            Enterprise e = (Enterprise) enterpriseCombo.getSelectedItem();
            if (e.getEnterprisetype().getValue().equals(Enterprise.EnterpriseType.Hospital.getValue())) {
                he = (HospitalEnterprise) e;
            }

            int x = 0; //to resolve issue of same name in graph
            for (InventoryItem inventoryItem : he.getInventoryCatalog().getInventoryItemList()) {
                int usageQuantity = inventoryItem.getUsageCounter();
                x++;
                dcd.addValue(usageQuantity, "Value", inventoryItem.getOrderitem().getProductItem().getProductName() + String.valueOf(x));
                //dcd.setValue(usageQuantity, "Value", inventoryItem.getOrderitem().getProductItem().getProductName());
            }
            JFreeChart chart = ChartFactory.createBarChart("UsageChart", "Quantity", "Values", dcd, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot barchart = chart.getCategoryPlot();
            barchart.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Bar chart for Usage", chart);
            frame.setVisible(true);
            frame.setSize(450, 350);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "feature only for Hospital Enterprise");
        }
    }//GEN-LAST:event_viewUsageJBtnActionPerformed

    private void careTeamAckComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careTeamAckComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_careTeamAckComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ackJBtn;
    private javax.swing.JComboBox careTeamAckCombo;
    private javax.swing.JButton createPurchase;
    private javax.swing.JComboBox dateCombo;
    private javax.swing.JComboBox enterpriseCombo;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox networkCombo;
    private javax.swing.JButton reserveJBtn;
    private javax.swing.JTable reserveJTable;
    private javax.swing.JComboBox slotCombo;
    private javax.swing.JButton viewUsageJBtn;
    // End of variables declaration//GEN-END:variables

    private void populatePreferredDate() {
        dateCombo.removeAllItems();
        String preferredDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        for (int i = 2; i < 60; i++) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar calender = Calendar.getInstance();
            calender.add(Calendar.DATE, i); // it gives  the number of days we need to add
            preferredDate = dateFormat.format(calender.getTime());
            dateCombo.addItem(preferredDate);
        }
    }

    private void populateSlots() {
        int startTime = 0;
        for (int i = 0; i < 6; i++) {
            int endTime = startTime + 4;
            String slot = String.valueOf(startTime) + "-" + String.valueOf(endTime);
            startTime = endTime;
            slotCombo.addItem(slot);

        }
    }

    private void populateNetworkComboBox() {
        System.out.println("inside network combo");
        networkCombo.removeAllItems();
        for (Network network : system.getNetworklist()) {
            networkCombo.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriselist()) {
            System.out.println("Inside enterprise loop");
            if (enterprise.getEnterprisetype().getValue().equalsIgnoreCase(Enterprise.EnterpriseType.Hospital.getValue())
                    || (enterprise.getEnterprisetype().getValue().equalsIgnoreCase(Enterprise.EnterpriseType.Warehouse.getValue()))) {
                enterpriseCombo.addItem(enterprise);

            }
        }
        System.out.println("out of for loop");
    }

    private void populateItemInventoryTable() {
        DefaultTableModel model = (DefaultTableModel) inventoryJTable.getModel();
        model.setRowCount(0);
        System.out.println("inside populate inventory");
        boolean flag1;
        boolean flag;
        String date = (String) dateCombo.getSelectedItem();
        String slot = (String) slotCombo.getSelectedItem();
        Enterprise enterprise = (Enterprise) enterpriseCombo.getSelectedItem();
        if (enterprise.getEnterprisetype().getValue().equalsIgnoreCase(Enterprise.EnterpriseType.Hospital.getValue())) {
            HospitalEnterprise hosptalEnterprise = (HospitalEnterprise) enterprise;
            System.out.println("hospital ent selected");
            for (InventoryItem inventoryItem : hosptalEnterprise.getInventoryCatalog().getInventoryItemList()) {
                flag1 = fac.verifyItemAvailability(inventoryItem, date, slot);
                if (flag1 == false) {

                    Object row[] = new Object[3];
                    row[0] = inventoryItem;
                    row[1] = inventoryItem.getOrderitem().getProductItem().getModelNumber();
                    row[2] = inventoryItem.getOrderitem().getProductItem().getSerialNumber();
                    model.addRow(row);
                }

            }
        }

        if (enterprise.getEnterprisetype().getValue().equalsIgnoreCase(Enterprise.EnterpriseType.Warehouse.getValue())) {
            WarehouseEnterprise warehouseEnterprise = (WarehouseEnterprise) enterprise;
            for (InventoryItem inventoryItem : warehouseEnterprise.getInventoryItemCatalog().getInventoryItemList()) {
                flag = fac.verifyItemAvailability(inventoryItem, date, slot);
                if (flag == false) {
                    Object row[] = new Object[3];
                    row[0] = inventoryItem;
                    row[1] = inventoryItem.getOrderitem().getProductItem().getModelNumber();
                    row[2] = inventoryItem.getOrderitem().getProductItem().getSerialNumber();
                    model.addRow(row);
                }
            }
        }

    }

    private void populateReserveItemsTable() {
        DefaultTableModel model = (DefaultTableModel) reserveJTable.getModel();
        model.setRowCount(0);
        for (InventoryItemAssignment itemAssignment : omwr.getInventoryItemAssignmentCatalog().getInventoryItemAssignmentList()) {
            Object row[] = new Object[3];
            row[0] = itemAssignment.getInventoryItem().getOrderitem().getProductItem().getProductName();
            row[1] = itemAssignment.getInventoryItem().getOrderitem().getProductItem().getModelNumber();
            row[2] = itemAssignment.getInventoryItem().getOrderitem().getProductItem().getSerialNumber();
            model.addRow(row);
        }

    }

}