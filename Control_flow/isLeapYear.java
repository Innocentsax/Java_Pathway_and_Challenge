public class isLeapYear {
    /* METHOD 1
public static boolean isLeapYear(int year){
    if (year >= 1 && year <= 9999) {
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    return false;
}*/
    public static void main(String[] arg){
        System.out.println(isLeapYear(-1600));
    }

    /* METHOD 2*/
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            } else {
                return false;
            }
        }else{
            return false;
        }
    }
}
