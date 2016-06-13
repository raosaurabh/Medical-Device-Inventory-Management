/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;


public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriselist;
    
    public EnterpriseDirectory(){
        enterpriselist=new ArrayList<>();
        
    }

    public ArrayList<Enterprise> getEnterpriselist() {
        return enterpriselist;
    }

    public void setEnterpriselist(ArrayList<Enterprise> enterpriselist) {
        this.enterpriselist = enterpriselist;
    }
    
    public Enterprise createandAddEnterprise(String name , Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, type);
               enterpriselist.add(enterprise);
            
         
            
        }
        if(type == Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Warehouse){
            enterprise = new WarehouseEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
         if(type == Enterprise.EnterpriseType.Purchase){
            enterprise = new PurchaseEnterprise(name, type);
            enterpriselist.add(enterprise);
        }
        return enterprise;
    }
    
}
