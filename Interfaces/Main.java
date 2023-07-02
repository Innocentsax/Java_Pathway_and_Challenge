package org.example.Interfaces;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flightEnabled.move();
//        trackable.move();
//        flier.takeoff();
//        flier.fly();
//        tracked.track();
//        flier.land();
        inFlight(flier);
        inFlight(new Jet());

        Truck truck = new Truck();
        truck.track();

        System.out.println("-".repeat(30));
        inFlight(new DragonFly1());

        System.out.println("-".repeat(50));
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        System.out.println("-".repeat(30));

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        System.out.println("-".repeat(30));

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

        OrbitEarth.log("Testing " + new Satellite());
    }
    private static void inFlight(FlightEnabled flier){
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked){
            tracked.track();
        }flier.land();
    }

    private static void landFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }

    private static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeoff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }
}
