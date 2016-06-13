/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Inventory;

import Business.Enterprise.Enterprise;
import Business.Order.OrderItem;


public class InventoryItem {
   private OrderItem orderitem ;
   private static int count =0;
   private int itemNumber;
   private int usageCounter;
   private String maintainenceStatus;
   private String maintainenceDate;
   private String logDate;
   private Enterprise enterprise;
   
   public InventoryItem(){
       count++;
       itemNumber=count;
       maintainenceStatus="Available";
       maintainenceDate = "default";
       logDate = "default";
   }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

   
    public String getLogDate() {
        return logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getMaintainenceDate() {
        return maintainenceDate;
    }

    public void setMaintainenceDate(String maintainenceDate) {
        this.maintainenceDate = maintainenceDate;
    }

   
   
    public String getMaintainenceStatus() {
        return maintainenceStatus;
    }

    public void setMaintainenceStatus(String maintainenceStatus) {
        this.maintainenceStatus = maintainenceStatus;
    }

   
    public int getUsageCounter() {
        return usageCounter;
    }

    public void setUsageCounter(int usageCounter) {
        this.usageCounter = usageCounter;
    }

   
    public OrderItem getOrderitem() {
        return orderitem;
    }

    public void setOrderitem(OrderItem orderitem) {
        this.orderitem = orderitem;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
   
   public void incrementUsageCounter(){
            usageCounter++;    
   }

    @Override
    public String toString() {
        return orderitem.getProductItem().getProductName();
    }
   
}
