package Inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("GT3 RS", 2023, "Porsche", 296,"Benzin", 2);
        Bicycle bike1 = new Bicycle("Slide Trail 9.0", 2020, "Radon", 30, 12);
        Motorbike motorrad1 = new Motorbike("S1000RR", 2023, "BMW", 315);
        //starten(car1);
        //starten(bike1);
        System.out.println(Vehicle.getVehicles());
        MotorVehicle vehicle1 = new Car("911", 2023, "Porsche", 300, "Benzin", 3);
        //System.out.println(Arrays.toString());

    }
    /*
    public static void starten(Vehicle vehicle){
        vehicle.start();

        if(vehicle instanceof Car){
            ((Car) vehicle).crash();
        }
    }
     */
}
