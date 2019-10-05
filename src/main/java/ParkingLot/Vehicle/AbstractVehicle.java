/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;


import ParkingLot.Enums.Size;

abstract class AbstractVehicle implements  Vehicle{
    LicensePlate licensePlate;
    Size size;
    VehicleType vehicleType;

    @Override
    public String toString() {
        return "[" +
                "" + licensePlate +
                "|" + vehicleType +
                "|" + size +
                '}';
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }
    public Size getSize() {
        return this.size;
    }


    public AbstractVehicle(LicensePlate licensePlate, Size parkingSpaceSizeNeeded, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.size = parkingSpaceSizeNeeded;
        this.vehicleType = vehicleType;
    }
}
