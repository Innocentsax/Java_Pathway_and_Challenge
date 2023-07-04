package org.example.Imperative.CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdultValid(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer){
        return isEmailValid(customer.getEmail()) && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdultValid(customer.getDob());
    }
}
