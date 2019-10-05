/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

import ParkingLot.Enums.Size;

public interface Vehicle {
    Size getSize();
    LicensePlate getLicensePlate();
}
