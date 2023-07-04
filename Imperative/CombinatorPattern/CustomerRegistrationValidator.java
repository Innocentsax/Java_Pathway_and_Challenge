package org.example.Imperative.CombinatorPattern;


import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static org.example.Imperative.CombinatorPattern.ValidationResult.*;

enum ValidationResult{
    SUCCESS, PHONE_NUMBER_NOT_VALID, EMAIL_NOT_VALID, IS_NOT_AN_ADULT
}
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    //    private boolean isEmailValid(String email){
//        return email.contains("@");
//    }
//
//    private boolean isPhoneNumberValid(String phoneNumber){
//        return phoneNumber.startsWith("+0");
//    }
//
//    private boolean isAdult(LocalDate dob){
//        return Period.between(dob, LocalDate.now()).getYears() > 16;
//    }
//
//    default boolean isValid(Customer customer){
//        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
//    }
    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ? SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer): result;
        };
    }
}