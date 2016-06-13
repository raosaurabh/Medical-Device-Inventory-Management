/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.FinanceManagerRole;
import Business.Role.HelperRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class FinanceOrganization extends Organization{

    public FinanceOrganization() {
        super(Organization.Type.Finance.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceManagerRole());
        return roles;
    }
    
    
    
}

