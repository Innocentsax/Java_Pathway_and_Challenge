public class PrimeNumber {
    public static void main(String[] arg){
        /* System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT ") + "a prime number");
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT ") + "a prime number");
        System.out.println("4 is " + (isPrime(4) ? "" : "NOT ") + "a prime number"); */
        int count = 0;

        for (int i = 10; count < 3 && i <= 50; i++){
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                /*if (count == 3){
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }*/
            }
        }
        //System.out.println("Total number of prime numbers between 10 and 50 is " + count);
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
