/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

public class MasterOrderCatalog {

    private ArrayList<Order> masterorderatalog;

    public MasterOrderCatalog() {

        masterorderatalog = new ArrayList();

    }

    public ArrayList<Order> getMasterorderatalog() {
        return masterorderatalog;
    }

    public void setMasterorderatalog(ArrayList<Order> masterorderatalog) {
        this.masterorderatalog = masterorderatalog;
    }

    public Order addOrder(Order o) {

        masterorderatalog.add(o);
        return o;

    }

}
