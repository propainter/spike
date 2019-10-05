/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.Size;

public class Bus extends AbstractVehicle {

    public Bus(LicensePlate license) {
        super(license, Size.LARGE, VehicleType.PRIVATE);
    }
    public Bus(LicensePlate license, VehicleType vehicleType) {
        super(license, Size.LARGE, vehicleType);
    }

}
