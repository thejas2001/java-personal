package com.oops;

public class Abstra {
    public static void main(String[] args) {
        //An abstract class in Java is a class that cannot be instantiated
        // and is meant to be extended by subclasses
        //Abstract Methods: Can have methods without implementation (must be implemented by subclasses).
        //Concrete Methods: Can also have methods with implementations.
        //Constructors: Can have constructors, which can be called by subclasses.
        //Instance Variables: Can have instance variables, unlike interfaces.
        //Access Modifiers: Can have public, private, protected, or default access modifiers.
        vehicle vehicle=new Car();
        vehicle.concre();
        vehicle.makeSound();

        //with constructor


    }

}
abstract class vehicle{
    abstract void makeSound();
    void concre()
    {
        System.out.println("this is concrete");
    }
}

 class Car extends vehicle{

    @Override
    void makeSound() {
        System.out.println("impllli");
    }
}

