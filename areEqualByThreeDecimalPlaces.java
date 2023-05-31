public class areEqualByThreeDecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double firstcheck, double num2){
        int firstcheckInt = (int)(firstcheck * 1000);
        int num2Int = (int)(num2 * 1000);

        if(firstcheckInt == num2Int){
            return true;
        }else return false;
    }
    public static void main(String[] arg){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
