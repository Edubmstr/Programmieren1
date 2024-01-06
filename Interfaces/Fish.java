package Interfaces;

public class Fish extends Animal implements Swimming {
    public Fish(String name, String species) {
        super(name, species);
    }

    @Override
    public void swim() {
        System.out.println("Blub blub");
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }
}
