import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name +  ", You are the Best Software Engineer i have ever seen!!!");

        String dateOfBirth = System.console().readLine("What year were you born");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you  are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", You are the Best Software Engineer gobally!!!");

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            /*String dateOfBirth = scanner.nextLine();
            age = currentYear - Integer.parseInt(dateOfBirth);*/
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed!! Try again.");
            }
        }while (!validDOB);


        return "So you are " + age + "years old";
    }
    public static void parse_Int_and_Double(){
        int currentYear = 2023;
        String userDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);
        System.out.println("Age = " + (currentYear - dateOfBirth));

        String forDouble = "22.5";
        double forDoubleAns = Double.parseDouble(forDouble);
        System.out.println(forDoubleAns);
    }
    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if ((dob < minYear) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);
    }
}
