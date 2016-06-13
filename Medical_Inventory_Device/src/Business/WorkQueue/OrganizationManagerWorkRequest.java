/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.RequiredDeviceCatalog;
import Business.Inventory.InventoryItemAssignmentCatalog;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;

public class OrganizationManagerWorkRequest extends WorkRequest {

    private RequiredDeviceCatalog requireddeviceCatalog;
    private UserAccount doctorUserAccount;
    private Patient patient;
    private InventoryItemAssignmentCatalog inventoryItemAssignmentCatalog;
    private int enterpriseId;
    
    public OrganizationManagerWorkRequest() {
        requireddeviceCatalog = new RequiredDeviceCatalog();
        inventoryItemAssignmentCatalog = new InventoryItemAssignmentCatalog();
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public InventoryItemAssignmentCatalog getInventoryItemAssignmentCatalog() {
        return inventoryItemAssignmentCatalog;
    }

    public void setInventoryItemAssignmentCatalog(InventoryItemAssignmentCatalog inventoryItemAssignmentCatalog) {
        this.inventoryItemAssignmentCatalog = inventoryItemAssignmentCatalog;
    }
    
  
    public RequiredDeviceCatalog getRequireddeviceCatalog() {
        return requireddeviceCatalog;
    }

    public void setRequireddeviceCatalog(RequiredDeviceCatalog requireddeviceCatalog) {
        this.requireddeviceCatalog = requireddeviceCatalog;
    }

    public UserAccount getDoctorUserAccount() {
        return doctorUserAccount;
    }

    public void setDoctorUserAccount(UserAccount doctorUserAccount) {
        this.doctorUserAccount = doctorUserAccount;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return String.valueOf(super.getRequestDate());
    }
    
    
}
