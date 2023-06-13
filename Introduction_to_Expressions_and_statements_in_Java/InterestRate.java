    public static void main(String[] arg){

        /*for (int counter = 0; counter <= 5; counter++){
            System.out.println(counter);
        }*/
        for (double rate = 7.5; rate <= 10; rate +=0.25){
            //System.out.println("500 at " + rate + "% interest = " + calculateInterest(500, rate));
            double interestAmount = calculateInterest(500, rate);
            if (interestAmount > 48.5){
                break;
            }
            System.out.println("$500 at " + rate + "% interest = $" + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
