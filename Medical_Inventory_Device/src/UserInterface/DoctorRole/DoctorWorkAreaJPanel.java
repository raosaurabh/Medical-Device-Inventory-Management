/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RequiredDevice;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrganizationManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,
            DoctorOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        populateRequestTable();
        approveListBtn.setEnabled(false);
        rejectListBtn.setEnabled(false);
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest workrequest : organization.getWorkQueue().getWorkRequestList()) {
            OrganizationManagerWorkRequest request = (OrganizationManagerWorkRequest) workrequest;
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getDoctorUserAccount() == null ? null : request.getDoctorUserAccount().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        viewDevicesBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        deviceTbl = new javax.swing.JTable();
        approveListBtn = new javax.swing.JButton();
        rejectListBtn = new javax.swing.JButton();

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
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Doctor Work Area");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Assign to me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewDevicesBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewDevicesBtn.setText("View Devices List");
        viewDevicesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDevicesBtnActionPerformed(evt);
            }
        });

        deviceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DeviceName", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(deviceTbl);

        approveListBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        approveListBtn.setText("Approve List");
        approveListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveListBtnActionPerformed(evt);
            }
        });

        rejectListBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rejectListBtn.setText("Reject List");
        rejectListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(viewDevicesBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(approveListBtn)
                                .addGap(73, 73, 73)
                                .addComponent(rejectListBtn)))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(viewDevicesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveListBtn)
                    .addComponent(rejectListBtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Kindly Select a row in the table");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equals("Reserved")||omwr.getStatus().equalsIgnoreCase("Scheduling Completed")) {
            JOptionPane.showMessageDialog(this, "The request once reserved cannot be assigned again");
            
        } else if (omwr.getStatus().equals("Pending for Equipments")) {
            JOptionPane.showMessageDialog(this, "The request once completed cannot be assigned again");

        }else if (omwr.getStatus().equals("Approved")||omwr.getStatus().equals("Rejected")) {
            JOptionPane.showMessageDialog(this, "The request once Approved/Rejected cannot be assigned again");

        } else {
            omwr.setDoctorUserAccount(userAccount);
            omwr.setStatus("Assigned");
            populateRequestTable();
            System.out.println("The request assigned successfully by Doctor" +userAccount);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewDevicesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDevicesBtnActionPerformed
        // TODO add your handling code here
        populateProductTable();


    }//GEN-LAST:event_viewDevicesBtnActionPerformed

    private void approveListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveListBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equals("Reserved") || omwr.getStatus().equalsIgnoreCase("Rejected")) {
            JOptionPane.showMessageDialog(this, "Request cannot be approved again once rejected or Reserved");
        } else if (omwr.getStatus().equals("Pending for Equipments")) {
            JOptionPane.showMessageDialog(this, "Request cannot be approved again once completed");

        } else {
            omwr.setStatus("Approved");
            populateRequestTable();
            System.out.println("The list has been approved and sent back to careTeam");
        }


    }//GEN-LAST:event_approveListBtnActionPerformed

    private void rejectListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectListBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equals("Reserved") || omwr.getStatus().equalsIgnoreCase("Approved")) {
            JOptionPane.showMessageDialog(this, "Request cannot be rejected  once approved or Reserved");
        } else if (omwr.getStatus().equals("Pending for Equipments")) {
            JOptionPane.showMessageDialog(this, "Request cannot be approved again once completed");

        } else {
            omwr.setStatus("Rejected");
            populateRequestTable();
        }
    }//GEN-LAST:event_rejectListBtnActionPerformed

    public void populateProductTable() {
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        OrganizationManagerWorkRequest omwr = (OrganizationManagerWorkRequest) request;
        if (omwr.getStatus().equals("Assigned") || omwr.getStatus().equals("Reserved")
                || omwr.getStatus().equals("Approved") || omwr.getStatus().equals("Rejected")) {
            DefaultTableModel model = (DefaultTableModel) deviceTbl.getModel();
            model.setRowCount(0);
            for (RequiredDevice rd : omwr.getRequireddeviceCatalog().getRequiredDeviceList()) {
                Object[] row = new Object[2];
                row[0] = rd.getName();
                row[1] = rd.getQuantity();
                model.addRow(row);
            }
            approveListBtn.setEnabled(true);
            rejectListBtn.setEnabled(true);
        } else if (omwr.getStatus().equals("Pending for Approval")) {
            JOptionPane.showMessageDialog(this, "Please Assign the request and try Again");

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveListBtn;
    private javax.swing.JTable deviceTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton rejectListBtn;
    private javax.swing.JButton viewDevicesBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
