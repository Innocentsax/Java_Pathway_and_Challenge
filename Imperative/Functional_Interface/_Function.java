package org.example.Imperative.Functional_Interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));

        int meme = incrementByOneFunction.apply(0);
        System.out.println(meme);

        int multiply = multiplyBy10Function.apply(meme);
        System.out.println(multiply);

        Function<Integer, Integer> addBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy10.apply(0));

        int res = incrementAndMultiply(4, 100);
        System.out.println(res);

        System.out.println(incrementAndMul.apply(4, 100));
    }
    public static int increment(int number){
        return number + 1;
    }

    public static int incrementAndMultiply(int number, int mul){
        return ((number + 1) *mul);
    }

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static BiFunction<Integer, Integer, Integer> incrementAndMul = (num1, num2) -> (num1 + 1) * num2;
}
