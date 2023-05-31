public class BarkingDog {
    /*public static boolean shouldWakeUp(boolean barking, int hourOfDay){
    if (barking == true || hourOfDay < 8 || hourOfDay > 22){
        return true;
    }
    return false;
}*/
    public static void main(String[] arg){
        System.out.println(shouldWakeUp(false, 2));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking == false || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        return true;
    }

}
