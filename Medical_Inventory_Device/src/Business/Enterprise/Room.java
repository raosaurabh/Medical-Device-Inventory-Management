/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

public class Room {

    private int roomnumber;
    private static int count = 0;

    public Room() {
        count++;
        roomnumber = count;

    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    @Override
    public String toString() {
        return String.valueOf(roomnumber) ;
    }
    
    
}
