package org.example.Imperative.CombinatorPattern;

import java.time.LocalDate;

import static org.example.Imperative.CombinatorPattern.CustomerRegistrationValidator.*;
import static org.example.Imperative.CombinatorPattern.CustomerRegistrationValidator.isAdult;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Innocent", "Innocent@gig.com", "+0817374744", LocalDate.of(2000, 1, 1));

        //System.out.println(new CustomerValidatorService().isValid(customer));

        ValidationResult result = isEmailValid().and(isPhoneNumberValid()).and(isAdult()).apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }

}
