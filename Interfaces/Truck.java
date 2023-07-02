package org.example.Interfaces;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " coordinates recorded");
    }
}
