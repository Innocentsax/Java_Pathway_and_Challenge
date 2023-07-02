package org.example.Abstraction;

import java.util.Objects;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(Objects.equals(speed, "Slow")) {
            System.out.println(getExplicitType() + " walking");
        }else{
            System.out.println(getExplicitType() + " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (Objects.equals(type, "wolf")){
            System.out.println("Howling!");
        }else{
            System.out.println("Woof!");
        }
    }
}
