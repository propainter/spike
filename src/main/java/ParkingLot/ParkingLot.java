/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> listOfSpots = new ArrayList<ParkingSpot>();

    void addParkingSpot(ParkingSpot parkingSpot){
        listOfSpots.add(parkingSpot);
    }

    ParkingSpot getFirstAvailableParkingSpot(Vehicle vehicle){
        for(ParkingSpot parkingSpot: listOfSpots){
            if(ParkingSpot.checkSpotForVehicle(vehicle, parkingSpot)){
                return parkingSpot;
            }
        }
        return null;
    }
}
