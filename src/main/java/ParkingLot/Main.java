/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot;

import ParkingLot.Enums.Level;
import ParkingLot.Enums.Size;
import ParkingLot.Vehicle.LicensePlate;
import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleFactory;

public class Main {

    public static void main(String[] args) {
    ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(new ParkingSpot(0, Level.FIRST, Size.SMALL));
        parkingLot.addParkingSpot(new ParkingSpot(1, Level.FIRST, Size.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(2, Level.FIRST, Size.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(3, Level.FIRST, Size.COMPACT));
        parkingLot.addParkingSpot(new ParkingSpot(4, Level.FIRST, Size.LARGE));

        Vehicle rickScooter = VehicleFactory.getScooterPrivate(new LicensePlate("MP894848"));
        processIn(parkingLot, rickScooter);

        Vehicle johnCar = VehicleFactory.getCarPrivate(new LicensePlate("DL2344"));
        processIn(parkingLot, johnCar);


        Vehicle johnBus = VehicleFactory.getBusPrivate(new LicensePlate("DLd343e34"));
        processIn(parkingLot, johnBus);

        processOut(parkingLot, johnBus);

        Vehicle jackBus = VehicleFactory.getBusPrivate(new LicensePlate("DL0101034"));
        processIn(parkingLot, jackBus);

        Vehicle vickyScooter = VehicleFactory.getScooterPrivate(new LicensePlate("MP894848"));
        processIn(parkingLot, vickyScooter);


    }
    static void processOut(ParkingLot parkingLot, Vehicle vehicle){
        System.out.println("\n================OUT====================================================");
        ParkingSpot parkingSpot = parkingLot.freeParkingSpot(vehicle);
        System.out.println(String.format(
                "Emptied parking space : %s",
                parkingSpot
        ));
    }
    static void  processIn(ParkingLot parkingLot, Vehicle vehicle){
        System.out.println("\n================IN====================================================");
        ParkingSpot parkingSpot1 = parkingLot.getFirstAvailableParkingSpot(vehicle);
//        System.out.println(String.format(
//                "Parking spot for %s :\n%s",
//                vehicle ,
//                parkingSpot1 == null ? " -- " : parkingSpot1
//        ));
        if(parkingSpot1 != null){
            System.out.println(String.format("Parking it"));
            parkingLot.allotParkingSpot(vehicle, parkingSpot1);
        } else {
            System.out.println(String.format("Cannot park!"));
        }
        System.out.println(
                parkingLot.getParkingSpot(vehicle)
        );
        System.out.println(
                parkingLot.getLicensePlate(parkingSpot1)
        );
    }
}
