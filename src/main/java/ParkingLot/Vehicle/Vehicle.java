/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.ParkingSpaceSize;

public interface Vehicle {
    ParkingSpaceSize getParkingSpaceNeeded();
    String getLicensePlate();
}
