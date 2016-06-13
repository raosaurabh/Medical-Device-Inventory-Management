/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Inventory.MaintainenceHistoryCatalog;
import Business.Network.Network;
import Business.Order.MasterOrderCatalog;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

public class EcoSystem extends Organization { // as we need the useraccount and all stuff for the system admin which is present in Organization

    private static EcoSystem business;
    private ArrayList<Network> networklist;
    private static MasterOrderCatalog masterordercatalog;
    public static FinalAssignmentCatalog fac;
    //private static MaintainenceHistoryCatalog mhc;

    public static EcoSystem getInstance() {

        if (business == null) {
            business = new EcoSystem();

        }
        return business;
    }
    

    public static MasterOrderCatalog getMasterOrderCatalog() {

        if (masterordercatalog == null) {
            masterordercatalog = new MasterOrderCatalog();

        }
        return masterordercatalog;
    }

    public static FinalAssignmentCatalog getFinalAssignmentCatalog() {

        if (fac == null) {
            fac = new FinalAssignmentCatalog();

        }
        return fac;
    }
    
    /*public static MaintainenceHistoryCatalog getMaintainenceHistoryCatalog() {

        if (mhc == null) {
            mhc = new MaintainenceHistoryCatalog();

        }
        return mhc;
    }*/
    
    public Network addNetwork() {

        Network nw = new Network();
        networklist.add(nw);
        return nw;
    }

    private EcoSystem() {

        super(null);
        networklist = new ArrayList<Network>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolelist = new ArrayList<Role>();
        rolelist.add(new SystemAdminRole());
        return rolelist;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public ArrayList<Network> getNetworklist() {
        return networklist;
    }

    public void setNetworklist(ArrayList<Network> networklist) {
        this.networklist = networklist;
    }

    public boolean checkifUsernameisUnique(String username) {
        if (!this.getUserAccountDirectory().checkifUsernameUnique(username)) {
            return false;
        }
        return true;
    }
}
