package org.example.ArrayList.AutoBoxing.BankingApplication;

import java.util.ArrayList;

/**
 * ==> SIMPLE BANKING APPLICATION
 * Create a simple banking application, with a Customer and Bank type.
 * The Customer will have a name and an ArrayList of transaction containing Double wrapper elements.
 * (a). A customer's transaction can be a credit, which means a positive amount, or it can be a debit, a negative amount.
 * (b). The Bank will have a name, and an ArrayList of customers
 * ...the bank should add a new customer, if they're not yet already in the list.
 * ...the bank class should allow a customer to add a transaction, to an existing customer.
 * ...this class should also print a statement, that includes the customer name, and the transaction amount. this method should use unboxing.
 */

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}
public class Main {
    public static void main(String[] args) {
        Customer Inno = new Customer("Inno", 5000);
        System.out.println(Inno);

        Bank bank = new Bank("Zenith Bank");
        bank.addNewCustomer("Jane A", 500);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatement("Jane a");

        bank.addTransaction("Bob S", 100);
        bank.printStatement("Bob S");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for (var customer : customers){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        //System.out.print("Customer (%s) wasn't found %n");
        return null;
    }
    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transaction:");
        for (double d : customer.transactions()){
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }


}
