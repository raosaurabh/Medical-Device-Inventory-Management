/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.InventoryItemCatalog;
import Business.Organization.CareTeamOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.HelperOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Patient.PatientCatalog;
import Business.Role.Role;
import java.util.ArrayList;

/**
 * -
 *
 * @author Saurabh
 */
public class HospitalEnterprise extends Enterprise {

    private PatientCatalog patientcatalog;
    private RoomCatalog roomCatalog;
    private InventoryItemCatalog inventoryCatalog;
    private int enterpriseid;
    private static int count = 1;

    public HospitalEnterprise(String name, EnterpriseType type) {

        super(name, EnterpriseType.Hospital);
        
        patientcatalog = new PatientCatalog();
        inventoryCatalog = new InventoryItemCatalog();
        roomCatalog = new RoomCatalog();
        enterpriseid = count;
        ++count;
    }

    public int getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(int enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Organization> getSupportedOrgnization() {
        ArrayList<Organization> org = new ArrayList<>();
        org.add(new DoctorOrganization());
        org.add(new HelperOrganization());
        org.add(new ReceptionistOrganization());
        org.add(new CareTeamOrganization());
        return org;
    }

    public InventoryItemCatalog getInventoryCatalog() {
        return inventoryCatalog;
    }

    public void setInventoryCatalog(InventoryItemCatalog inventoryCatalog) {
        this.inventoryCatalog = inventoryCatalog;
    }

    public PatientCatalog getPatientcatalog() {
        return patientcatalog;
    }

    public void setPatientcatalog(PatientCatalog patientcatalog) {
        this.patientcatalog = patientcatalog;
    }

    public RoomCatalog getRoomCatalog() {
        return roomCatalog;
    }

    public void setRoomCatalog(RoomCatalog roomCatalog) {
        this.roomCatalog = roomCatalog;
    }
    
    
}
