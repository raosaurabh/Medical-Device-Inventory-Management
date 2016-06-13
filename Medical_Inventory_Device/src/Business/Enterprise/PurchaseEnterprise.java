/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Organization.DoctorOrganization;
import Business.Organization.HelperOrganization;
import Business.Organization.Organization;
import Business.Organization.PurchaseOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class PurchaseEnterprise extends Enterprise {

    public PurchaseEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.Purchase);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Organization> getSupportedOrgnization() {
        ArrayList<Organization> org = new ArrayList<>();
        org.add(new PurchaseOrganization());
        return org;
    }

    
    
    
}
