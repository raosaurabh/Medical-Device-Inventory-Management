/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Inventory;

import Business.Enterprise.Schedule;

/**
 *
 * @author Saurabh
 */
public class InventoryItemAssignment {
    
    private InventoryItem inventoryItem;
    private Schedule schedule;
    
    public InventoryItemAssignment(){
        schedule=new Schedule();
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    

    
}
