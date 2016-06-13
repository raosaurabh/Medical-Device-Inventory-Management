/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

public class Product {

    private static int count = 0;
    private String prodName;
    private int price;
    private int modelNumber;
    private int availability;
    private String manufactureDate;
    private int batteryBackupHours;
    private String barcodeId;
    private String batchId;
    private int warrantyMonths;
    private String category;
    private ArrayList<ProductItem> productitemlist;

    public Product() {
        count++;
        modelNumber = count;
        productitemlist = new ArrayList<>();
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getBatteryBackupHours() {
        return batteryBackupHours;
    }

    public void setBatteryBackupHours(int batteryBackupHours) {
        this.batteryBackupHours = batteryBackupHours;
    }

    public String getBarcodeId() {
        return barcodeId;
    }

    public void setBarcodeId(String barcodeId) {
        this.barcodeId = barcodeId;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    
    public ArrayList<ProductItem> getProductitemlist() {
        return productitemlist;
    }

    public void setProductitemlist(ArrayList<ProductItem> productitemlist) {
        this.productitemlist = productitemlist;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
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

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public ArrayList<ProductItem> additem(int availability) {
        for (int i = 0; i < availability; i++) {
            ProductItem productitem = new ProductItem();
            productitem.setModelNumber(modelNumber);
            productitem.setPrice(price);
            productitem.setProductName(prodName);
            productitemlist.add(productitem);
        }
        return productitemlist;
    }

    public void removeItem(ProductItem productItem) {
        productitemlist.remove(productItem);
    }

    @Override
    public String toString() {
        return prodName;
    }

}
