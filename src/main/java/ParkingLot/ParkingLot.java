/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot;

import ParkingLot.Vehicle.LicensePlate;
import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingSpot> listOfSpots = new ArrayList<ParkingSpot>();
    private Map<LicensePlate, ParkingSpot> allotmentVehicleToSpot = new HashMap<LicensePlate, ParkingSpot>();
    private Map<ParkingSpot, LicensePlate> allotmentSpotToVehicle = new HashMap<ParkingSpot, LicensePlate>();

    void addParkingSpot(ParkingSpot parkingSpot){
        allotmentSpotToVehicle.put(parkingSpot, null);
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

    Boolean allotParkingSpot(Vehicle vehicle, ParkingSpot parkingSpot){
        if(allotmentSpotToVehicle.containsKey(parkingSpot) && allotmentSpotToVehicle.get(parkingSpot) != null){
            return false;
        }
        if(allotmentVehicleToSpot.containsKey(vehicle) && allotmentVehicleToSpot.get(vehicle) != null){
            return false;
        }
        if(ParkingSpot.parkVehicle(vehicle, parkingSpot)){
            allotmentSpotToVehicle.put(parkingSpot, vehicle.getLicensePlate());
            allotmentVehicleToSpot.put(vehicle.getLicensePlate(), parkingSpot);
            return true;
        }
        return false;
    }

    ParkingSpot freeParkingSpot(Vehicle vehicle){
        return freeParkingSpot(vehicle.getLicensePlate());
    }
    ParkingSpot freeParkingSpot(LicensePlate licensePlate){
        if(allotmentVehicleToSpot.containsKey(licensePlate)){
            ParkingSpot parkingSpot = allotmentVehicleToSpot.get(licensePlate);
            allotmentVehicleToSpot.put(licensePlate, null);
            allotmentSpotToVehicle.put(parkingSpot, null);
            parkingSpot.setVehicle(null);
            return parkingSpot;
        }
        return null;
    }
    LicensePlate freeParkingSpot(ParkingSpot parkingSpot){
        if(allotmentSpotToVehicle.containsKey(parkingSpot)){
            LicensePlate licensePlate = allotmentSpotToVehicle.get(parkingSpot);
            allotmentSpotToVehicle.put(parkingSpot, null);
            allotmentVehicleToSpot.put(licensePlate, null);
            parkingSpot.setVehicle(null);
            return licensePlate;
        }
        return null;
    }
    ParkingSpot getParkingSpot(Vehicle vehicle){
        return getParkingSpot(vehicle.getLicensePlate());
    }
    ParkingSpot getParkingSpot(LicensePlate licensePlate){
        if(allotmentVehicleToSpot.containsKey(licensePlate)){
            return allotmentVehicleToSpot.get(licensePlate);
        } else {
            return null;
        }
    }
    LicensePlate getLicensePlate(ParkingSpot parkingSpot){
        if(allotmentSpotToVehicle.containsKey(parkingSpot)){
            return allotmentSpotToVehicle.get(parkingSpot);
        } else {
            return null;
        }
    }
}
