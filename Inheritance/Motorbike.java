package Inheritance;

public class Motorbike extends MotorVehicle{

    public Motorbike(String model, int year, String manufacturer, double maxSpeed) {
        super(model, year, manufacturer, maxSpeed);
    }

    @Override
    public void makeNoise(){
        System.out.println("Motorbike goes brr brr");
    }

}
