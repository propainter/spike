/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Enums;

public enum Size {
    // motorcycle, scooter
    SMALL(1),
    // Small car
    COMPACT(2),
    // relatively larger car , SUV, Sedan
    MEDIUM(3),
    // Truck , tracktor
    LARGE(4),
    // Truck with lorry, Larger trucks
    EXTRALARGE(5);
    private int val;
    Size(int val){
        this.val = val;
    }
    public Boolean isGreaterThanEqualto(Size parkingSpaceSize){
        return this.val >= parkingSpaceSize.val;
    }
//    public int getVal() {
//        return val;
//    }
}
