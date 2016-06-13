/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.RoomAssignment;
import Business.Inventory.InventoryItemAssignmentCatalog;
import Business.Patient.Patient;

/**
 *
 * @author Saurabh
 */
public class FinalAssignment {

    private InventoryItemAssignmentCatalog inventoryItemAssignmentcatalog;
    private RoomAssignment roomAssignment;
    private Employee doctor;
    private Employee helper;
    private Patient patient;
    private static int count = 0;
    private int operationId;
    private String status;
    private HospitalEnterprise hospitalEnterprise;

    public FinalAssignment() {
        count++;
        operationId = count;
        roomAssignment = new RoomAssignment();
        inventoryItemAssignmentcatalog= new InventoryItemAssignmentCatalog();
        status = "Available";
    }

    public HospitalEnterprise getHospitalEnterprise() {
        return hospitalEnterprise;
    }

    public void setHospitalEnterprise(HospitalEnterprise hospitalEnterprise) {
        this.hospitalEnterprise = hospitalEnterprise;
    }

    
    public InventoryItemAssignmentCatalog getInventoryItemAssignmentcatalog() {
        return inventoryItemAssignmentcatalog;
    }

    public void setInventoryItemAssignmentcatalog(InventoryItemAssignmentCatalog inventoryItemAssignmentcatalog) {
        this.inventoryItemAssignmentcatalog = inventoryItemAssignmentcatalog;
    }

    public RoomAssignment getRoomAssignment() {
        return roomAssignment;
    }

    public void setRoomAssignment(RoomAssignment roomAssignment) {
        this.roomAssignment = roomAssignment;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public Employee getHelper() {
        return helper;
    }

    public void setHelper(Employee helper) {
        this.helper = helper;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public static int getCount() {
        return count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static void setCount(int count) {
        FinalAssignment.count = count;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Override
    public String toString() {
        return patient.getPatientName();
    }
    
    
}
