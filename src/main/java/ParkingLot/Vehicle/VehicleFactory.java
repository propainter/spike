/*
 * Copyright (c) 2019.
 * Author: Himanshu Gautam
 * Email: himanshu.gautam@guavus.com
 */

package ParkingLot.Vehicle;

public class VehicleFactory {
    public static Vehicle getCarPrivate(LicensePlate license){
        Car car  = new Car(license);
        return car;
    }
    public static Vehicle getCar(LicensePlate license, VehicleType vehicleType){
        Car car  = new Car(license, vehicleType);
        return car;
    }
    public static Vehicle getBusPrivate(LicensePlate license){
        Bus bus = new Bus(license);
        return bus;
    }

    public static Vehicle getBus(LicensePlate license, VehicleType vehicleType){
        Bus bus = new Bus(license, vehicleType);
        return bus;
    }

    public static Vehicle getScooterPrivate(LicensePlate license){
        return new Scooter(license);
    }

    public static Vehicle getScooter(LicensePlate license, VehicleType vehicleType){
        return new Scooter(license, vehicleType);
    }
}
