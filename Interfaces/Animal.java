package org.example.Interfaces;
enum FlightStage implements Trackable{
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }
    public FlightStage getNextStage(){
        FlightStage[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}
record DragonFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satellite implements OrbitEarth{

    @Override
    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    static void log(String description){
        var today = new java.util.Date();
        System.out.println(today + ":" + description);
    }
}
interface FlightEnabled{
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeoff();
    void land();
    void fly();

    default FlightStage transition(FlightStage stage){
        //System.out.println("transition not implemented on " + getClass().getName());
        FlightStage nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return null;
    }
}
interface Trackable{
    void track();
}
public abstract class Animal {
    public abstract void move();
}
