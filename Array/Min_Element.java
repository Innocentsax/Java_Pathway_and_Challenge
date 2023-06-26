package Array;

import java.util.Scanner;

public class Min_Element {
    public static void main(String[] args) {
        int mama = readInteger();
        System.out.println(mama);

        int[] nana = readElement(readInteger());
        System.out.println(nana);
    }
    private static Scanner scanner = new Scanner(System.in);
    private static int readInteger(){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int input = scanner.nextInt();
        scanner.close();

        return input;
    }

    private static int[] readElement(int par){
        //Scanner scanner = new Scanner(System.in);
        int[] element = new int[par];
        for (int i = 0; i < element.length; i++){
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            element[i] = totalElementEntered;
        }return element;
    }

    private static int findMin(int[] count){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < count.length; i++){
            int minVal = count[i];
            if (minVal < min){
                min = minVal;
            }
        }return min;
    }

}
