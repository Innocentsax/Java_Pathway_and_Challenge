package Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 89;
//        int y = 0;
//
//        System.out.println(divideLBYL(x,y));
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x, y));
//        int x = getIntEAFP();
//        System.out.println("x is = " + x);
        try{
            int result = divide();
            System.out.println("The result of the sum = " + result);
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }


    // WITHOUT EXCEPTION
    private static int getIntLBYl(){
        Scanner num = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = num.next();
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(1))){
                isValid = false;
                break;
            }
        }if(isValid){
            return Integer.parseInt(input);
        }return 0;
    }

    // WITH EXCEPTION
    private static int getIntEAFP(){
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        try{
            return num.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }

//    private static int getInt(){
//        Scanner num = new Scanner(System.in);
//        return num.nextInt();
//    }

    private static int divideLBYL(int x, int y){
        if (y != 0){
            return (x / y);
        }return 0;
    }

    private static int divideEAFP(int x, int y){
        try{
            return x / y;
        }catch(ArithmeticException e){
            return 0;
        }
    }

    private static int divide (int x, int y){
        return x /y;
    }

    private static int divide(){
        int x, y;
        try{
            x = getInt();
            y = getInt();
            System.out.println("x is = " + x + " and is = " + y);
            return x / y;
        }catch (NoSuchElementException e){
            throw new ArithmeticException(" No suitable input");
        }catch(ArithmeticException e){
            throw new ArithmeticException(" Attempt to divide by Zero");
        }
        //int x = getInt();
        //int y = getInt();
    }

    private static int getInt(){
        Scanner num = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while (true){
            try{
                return num.nextInt();
            }catch(InputMismatchException e){
                num.nextLine();
                System.out.println("Please enter a number using only the digits ");
            }
        }
        //return num.nextInt();
    }
}
