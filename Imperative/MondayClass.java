package org.example.Imperative;

import java.util.function.Function;

public class MondayClass {

    public static void main(String[] args) {

        // FUNCTIONAL PROGRAMMING
        Function<String, String> printName = name -> "Hello, " + name;
        Function<String, Integer> printStringLength = string -> string.length();
        System.out.println(printName.apply("Innocent"));
    }
}
