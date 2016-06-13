/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

public class InventoryItemCatalog {

    private ArrayList<InventoryItem> inventoryItemList;

    public InventoryItemCatalog() {
        inventoryItemList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(ArrayList<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

    public void removeInventoryItem(InventoryItem i) {
        inventoryItemList.remove(i);

    }

    public InventoryItem addInventoryitem() {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItemList.add(inventoryItem);
        return inventoryItem;
    }

    public void addHospitalInventoryItem(InventoryItem inventoryItem) {
        inventoryItemList.add(inventoryItem);
    }

}
