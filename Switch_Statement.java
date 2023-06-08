public class SwitchStatement{

    public static void main(String[] arg){

        /*int switchValue = 5;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("was not 1, 2, 3, 4, or 5");
        }
        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");*/
        //NATOword('X');
        //printDayOfWeek(4);
        traditionalPrintWeekDay(4);
    }
    public static String getQuarter(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1st"; }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
    public static void NATOword(char charvalue){
        // Traditional Switch Statement
        switch (charvalue) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            case 'F':
                System.out.println("F is Fish");
                break;
            default:
                System.out.println("Letter " + charvalue + " was not found in the switch");

        }
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek =  switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
            /*{
                String badResponse = day + " is invalid day";
                yield badResponse;
            }*/
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }
    public static void traditionalPrintWeekDay(int day){
        String day_of_week = "Invalid Day";
        if (day == 0){
            day_of_week = "Sunday";
        }else if (day == 1){
            day_of_week = "Monday";
        }else if (day == 2){
            day_of_week = "Tuesday";
        }else if (day == 3){
            day_of_week = "Wednesday";
        }else if (day == 4){
            day_of_week = "Thursday";
        }else if (day == 5){
            day_of_week = "Friday";
        }else if (day == 6){
            day_of_week = "Saturday";
        }
        System.out.println(day + " stands for " + day_of_week);
    }
}
