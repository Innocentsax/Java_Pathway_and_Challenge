package Array;

import java.util.Scanner;

public class SortedArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + "values: \r");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i] < array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
//        getIntegers(8);
//        sortIntegers(getIntegers(8));
        printArray(sortIntegers(getIntegers(8)));
    }

}
