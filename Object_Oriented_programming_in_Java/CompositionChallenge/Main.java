package CompositionChallenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);


        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();

        System.out.println("\n\n\n\n\n");


        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
