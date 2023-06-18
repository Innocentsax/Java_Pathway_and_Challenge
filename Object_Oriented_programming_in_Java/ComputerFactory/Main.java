package ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        //Monitor theMonitor = new Monitor("27inch Beast")
        Motherboard themotherboard = new Motherboard("BJ-220", "Asus", 4,6, "v2.44");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 X 1440");

        PersonalComputer myPC = new PersonalComputer("2208", "Dell", theMonitor, themotherboard, theCase);

//        myPC.getMonitor().drawPixelAt(10, 10, "Red");
//        myPC.getMotherboard().loadProgram("Windows");
//        myPC.getComputerCase().pressPowerButton();

        myPC.powerUp();
    }
}
