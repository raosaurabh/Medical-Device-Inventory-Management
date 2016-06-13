/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Room;
import Business.Inventory.InventoryItem;
import Business.Inventory.InventoryItemAssignment;
import Business.Inventory.InventoryItemAssignmentCatalog;
import java.util.ArrayList;

public class FinalAssignmentCatalog {

    private ArrayList<FinalAssignment> finalAssignmentList;
    InventoryItemAssignmentCatalog itemAssignmentCatalog;

    public FinalAssignmentCatalog() {
        finalAssignmentList = new ArrayList<FinalAssignment>();
    }

    public InventoryItemAssignmentCatalog getItemAssignmentCatalog() {
        return itemAssignmentCatalog;
    }

    public void setItemAssignmentCatalog(InventoryItemAssignmentCatalog itemAssignmentCatalog) {
        this.itemAssignmentCatalog = itemAssignmentCatalog;
    }

    public ArrayList<FinalAssignment> getFinalAssignmentList() {
        return finalAssignmentList;
    }

    public void setFinalAssignmentList(ArrayList<FinalAssignment> finalAssignmentList) {
        this.finalAssignmentList = finalAssignmentList;
    }

    public FinalAssignment addAssignment() {
        FinalAssignment fa = new FinalAssignment();
        finalAssignmentList.add(fa);
        return fa;
    }

    public boolean verifyRoomAvailability(Room room, String date, String slot) {
        boolean flag = false;
        for (FinalAssignment fa : finalAssignmentList) {

            if (fa.getRoomAssignment().getRoom().getRoomnumber() == room.getRoomnumber()
                    && fa.getRoomAssignment().getRoomschedule().getDate().equalsIgnoreCase(date)
                    && fa.getRoomAssignment().getRoomschedule().getSlot().equals(slot)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean verifyItemAvailability(InventoryItem inventoryItem, String date, String slot) {
        boolean flag = false;
        for (FinalAssignment fa : finalAssignmentList) {
            if (fa.getStatus().equalsIgnoreCase("Available")) {
                for (InventoryItemAssignment itemAssignment : fa.getInventoryItemAssignmentcatalog().getInventoryItemAssignmentList()) {
                    if (itemAssignment.getInventoryItem().getItemNumber() == inventoryItem.getItemNumber()
                            && itemAssignment.getSchedule().getDate().equalsIgnoreCase(date)
                            && itemAssignment.getSchedule().getSlot().equalsIgnoreCase(slot)) {
                        flag = true;
                        break;
                    }
                }
            }

            return flag;

        }
        return flag;
    }

}
