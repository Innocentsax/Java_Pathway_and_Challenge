public class Number_in_word{
    public static void printNumberInWord(int wholeNumber){
        String numbers_in_word = switch (wholeNumber){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "Six";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numbers_in_word);
    }
    public static void main(String[] arg){
        printNumberInWords(1);
    }
    public static void printNumberInWords(int num){
        String word="OTHER";
        switch (num){
            case 0: word="ZERO";break;
            case 1: word="ONE";break;
            case 2: word="TWO";break;
            case 3: word="THREE";break;
            case 4: word="FOUR";break;
            case 5: word="FIVE";break;
            case 6: word="SIX";break;
            case 7: word="SEVEN";break;
            case 8: word="EIGHT";break;
            case 9: word="NINE";break;
        }
        System.out.println(word);
    }
}
