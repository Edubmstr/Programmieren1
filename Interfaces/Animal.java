package Interfaces;

public abstract class Animal {

    protected String name;
    protected String species;

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }
    public abstract void eat();
    public abstract void makeSound();

    public void sleep(){
        System.out.println("I'm sleeping");
    }

}
