package org.example.ArrayList;

import java.util.Random;

public class Emain {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
        System.out.println(weekDay);

        for(int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//            if(weekDay == DayOfTheWeek.SUNDAY){
//                System.out.println("Found a Sunday!!!");
//            }
            switchDayOfWeek(weekDay);
        }
        
    }
    public static void switchDayOfWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case WEDNESDAY -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SATURDAY -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() + "day is Day" + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
