/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;


import ParkingLot.Enums.ParkingSpaceSize;

abstract class AbstractVehicle {
    String licensePlate;
    ParkingSpaceSize parkingSpaceSizeNeeded;
    VehicleType vehicleType;

    @Override
    public String toString() {
        return "[" +
                "" + licensePlate +
                "|" + vehicleType +
                "|" + parkingSpaceSizeNeeded +
                '}';
    }

    public AbstractVehicle(String licensePlate, ParkingSpaceSize parkingSpaceSizeNeeded, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.parkingSpaceSizeNeeded = parkingSpaceSizeNeeded;
        this.vehicleType = vehicleType;
    }
}
