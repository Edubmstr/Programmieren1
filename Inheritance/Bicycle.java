package Inheritance;

public class Bicycle extends Vehicle{
    protected int gears;

    public Bicycle(String model, int year, String manufacturer, double maxSpeed, int gears) {
        super(model, year, manufacturer, maxSpeed);
        this.gears = gears;
    }

    public void start(){
        System.out.println("Tret in die Pedale du fauler Sack");
    }
}
