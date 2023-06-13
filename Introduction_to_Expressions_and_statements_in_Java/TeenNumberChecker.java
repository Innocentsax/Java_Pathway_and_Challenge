public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if (isTeen(num1) || isTeen(num2) || isTeen(num3)){
            return true;
        }else return false;
    }

    public static boolean isTeen(int checker){
        if (checker >= 13 && checker <= 19){
            return true;
        }else return false;
    }

    public static void main(String[] args){
        System.out.println(hasTeen(9, 99, 19));
    }
}
