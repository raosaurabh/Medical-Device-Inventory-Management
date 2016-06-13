/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

/**
 *
 * @author Saurabh
 */
public class ProductItem {
    private int modelNumber;
    private int serialNumber;
    private static int scount;
    private String productName;
    private int price;
    
    public ProductItem(){
        scount++;
        serialNumber=scount;             
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return productName ;
    }
    
    
    
    
    
    
    
}
