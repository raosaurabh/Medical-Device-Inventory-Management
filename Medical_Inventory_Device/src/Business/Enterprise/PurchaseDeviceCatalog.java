/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class PurchaseDeviceCatalog {

    private ArrayList<PurchaseDevice> purchaseDeviceList;

    public PurchaseDeviceCatalog() {
        purchaseDeviceList = new ArrayList<>();
    }

    public ArrayList<PurchaseDevice> getPurchaseDeviceList() {
        return purchaseDeviceList;
    }

    public void setPurchaseDeviceList(ArrayList<PurchaseDevice> purchaseDeviceList) {
        this.purchaseDeviceList = purchaseDeviceList;
    }

    public PurchaseDevice addDevice() {
        PurchaseDevice pd = new PurchaseDevice();
        purchaseDeviceList.add(pd);
        return pd;
    }
}
