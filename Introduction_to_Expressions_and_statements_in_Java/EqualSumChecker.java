public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if ((num1 + num2) == num3){
            return true;
        }else return false;
    }
    public static void main(String[] arg){
        System.out.println(hasEqualSum(1, 1, 1));
    }
}
