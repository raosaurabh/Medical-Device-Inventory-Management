/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.HelperOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.HelperRole.HelperWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Saurabh
 */
public class HelperRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        return new HelperWorkAreaJPanel(userProcessContainer, account, (HelperOrganization)organization,(HospitalEnterprise)enterprise,business);
    }
    
    
    
}
