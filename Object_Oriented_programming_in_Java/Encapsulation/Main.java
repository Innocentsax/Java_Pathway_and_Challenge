package Encapsulation;

public class Main {
    public static void main(String[] args) {

        // ENCAPSULATION ON PLAYER WITHOUT ENCAPSULATION
        Player_without_Encapsulation player = new Player_without_Encapsulation();
        player.name = "Innocent";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

        //ENCAPSULATION ON PLAYER WITH ENCAPSULATION
        Player_with_Encapsulation inno = new Player_with_Encapsulation("Inno");
        System.out.println("Initial health is " + inno.healthRemaining());
        
        
        // ENCAPSULATION CHALLENGE
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
        
        
    }
}
