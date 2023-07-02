package org.example.Abstraction;

import java.util.Objects;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(Objects.equals(speed, "Slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        }else{
            System.out.println(getExplicitType() + " darting frantically");
        }
    }

    @Override
    public void makeNoise() {
        if (Objects.equals(type, "Goldfish")){
            System.out.println("swish!");
        }else{
            System.out.println("splash!");
        }
    }
}
