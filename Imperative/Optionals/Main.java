package org.example.Imperative.Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var value = Optional.ofNullable("Hello Innocent").orElseGet(() -> "default value");
        System.out.println(value);

        System.out.println("-".repeat(30));
        var value2 = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(value2);

        System.out.println("-".repeat(30));
        //Optional.ofNullable("innocent@giglogistics.ng").isPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable("innocent@giglogistics.ng").ifPresentOrElse(email -> System.out.println("Sending email to " + email), () -> System.out.println("cannot send email"));

    }
}
