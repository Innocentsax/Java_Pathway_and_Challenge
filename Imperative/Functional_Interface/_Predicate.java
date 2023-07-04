package org.example.Imperative.Functional_Interface;

import java.util.function.Predicate;

public class _Predicate {
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("09") && phoneNumber.length() == 11;

    //static BiPredicate<String>
//    static boolean isPhoneNumberValid4(String phoneNumber, boolean checker){
//        return phoneNumber.startsWith("09")
//    }

    static Predicate<String> isPhoneNumberValid3 = phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("07000000000"));

        System.out.println("-".repeat(30));
        System.out.println(isPhoneNumberValidPredicate.test("09036812983"));
        System.out.println(isPhoneNumberValidPredicate.test("07036812983"));

        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberValid3).test("09036812983"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberValid3).test("09000000003"));


    }
}
