package Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 5;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);


        //Printing out the last digit in the array

        System.out.println("Last element of an  array = " + firstTen[arrayLength -1]);

        //Looping through all the Element
        int[] newArray;
        //newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        for(int i = 0; i<newArray.length; i++){
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        // Using Enhance For Loop
        for (int element : newArray){
            System.out.print(element + "\t");
        }

        System.out.println();
        // USING TO STRING METHOD
        System.out.println(Arrays.toString(newArray));

        // GET RANDOM ARRAY
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        //System.out.println(Arrays.toString(getRandomArray(10)));

        // SORTING NUMBERS
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        //System.out.println(Arrays.toString(Arrays.sort(getRandomArray(10)))); //Did'nt work


        // USING ARRAY FILL METHOD
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 7);
        System.out.println(Arrays.toString(secondArray));


        // USING ARRAY .COPY METHOD
        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        // A PARTIAL ARRAY COPY
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        // OVERLOADED ARRAY COPY
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        // USING A STRING ARRAY TO FIND A MATCH
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
        }

        // USING EQUAL METHOD TO CHECK A STRING
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {6, 2, 3, 4, 5, 9};

        if (Arrays.equals(s1, s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

        ArrayChallenge man = new ArrayChallenge();
        int[] nn = man.RandomInt(5);
        System.out.println(Arrays.toString(nn));
        Arrays.sort(nn);
        System.out.println(Arrays.toString(nn));



    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
