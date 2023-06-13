public class Main{

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long year = minutes / (60 * 24 * 365);
            long remainingYears = minutes % (60 * 24 * 365);
            long days = remainingYears / (60 * 24);
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
    public static void main(String[] arg){
        printYearsAndDays(1051200);
    }
}
