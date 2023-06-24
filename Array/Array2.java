package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Array2 {
    public static void main(String[] args) {

        // INTRODUCTION TO ARRAY
        int[] exampleArray = {1, 2, 3, 4, 5};

        int[] arr = new int[5];
        System.out.println(exampleArray[4]);
        exampleArray[4] = 8;
        for (int i = 1; i < exampleArray.length + 1; i++){
            System.out.print(i + " ");

         //ITERATING ARRAYS
        int index = 0;
        for (int currentArray : exampleArray){
            System.out.println("Element at index " + index + " is " + currentArray + " ");
            index++;
        }

        // ARRAYLISTS
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(2, 39);

        arr.remove(0);

        for(int list : arr){
            System.out.println(list);
        }

         //SORTING ARRAYS
        int[] arr = {6, 3, 8, 9, 2, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // BINARY SEARCH
        int[] num = {1, 3, 5, 7, 9, 11, 11, 13};
        int index = Arrays.binarySearch(num, 7);
        System.out.println(index);

        index = Arrays.binarySearch(num, 11);
        System.out.println(index);

        index = Arrays.binarySearch(num, 13);
        System.out.println(index);

        int[] arr = new int[] {1, 2, 5, 6, 8};
        printArray( new int[] {2, 3, 6, 7, 9});
        int i = 0;
        int[] num = returnArray();
        for (int mama : num){
            System.out.println(mama);
            i++;
        }

         //MULTIDIMENSIONAL ARRAY
        int[][]  arr = {{1, 2, 3}, {3, 4, 5}, {7, 8, 4}};
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[] copyFrom = new int[]{1, 2, 3, 4, 5, 6};
        int[] copyInto = new int[copyFrom.length];
        System.out.println("Element before it was copied: " + Arrays.toString(copyFrom));

        System.arraycopy(copyFrom, 0, copyInto, 0, copyFrom.length);

        for (int i = 0; i < copyInto.length; i++){
            System.out.print(copyInto[i] + ", ");
        }
         CHARACTER CLASSES IN REGEX
        System.out.println(Pattern.matches("[abc]", "jk"));
        System.out.println(Pattern.matches("[abc]", "b"));
        System.out.println(Pattern.matches("[abc]", "abc"));
        System.out.println(Pattern.matches("[abc]", "t"));

        Pattern pattern = Pattern.compile("[a-zA-Z0_9]*");
        Matcher matcher = pattern.matcher("Hello, World*");
        boolean result = matcher.matches();
        System.out.println(result);
    }

    // PASSING ARRAYS TO METHODS
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

     //RETURNING ARRAY FROM A METHOD
    public static int[] returnArray(){
        return new int[] {1, 2, 3, 4};
    }
}
