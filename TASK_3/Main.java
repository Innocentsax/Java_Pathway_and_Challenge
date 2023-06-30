package org.example.TASK_3;

import org.example.TASK_3.Entities.Customer;
import org.example.TASK_3.Entities.CustomerChecker;
import org.example.TASK_3.Entities.Product;
import org.example.TASK_3.ServicesImpl.CustomerTransactionServicesImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Product productA = new Product("White-Men's S/S Crew Tee", "Small", 150, 3.50);
        Product productB = new Product("White-Men's S/S Crew Tee", "Medium", 200, 3.75);
        Product productC = new Product("White-Men's S/S Crew Tee", "Large", 100, 4.00);
        Product productD = new Product("Charcoal- Men's S/S Crew Tee", "Small", 150, 3.50);
        Product productE = new Product("Charcoal- Men's S/S Crew Tee", "Medium", 200, 3.75);
        Product productF = new Product("Charcoal- Men's S/S Crew Tee", "Large", 100, 4.00);


        Customer customerA = new Customer(1243.980, "John Smith", new ArrayList<>(Arrays.asList(productA, productB, productC, productD, productE)));
        Customer customerB = new Customer(2543.000, "Innocent Charles", new ArrayList<>(Arrays.asList(productC, productA, productF)));

        CustomerTransactionServicesImpl npl = new CustomerTransactionServicesImpl();

        CustomerChecker customerCheckerA = new CustomerChecker();
        customerCheckerA.setName(customerCheckerA.getName());

        CustomerChecker customerCheckerB = new CustomerChecker();
        customerCheckerB.setName(customerCheckerB.getName());

        npl.getCustomerQueueFIFO().add(customerA);
        npl.addToQueue(customerA, customerCheckerA);

        npl.getCustomerQueueFIFO().add(customerB);
        npl.addToQueue(customerA, customerCheckerB);

        npl.buyProduct(npl.getPriorityQueueMap(), npl.getCustomerQueueFIFO());

    }

}
