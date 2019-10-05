/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.Size;

public class Scooter extends AbstractVehicle{
    public Scooter(LicensePlate license, VehicleType vehicleType) {
        super(license, Size.SMALL, vehicleType);
    }
    public Scooter(LicensePlate license) {
        super(license, Size.SMALL, VehicleType.PRIVATE);
    }
}
