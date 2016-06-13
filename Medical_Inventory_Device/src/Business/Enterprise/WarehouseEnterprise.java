/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Inventory.InventoryItemCatalog;
import Business.Organization.DoctorOrganization;
import Business.Organization.HelperOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseOrganization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class WarehouseEnterprise extends Enterprise{
private InventoryItemCatalog inventoryItemCatalog;
    
    public WarehouseEnterprise(String name, EnterpriseType type) {
        super(name, EnterpriseType.Warehouse);
        inventoryItemCatalog=new InventoryItemCatalog();
    }

    public InventoryItemCatalog getInventoryItemCatalog() {
        return inventoryItemCatalog;
    }

    public void setInventoryItemCatalog(InventoryItemCatalog inventoryItemCatalog) {
        this.inventoryItemCatalog = inventoryItemCatalog;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public ArrayList<Organization> getSupportedOrgnization() {
        ArrayList<Organization> org = new ArrayList<>();
        org.add(new WarehouseOrganization());
        return org;
    }
    
}
