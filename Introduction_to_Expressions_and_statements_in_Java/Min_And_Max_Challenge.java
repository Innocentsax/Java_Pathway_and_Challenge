import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        int loopCount = 0;

        while (true){
            System.out.println("Kindly enter your number or any character to exit: ");
            String num = scanner.nextLine();
            try {
                double validNum = Double.parseDouble(num);
                if (loopCount == 0 || validNum < min){
                    min = validNum;
                }if (loopCount == 0 || validNum > max){
                    max = validNum;
                }loopCount++;
            }catch(NumberFormatException nfe){
                break;
            }
        }
        if (loopCount > 0){
            System.out.printf("min = " + min + ", max = " + max);
        }else{
            System.out.println("No valid data entered");
        }
    }
}
