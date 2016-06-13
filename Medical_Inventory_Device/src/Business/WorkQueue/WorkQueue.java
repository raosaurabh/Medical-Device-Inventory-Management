/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ReceptionistTestWorkRequest addRequst() {
        ReceptionistTestWorkRequest rct = new ReceptionistTestWorkRequest();
        workRequestList.add(rct);
        return rct;
    }

    public OrganizationManagerTestWorkRequest_wrong addOMRequst() {
        OrganizationManagerTestWorkRequest_wrong oct = new OrganizationManagerTestWorkRequest_wrong();
        workRequestList.add(oct);
        return oct;
    }

    public OrganizationManagerWorkRequest addOrganizationRequest() {
        OrganizationManagerWorkRequest omwr = new OrganizationManagerWorkRequest();
        workRequestList.add(omwr);
        return omwr;
    }

    public PurchaseManagerTestWorkRequest addPurchaseRequest() {
        PurchaseManagerTestWorkRequest pmwr = new PurchaseManagerTestWorkRequest();
        workRequestList.add(pmwr);
        return pmwr;
    }
}
