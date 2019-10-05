/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.Size;


public class Car extends AbstractVehicle {

    public Car(LicensePlate license, VehicleType vehicleType) {
        super(license, Size.COMPACT, vehicleType);
    }
    public Car(LicensePlate license) {
        super(license, Size.COMPACT, VehicleType.PRIVATE);
    }

}
