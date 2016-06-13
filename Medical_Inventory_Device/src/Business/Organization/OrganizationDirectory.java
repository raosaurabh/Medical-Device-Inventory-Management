/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Supplier.getValue())) {
            organization = new SupplierOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Helper.getValue())) {
            organization = new HelperOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Warehouse.getValue())) {
            organization = new WarehouseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Purchase.getValue())) {
            organization = new PurchaseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Receptionist.getValue())) {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CareTeam.getValue())) {
            organization = new CareTeamOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Finance.getValue())) {
            organization = new FinanceOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
