/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.PurchaseDeviceCatalog;
import Business.Network.Network;

public class PurchaseManagerTestWorkRequest extends WorkRequest {
private int enterpriID;
private Network network;
private PurchaseDeviceCatalog purchaseDeviceCatalog;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }



    public PurchaseManagerTestWorkRequest() {
        purchaseDeviceCatalog = new PurchaseDeviceCatalog();
    }

    public PurchaseDeviceCatalog getPurchaseDeviceCatalog() {
        return purchaseDeviceCatalog;
    }

    public void setPurchaseDeviceCatalog(PurchaseDeviceCatalog purchaseDeviceCatalog) {
        this.purchaseDeviceCatalog = purchaseDeviceCatalog;
    }

    public int getEnterpriID() {
        return enterpriID;
    }

    public void setEnterpriID(int enterpriID) {
        this.enterpriID = enterpriID;
    }

    
    @Override
    public String toString() {
        return String.valueOf(super.getRequestDate());
    }

}
