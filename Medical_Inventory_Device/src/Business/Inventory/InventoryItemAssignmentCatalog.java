/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. */


package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class InventoryItemAssignmentCatalog {
    
    private ArrayList<InventoryItemAssignment> inventoryItemAssignmentList;
    private String status;
    
    public InventoryItemAssignmentCatalog(){
        inventoryItemAssignmentList=new ArrayList<>();
                status = "Available";
    }

    public ArrayList<InventoryItemAssignment> getInventoryItemAssignmentList() {
        return inventoryItemAssignmentList;
    }

    public void setInventoryItemAssignmentList(ArrayList<InventoryItemAssignment> inventoryItemAssignmentList) {
        this.inventoryItemAssignmentList = inventoryItemAssignmentList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public InventoryItemAssignment addInventoryItemAssignment(){
        InventoryItemAssignment itemAssignment= new InventoryItemAssignment();
        inventoryItemAssignmentList.add(itemAssignment);
        return itemAssignment;
    }
    
    
}
