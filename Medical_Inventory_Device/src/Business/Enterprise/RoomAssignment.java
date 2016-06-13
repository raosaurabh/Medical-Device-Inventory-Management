/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

public class RoomAssignment {

    private Room room;
    private Schedule roomschedule;

    public RoomAssignment() {
       
        roomschedule = new Schedule();
        
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Schedule getRoomschedule() {
        return roomschedule;
    }

    public void setRoomschedule(Schedule roomschedule) {
        this.roomschedule = roomschedule;
    }

}
