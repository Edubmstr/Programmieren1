package Inheritance;

import java.util.ArrayList;

public class Car extends MotorVehicle{
    protected int tueren;
    protected String fuel;

    public Car(String model, int year, String manufacturer, double maxSpeed, String fuel, int tueren) {
        super(model, year, manufacturer, maxSpeed);
        this.fuel = fuel;
        this.tueren = tueren;
    }

    @Override
    public void makeNoise(){
        System.out.println("Rapapababababam");
    }

    public void crash(){
        System.out.println("Bimbimbambanm");
    }
}
