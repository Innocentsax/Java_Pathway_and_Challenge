public class Main{
    public static void main(String[] arg){
        /*int count = 0;
        for(int num = 1; count < 5 && num <= 1000; num++){
            if ((num % 3 == 0) && (num % 5 == 0)){
                int sum = num + num;
                count++;

                System.out.println(sum);
            }
        }*/
        Sum3And5Challenge(0, 0);
    }
    public static void Sum3And5Challenge(int countOfMatch, int sumOfMatches){
        //countOfMatch = 0;
        //sumOfMatches = 0;
        for(int loopNumber = 1; countOfMatch < 5 && loopNumber <= 1000; loopNumber++){
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)){
                countOfMatch++;
                sumOfMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }
        }
        System.out.println("Sum = " + sumOfMatches);
    }
}
