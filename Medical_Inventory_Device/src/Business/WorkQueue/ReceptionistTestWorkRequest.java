/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Surgery;


public class ReceptionistTestWorkRequest extends WorkRequest{
    
    private String preferredDate;
    private String surgery;
    private Patient patient;
    private int enterpriseId;
    
    public ReceptionistTestWorkRequest(){
        
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(String preferredDate) {
        this.preferredDate = preferredDate;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    @Override
    public String toString() {
        return  surgery ;
    }

    
    
    
}
