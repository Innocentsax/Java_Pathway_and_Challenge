public class MethodOverLoadingChallenge {
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    /* public static double concertToCentimeter(int inches, int feet){
        return ((feet * 12) + inches) * 2.54;
    }*/
    /* public static double concertToCentimeter(int inches, int feet){
        return convertToCentimeters((feet * 12) + inches);
    }*/

    public static double concertToCentimeter(int inches, int feet){
        //return ((feet * 12) + inches) * 2.54;
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
        return result;
    }

    public static void main(String[] arg){
        System.out.println("5ft, 8in = " + concertToCentimeter(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(6) + "cm");
    }
}
