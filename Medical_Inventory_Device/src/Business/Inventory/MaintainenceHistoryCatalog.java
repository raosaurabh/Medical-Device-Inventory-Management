/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class MaintainenceHistoryCatalog {

    private InventoryItem inventoryItem;
    private ArrayList<InventoryItem> maintainenceList;

    public MaintainenceHistoryCatalog() {
        maintainenceList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getMaintainenceList() {
        return maintainenceList;
    }

    public void setMaintainenceList(ArrayList<InventoryItem> maintainenceList) {
        this.maintainenceList = maintainenceList;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    
    public void addInventoryItem(InventoryItem ii){
        maintainenceList.add(ii);
    }
}
