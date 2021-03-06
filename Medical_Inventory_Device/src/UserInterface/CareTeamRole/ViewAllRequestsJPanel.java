/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CareTeamRole;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Inventory.InventoryItemAssignment;
import Business.Organization.CareTeamOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganizationManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ViewAllRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CareTeamOrganization organization;
    private HospitalEnterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private int enterpriseId;

    public ViewAllRequestsJPanel(JPanel userProcessContainer, UserAccount account,
            CareTeamOrganization organization, HospitalEnterprise enterprise, EcoSystem system, int enterpriseId) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.enterpriseId = enterpriseId;

        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest workrequest : userAccount.getWorkQueue().getWorkRequestList()) {
            OrganizationManagerWorkRequest request = (OrganizationManagerWorkRequest) workrequest;
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getDoctorUserAccount() == null ? null : request.getDoctorUserAccount().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        forwardToMangerJBtn = new javax.swing.JButton();
        viewDetailsBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reservedItemsTbl = new javax.swing.JTable();
        scheduleRoom = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestDate", "Sender", "DoctorName", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("View Request Work Area");

        forwardToMangerJBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        forwardToMangerJBtn.setText("Forward to Organization Manager");
        forwardToMangerJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardToMangerJBtnActionPerformed(evt);
            }
        });

        viewDetailsBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });

        reservedItemsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Date", "Slot"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reservedItemsTbl);
        if (reservedItemsTbl.getColumnModel().getColumnCount() > 0) {
            reservedItemsTbl.getColumnModel().getColumn(0).setResizable(false);
            reservedItemsTbl.getColumnModel().getColumn(1).setResizable(false);
            reservedItemsTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        scheduleRoom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        scheduleRoom.setText("Schedule Rooms");
        scheduleRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleRoomActionPerformed(evt);
            }
        });

        backJBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backJBtn.setText("<< Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(viewDetailsBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(forwardToMangerJBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJBtn)
                                .addGap(76, 76, 76)
                                .addComponent(scheduleRoom)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(forwardToMangerJBtn)
                .addGap(28, 28, 28)
                .addComponent(viewDetailsBtn)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scheduleRoom)
                    .addComponent(backJBtn))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void forwardToMangerJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardToMangerJBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row in the table");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equalsIgnoreCase("Rejected") || omwr.getStatus().equalsIgnoreCase("  ")) {

            JOptionPane.showMessageDialog(this, "The request is not Approved by the Doctor");

        } else if (omwr.getStatus().equalsIgnoreCase("Reserved")) {

            JOptionPane.showMessageDialog(this, "The request is already completed and cannot be sent again");

        } else if (omwr.getStatus().equalsIgnoreCase("Pending for Equipments")) {

            JOptionPane.showMessageDialog(this, "The request is already sent to Organization Manager and cannot be sent again");
            
        } else if (omwr.getStatus().equalsIgnoreCase("Scheduling Completed")) {

            JOptionPane.showMessageDialog(this, "The request is already Scheduled so cannot be forwarded again");

        } else {
            omwr.setSender(userAccount);
            omwr.setStatus("Pending for Equipments");
            omwr.setRequestDate(new Date());
            omwr.setEnterpriseId(enterpriseId);
            for (UserAccount useraccount1 : system.getUserAccountDirectory().getUserAccountList()) {
                String roleName = useraccount1.getRole().toString();
                System.out.println("the role is" + roleName);
                if (roleName.equalsIgnoreCase("OrganizationManagerRole")) {
                    useraccount1.getWorkQueue().getWorkRequestList().add(omwr);
                }

            }
            System.out.println("Request sent to Organization Manager successfully");
        }
        populateRequestTable();
    }//GEN-LAST:event_forwardToMangerJBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equalsIgnoreCase("Reserved")) {
            DefaultTableModel model = (DefaultTableModel) reservedItemsTbl.getModel();
            model.setRowCount(0);
            for (InventoryItemAssignment itemAssignment : omwr.getInventoryItemAssignmentCatalog().getInventoryItemAssignmentList()) {
                Object row[] = new Object[3];
                row[0] = itemAssignment.getInventoryItem().getOrderitem().getProductItem().getProductName();
                row[1] = itemAssignment.getSchedule().getDate();
                row[2] = itemAssignment.getSchedule().getSlot();
                model.addRow(row);
            }

        }

    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void scheduleRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleRoomActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equalsIgnoreCase("Reserved")) {
            ScheduleRoomsJPanel srjp = new ScheduleRoomsJPanel(userProcessContainer, userAccount, organization, enterprise, system, enterpriseId, omwr);
            userProcessContainer.add("Select Room", srjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            System.out.println("Going for scheduling of rooms");
        } else {
            JOptionPane.showMessageDialog(this, "The Organization Manager has not approved the request!! Cannot proceed to Scheduling of rooms ");
        }

    }//GEN-LAST:event_scheduleRoomActionPerformed

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton forwardToMangerJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable reservedItemsTbl;
    private javax.swing.JButton scheduleRoom;
    private javax.swing.JButton viewDetailsBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
