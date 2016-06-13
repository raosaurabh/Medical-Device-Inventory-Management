/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.CareTeamOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CareTeamRole.CareTeamWorkAreaJPanel;
import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;


public class CareTeamRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        return new CareTeamWorkAreaJPanel(userProcessContainer, account, (CareTeamOrganization)organization,(HospitalEnterprise)enterprise,business);
    }
    
}
