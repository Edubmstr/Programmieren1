package Inheritance;

import java.util.ArrayList;

public class Vehicle {
    protected String model;
    protected int year;
    protected String manufacturer;

    protected double maxSpeed;
    protected static ArrayList<Vehicle> garage = new ArrayList<>();

    public Vehicle(String model, int year, String manufacturer, double maxSpeed){
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.year = year;
        addVehicle(this);
    }


    protected void addVehicle(Vehicle vehicle){
        garage.add(this);
    }

    public static ArrayList<Vehicle> getVehicles(){
        return garage;
    }

    public String toString(){
        return "\nManufacturer:" + this.manufacturer + "\nModel:" + this.model;
    }
}
