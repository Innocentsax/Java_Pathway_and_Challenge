package org.example.Imperative.Functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Innocent Charles", "08163093928"));
        greetConsumerCustomerV3(new Customer("Innocent Charles Udo", "08163093928"), false);


        Customer customer = new Customer("Innocent Charles", "08163093928");

        greetConsumerCustomer.accept(customer);
        greetConsumerCustomerV2.accept(customer, true);
        greetConsumerCustomerV2.accept(customer, false);

    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }
    static void greetConsumerCustomerV3(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));
    }
    static Consumer<Customer> greetConsumerCustomer = customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetConsumerCustomerV2 = (customer, showPhoneNumber) -> System.out.println("Hello "
            + customer.customerName + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "***********"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

