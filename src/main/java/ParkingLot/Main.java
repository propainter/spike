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


        Vehicle johnCar = VehicleFactory.getCarPrivate("DL2344");

        ParkingSpot parkingSpot =  parkingLot.getFirstAvailableParkingSpot(johnCar);
        System.out.println(parkingSpot);

        System.out.println("\n====================================================================");
        Vehicle johnBus = VehicleFactory.getBusPrivate("DLd343e34");
        ParkingSpot parkingSpot1 = parkingLot.getFirstAvailableParkingSpot(johnBus);
        System.out.println(String.format(
                "Parking spot for %s :\n%s",
                johnCar ,
                parkingSpot1
        ));
        if(parkingSpot1 != null){
            System.out.println(String.format("Parking it"));
            ParkingSpot.parkVehicle(johnBus, parkingSpot1);
        } else {
            System.out.println(String.format("Cannot park!"));
        }


        System.out.println("\n====================================================================");
        Vehicle jackBus = VehicleFactory.getBusPrivate("DL0101034");
        ParkingSpot parkingSpot2 = parkingLot.getFirstAvailableParkingSpot(jackBus);
        System.out.println(String.format(
                "Parking spot for %s :\n%s",
                jackBus,
                parkingSpot2
        ));
        if(parkingSpot2 != null){
            ParkingSpot.parkVehicle(jackBus, parkingSpot2);
            System.out.println(String.format("Parking it"));
        } else {
            System.out.println(String.format("Cannot park!"));
        }
    }
}
