/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.ParkingSpaceSize;


public class Car extends AbstractVehicle implements Vehicle{

    public Car(String license, VehicleType vehicleType) {
        super(license, ParkingSpaceSize.COMPACT, vehicleType);
    }
    public Car(String license) {
        super(license, ParkingSpaceSize.COMPACT, VehicleType.PRIVATE);
    }

    @Override
    public ParkingSpaceSize getParkingSpaceNeeded() {
        return this.parkingSpaceSizeNeeded;
    }

    @Override
    public String getLicensePlate() {
        return null;
    }
}
