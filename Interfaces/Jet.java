package org.example.Interfaces;

public class Jet implements FlightEnabled, Trackable{

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

    @Override
    public FlightStage transition(FlightStage stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnabled.super.transition(stage);
    }
}
