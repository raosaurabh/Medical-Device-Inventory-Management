/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Order.Order;

/**
 *
 * @author Saurabh
 */
public class SupplierManagerTestWorkRequest extends WorkRequest{
    private Order order;
   private int treasuryMoney;
   private int supplierMoney;
   
   public SupplierManagerTestWorkRequest(){
       treasuryMoney = 10000;
   }

    public int getTreasuryMoney() {
        return treasuryMoney;
    }

    public void setTreasuryMoney(int treasuryMoney) {
        this.treasuryMoney = treasuryMoney;
    }

    public int getSupplierMoney() {
        return supplierMoney;
    }

    public void setSupplierMoney(int supplierMoney) {
        this.supplierMoney = supplierMoney;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    
    
}
