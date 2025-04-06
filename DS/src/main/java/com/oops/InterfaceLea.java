package com.oops;

public class InterfaceLea {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        //java 8+
        Vehic vehi=new Bus();
        vehi.colour();
        vehi.makeSound();
        Vehic.speed();

        //Functional interface
        //A functional interface has only one abstract method and can be used with lambda expressions.
        calc c=(a,b)->a+b;
        System.out.println(c.add(12,15));

        //multiple interface
        cd mul=new cd();
        mul.method1();
        mul.method2();



    }
    interface Animal{
        void makeSound();
    }
    static class Dog implements Animal{

        @Override
        public void makeSound() {
            System.out.println("ha ha");
        }
    }

    //Default & Static Methods (Java 8+)
    interface Vehic{
        void makeSound();
        default void colour(){
            System.out.println("white");
        }
        static void speed(){
            System.out.println("speed");
        }
    }
    static class Bus implements Vehic{

        @Override
        public void makeSound() {
            System.out.println("speeeee");
        }

    }

    interface calc{
        int add(int a,int b);
    }

    interface a{
        void method1();
    }

    interface b{
        void method2();
    }

    static class cd implements a,b{

        @Override
        public void method1() {
            System.out.println("method1");
        }

        @Override
        public void method2() {
            System.out.println("method2");
        }
    }

}
