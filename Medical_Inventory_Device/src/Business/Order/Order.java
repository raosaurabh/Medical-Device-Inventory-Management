/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Enterprise.Product;
import Business.Enterprise.ProductItem;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class Order {

    private ArrayList<OrderItem> orderlist;
    private static int count;
    private int orderid;
    private int employeeId;
    //private String status="Pending";
    private WorkRequest wr;

    public Order() {

        count++;
        orderid = count;
        orderlist = new ArrayList();
    }

    /* public String getStatus() {
     return status;
     }
     public void setStatus(String status) {
     this.status = status;
     }*/
    public WorkRequest getWr() {
        return wr;
    }

    public void setWr(WorkRequest wr) {
        this.wr = wr;
    }

    public int getOrderid() {
        return orderid;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public ArrayList<OrderItem> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<OrderItem> orderlist) {
        this.orderlist = orderlist;
    }

    public ArrayList<OrderItem> addOrderItem(Product p, int quantity) {
        int count = 0;
        for (ProductItem productitem : p.getProductitemlist()) { // adds the productitems to order
            if (count < quantity) {
                OrderItem oi = new OrderItem();
                oi.setProductItem(productitem);
                orderlist.add(oi);
                count++;
            }

        }

        return orderlist;

    }

    public void removeOrderItem(OrderItem oi) {

        orderlist.remove(oi);
    }

    @Override
    public String toString() {
        return String.valueOf(orderid);
    }

}
