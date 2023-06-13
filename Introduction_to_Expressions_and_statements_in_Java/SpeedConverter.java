public class SpeedConverter {
    public static void main(String[] arg){
        System.out.println(toMilesPerHour(10));
        printConversion(15.6);
    }
    /*public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        }
        else{
            long result = Math.round(kilometersPerHour / 1.609);
            return result;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long mile = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mile + " mi/h");
        }
    }*/
    /* Here is another way of solving this problem using Ternary */
    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
