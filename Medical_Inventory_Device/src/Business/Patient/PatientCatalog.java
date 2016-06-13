/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

public class PatientCatalog {

    private ArrayList<Patient> patientCatalog;

    public PatientCatalog() {
        patientCatalog = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(ArrayList<Patient> patientCatalog) {
        this.patientCatalog = patientCatalog;
    }

    public Patient addPatient(){
        Patient patient = new Patient();
        patientCatalog.add(patient);
        return patient;
    }
}
