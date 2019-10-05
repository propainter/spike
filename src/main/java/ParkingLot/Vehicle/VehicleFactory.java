/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

public class VehicleFactory {
    public static Vehicle getCar(String license){
        Car car  = new Car(license);
        return car;
    }
    public static Vehicle getBus(String license){
        Bus bus = new Bus(license);
        return bus;
    }
}
