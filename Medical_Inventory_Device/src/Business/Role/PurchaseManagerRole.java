/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PurchaseEnterprise;
import Business.Organization.Organization;
import Business.Organization.PurchaseOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PurchaseManagerRole.PurchaseManagerWorkAreaJPanel;
import javax.swing.JPanel;


public class PurchaseManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PurchaseManagerWorkAreaJPanel(userProcessContainer, account, (PurchaseOrganization)organization,(PurchaseEnterprise)enterprise,business);
    }
    

}
