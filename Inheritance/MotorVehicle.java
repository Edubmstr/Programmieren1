package Inheritance;

public abstract class MotorVehicle extends Vehicle {
    protected String model;
    protected int year;
    protected String manufacturer;

    protected double maxSpeed;
    protected boolean motorStarted = false;
    public MotorVehicle(String model, int year, String manufacturer, double maxSpeed) {
      super(model,year, manufacturer, maxSpeed);
    }
    public abstract void makeNoise();

    public void stopMotor(){
        if(!motorStarted){
            System.out.println("Motor war gestoppt");
        }
        if(motorStarted){
            motorStarted = false;
            System.out.println("Motor gestoppt");
        }
    }

    public void startMotor(){
        if(!motorStarted){
            motorStarted = true;
            System.out.println("Motor gestartet");
        }
        if(motorStarted){
            System.out.println("Motor läuft schon");
        }
    }

}
