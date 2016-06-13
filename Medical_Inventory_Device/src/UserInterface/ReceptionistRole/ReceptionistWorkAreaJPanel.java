/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ReceptionistRole;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.HelperOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ReceptionistTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HospitalEnterprise hospitalEnterprise;
    private ReceptionistOrganization receptionistOrganization;
    private EcoSystem system;
    private UserAccount useraccount;

    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, ReceptionistOrganization receptionistOrganization,
            HospitalEnterprise hospitalEnterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.receptionistOrganization = receptionistOrganization;
        this.hospitalEnterprise = hospitalEnterprise;
        this.system = system;
        populateRequestTable();
        
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
        createNewRequestJBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewRequestsJTbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Receptionist Work Area");

        createNewRequestJBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createNewRequestJBtn.setText("Create New Request");
        createNewRequestJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewRequestJBtnActionPerformed(evt);
            }
        });

        viewRequestsJTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Surgery", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewRequestsJTbl);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(createNewRequestJBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(createNewRequestJBtn)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createNewRequestJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewRequestJBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("Creating a new request for CareTeam");
        CreateNewRequestJPanel cnjp = new CreateNewRequestJPanel(userProcessContainer, hospitalEnterprise, useraccount, system);
        userProcessContainer.add("createnewRequest", cnjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_createNewRequestJBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) viewRequestsJTbl.getModel();

        model.setRowCount(0);
        for (WorkRequest request : useraccount.getWorkQueue().getWorkRequestList()) {
            ReceptionistTestWorkRequest receptiontest = (ReceptionistTestWorkRequest) request;
            Object[] row = new Object[5];
            row[0] = receptiontest.getSender();
            row[1] = receptiontest.getReceiver();
            row[2] = receptiontest.getSurgery();
            row[3] = receptiontest.getStatus();
            row[4] = receptiontest.getPreferredDate();
            model.addRow(row);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewRequestJBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewRequestsJTbl;
    // End of variables declaration//GEN-END:variables
}