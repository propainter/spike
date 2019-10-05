/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot;

import ParkingLot.Enums.Level;
import ParkingLot.Enums.Size;
import ParkingLot.Vehicle.Vehicle;

import java.util.Objects;


public class ParkingSpot {
    private Vehicle vehicle;
    private int spotNumber;
    private Level level;
    private Size parkingSpotSize;

    public ParkingSpot(int spotNumber, Level level, Size parkingSpotSize) {
        this.spotNumber = spotNumber;
        this.level = level;
        this.parkingSpotSize = parkingSpotSize;
    }

    public ParkingSpot setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    Boolean isEmpty(){
        return vehicle == null;
    }
    Boolean isFull(){
        return vehicle != null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public Level getLevel() {
        return level;
    }

    public Size getParkingSpotSize() {
        return parkingSpotSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return spotNumber == that.spotNumber &&
                level == that.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(spotNumber, level);
    }

    static Boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        if(checkSpotForVehicle(vehicle, parkingSpot)){
            parkingSpot.setVehicle(vehicle);
            return true;
        }
        return false;
    }

    static Boolean checkSpotForVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        if(parkingSpot.getVehicle() == null && parkingSpot.getParkingSpotSize().isGreaterThanEqualto(vehicle.getSize())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "vehicle=" + vehicle +
                ", spotNumber=" + spotNumber +
                ", level=" + level +
                ", parkingSpotSize=" + parkingSpotSize +
                '}';
    }
}
