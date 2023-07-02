package org.example.Fundamental_Review;

public class Main {
    public static void main(String[] args) {
        //result();
//        int[] nem;
//        nem = new int[]{1, 2, 3, 4};
//
//
//        char[] name = new char[10];
//        name[0] = 'a';
//        name[1] = 'b';

       studentCA(20, 20, 50);
        //System.out.println(mumu);
        studentCA(20, 20, 20);
        studentCA(20, 20, 12);
        studentCA(20, 20, 0);

        boolean checker = true;
        System.out.println(checker);
        System.out.println("-".repeat(30));
        System.out.println(!checker);

        System.out.println("-".repeat(50));

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String days : daysOfWeek){
            System.out.println(days);
        }
        //System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));
//        if(daysOfWeek == new String[]{"Sunday"}){
//            System.out.println("It's weekend");
//        }
        for(int i = 0; i < daysOfWeek.length; i++){
//            if(daysOfWeek[i] == "Sunday"){
//                System.out.println("It's weekend");
//            }if (daysOfWeek[i] == "Wednesday"){
//                break;
            if (daysOfWeek[i] == "Thursday"){
                continue;
            }System.out.println(daysOfWeek[i]);

//            else{
//                System.out.println(daysOfWeek[i]);
//            }
        }

        System.out.println("-".repeat(50));
        String[] studentName = {"Queen", "David", "Innocent", "Paul", "IBK", "Daniel", "Collins", "Samuel"};
        int[] studentScore = {99, 60, 103, 90, 20, -20, 40, 30};

        for (int i = 0; i < (studentScore.length); i++){
            if(studentScore[i] > 100){
                continue;
            }
            else if (studentScore[i] >= 50){
                System.out.println("Hi, " + studentName[i].toUpperCase() + " with Score " + studentScore[i] + " you have pass\n");
            }else if(studentScore[i] >= 49){
                System.out.println("Hi, " + studentName[i].toUpperCase() + " with Score " + studentScore[i] + " you have failed\n");
            //}else if(studentScore[i] > 100){
                continue;
                //System.out.println("Hi " + studentName[i] + " with Score " + studentScore[i] + " seem there was a slight miss-up during score entry");
            }else if(studentScore[i] < 0){
                System.out.println("Hi, " + studentName[i].toUpperCase() + " with Score " + studentScore[i] + " i think we have a 'FATAL ERROR'.\n");
                break;
            }else{
                System.out.println("Hi, " + studentName[i].toUpperCase() + " with score " + studentScore[i] + ", You are a valid student\n");
            }
        }

    }
    static int addParameters(int a, int b, int c){
        return (a + b + c);
    }
    static int mulParameters(int a, int b, int c, int d){
        return (a * b * c * d);
    }
    static void result(){
        int add = addParameters(2, 3, 4);
        int mul = mulParameters(3, 5, 8, 8);
        //return (mul - add);
        System.out.println(mul - add);
    }
    public static double studentCA(int ca1, int ca2, int exam){
        double result = ca1 + ca2 + exam;
        if(result >= 70){
            System.out.println("Your score is " + result + " and your grade is 'A'.");
        }
        else if(result >= 60 && result <= 69.5){
            System.out.println("Your score is " + result + " and your grade is 'B'.");
        }
        else if(result >= 50 && result <= 59){
            System.out.println("Your score is " + result + " and your grade is 'C'.");
        }
        else if(result >= 0 && result <= 49){
            System.out.println("Your score is " + result + " and your grade is 'FAIL'.");
        }
        return result;
    }
}
