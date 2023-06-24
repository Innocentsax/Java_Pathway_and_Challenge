package Array;
/**
 * QUESTION: Create a program using arrays, that sorts a list of integers,
 * in descending order. Descending order means from highest value to lowest.
 * (In other words, if the array has the values 50, 25, 80, 5 and 15,
 * your program should return an array, with the values in the descending order: 80, 50, 25, 15 and 15.)
 * STEPS: First, create an array of randomly generated integers
 * 2. Print the array before you sort it;
 * 3. Print the array after you sort it.
 * 4. You can choose to create a new sorted array, or just sort the current array.
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static int[] RandomInt(int len){
        Random random = new Random();
        int[] num = new int[len];
        for(int i = 0; i < len; i++){
            num[i] = random.nextInt(1000);
        }
        return (num);
    }

    public static void main(String[] args) {
//        int[] nn = RandomInt(5);
//        System.out.println(Arrays.toString(nn));
//        Arrays.sort(nn);
//        System.out.println(Arrays.toString(nn));
        int[] sortedArray = sortIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));
        }return sortedArray;
    }
}





