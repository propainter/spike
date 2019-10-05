/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

public class VehicleFactory {
    public static Vehicle getCarPrivate(String license){
        Car car  = new Car(license);
        return car;
    }
    public static Vehicle getCar(String license, VehicleType vehicleType){
        Car car  = new Car(license, vehicleType);
        return car;
    }
    public static Vehicle getBusPrivate(String license){
        Bus bus = new Bus(license);
        return bus;
    }

    public static Vehicle getBus(String license, VehicleType vehicleType){
        Bus bus = new Bus(license, vehicleType);
        return bus;
    }
}
