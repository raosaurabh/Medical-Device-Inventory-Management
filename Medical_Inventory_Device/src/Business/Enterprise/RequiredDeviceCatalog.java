/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;


public class RequiredDeviceCatalog {
    
    private ArrayList<RequiredDevice> requiredDeviceList;
    
    public RequiredDeviceCatalog(){
        requiredDeviceList = new ArrayList<>();
    }

    public ArrayList<RequiredDevice> getRequiredDeviceList() {
        return requiredDeviceList;
    }

    public void setRequiredDeviceList(ArrayList<RequiredDevice> requiredDeviceList) {
        this.requiredDeviceList = requiredDeviceList;
    }
    
    public RequiredDevice addDevice(){
        RequiredDevice rd = new RequiredDevice();
        requiredDeviceList.add(rd);
        return rd;
    }
    
}
