public class NumberOfDaysInMonth {
    // write your code here
        public static boolean isLeapYear(int year){
        if (!(year >= 1 && year <= 9999)){
            return false;
        }
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    public static int getDaysInMonth(int month, int year){
        if ((month < 1) || (month > 12) || ((year < 1) || (year > 9999))){
            return -1;
        }
        if (isLeapYear(year) && month == 2){
            return 29;
        }
        switch (month){
            case 11: case 4: case 6: case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }

    }
}
