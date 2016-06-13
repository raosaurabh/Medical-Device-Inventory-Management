/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Inventory.InventoryItem;
import Business.Inventory.MaintainenceHistoryCatalog;

/**
 *
 * @author Saurabh
 */
public class MaintainenceTestWorkRequest extends WorkRequest {

    private InventoryItem inventoryItem;
    private MaintainenceHistoryCatalog mhc;
    
    public MaintainenceTestWorkRequest(){
        mhc = new MaintainenceHistoryCatalog();
    }

    public MaintainenceHistoryCatalog getMhc() {
        return mhc;
    }

    public void setMhc(MaintainenceHistoryCatalog mhc) {
        this.mhc = mhc;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

}
