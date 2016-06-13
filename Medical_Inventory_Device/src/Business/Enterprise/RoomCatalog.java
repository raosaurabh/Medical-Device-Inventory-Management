/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

public class RoomCatalog {

    private ArrayList<Room> roomCatalog;

    public RoomCatalog() {
        roomCatalog = new ArrayList<>();
    }

    public void addRoom() {
        for (int i = 0; i < 10; i++) {
            Room room = new Room();
            roomCatalog.add(room);
        }
     
    }

    
    public ArrayList<Room> getRoomCatalog() {
        return roomCatalog;
    }

    public void setRoomCatalog(ArrayList<Room> roomCatalog) {
        this.roomCatalog = roomCatalog;
    }

}
