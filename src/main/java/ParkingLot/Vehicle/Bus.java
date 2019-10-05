/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.ParkingSpaceSize;

public class Bus extends AbstractVehicle implements Vehicle{

    public Bus(String license) {
        super(license, ParkingSpaceSize.LARGE);
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