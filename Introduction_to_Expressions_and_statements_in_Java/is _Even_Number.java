public class isEvenNumber {

    public static boolean isEvenNumber(int even){
        if ((even % 2) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int evenCount = 0;
        int oddCount = 0;
        int show = 5;
        while (show <= 20){
            show++;
            if (!isEvenNumber(show)){
                oddCount++;
                //show += count;
                continue;
            }
            System.out.println("Even number " + show);
            evenCount++;
            if (evenCount >= 5){
                break;
            }
        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total odd numbers found = " + oddCount);
    }
}
