/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot;

import ParkingLot.Enums.Level;
import ParkingLot.Enums.ParkingSpaceSize;
import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleFactory;

public class Main {

    public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(new ParkingSpot(1, Level.FIRST, ParkingSpaceSize.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(2, Level.FIRST, ParkingSpaceSize.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(3, Level.FIRST, ParkingSpaceSize.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(4, Level.FIRST, ParkingSpaceSize.LARGE));


        Vehicle johnCar = VehicleFactory.getCar("DL2344");
        Vehicle johnBus = VehicleFactory.getBus("DLd343e34");

//        ParkingSpot parkingSpot =  parkingLot.getFirstAvailableParkingSpot(johnCar);
//        System.out.println(parkingSpot);

        System.out.println(parkingLot.getFirstAvailableParkingSpot(johnBus));
    }
}
