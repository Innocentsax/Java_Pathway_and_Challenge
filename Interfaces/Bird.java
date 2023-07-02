package org.example.Interfaces;

public class Bird extends Animal implements FlightEnabled, Trackable{

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " coordinates recorded");
    }
}
