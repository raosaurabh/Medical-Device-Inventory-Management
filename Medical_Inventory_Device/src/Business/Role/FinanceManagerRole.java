/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PurchaseEnterprise;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FinanceManagerRole.FinanceManagerWorkAreaJPanel;
import UserInterface.OrganizationManagerRole.OrganizationManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class FinanceManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem system) {
        return new FinanceManagerWorkAreaJPanel(userProcessContainer, account,(FinanceOrganization)organization,(PurchaseEnterprise)enterprise,system);
    }
    
    
}
