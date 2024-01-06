package Interfaces;

public class Duck extends Animal implements Bird, Swimming{
    public Duck(String name, String species) {
        super(name, species);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void land() {
        System.out.println("Rüdiger hat versagt");
    }

    @Override
    public void descend() {
        System.out.println("RÜDIGER nicht so tief, nicht so tief RÜDIGER");
    }

    @Override
    public void ascend() {
        System.out.println("Walk bitch");
    }

    @Override
    public void swim() {
        System.out.println("I'm under the water please help me here to much woooooo");
    }

    @Override
    public void walk() {
        System.out.println("Was ist denn nur mit Karsten los");
    }
    public static void main(String [] args){
        Duck duck1 = new Duck("Ente", "Duck");
        duck1.ascend();
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }
}
