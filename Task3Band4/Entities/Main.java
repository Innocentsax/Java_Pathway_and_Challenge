package org.example.Task3Band4.Entities;

import org.example.Task3Band4.Services.ServiceImpl.PTBQ;

import java.io.IOException;

import static org.example.Task3Band4.Entities.ReaderClass.readFile;
import static org.example.Task3Band4.Entities.Store.*;

public class Main {
    public static void main(String[] args) throws IOException {
        readFile();
        System.out.println(products);
        Customer customer1 = new Customer("Paul");
        customer1.selectProduct(products.get(3), 3);
        customersList.add(customer1);

        Customer customer2 = new Customer("David");
        customer2.selectProduct(products.get(2), 2);
        customersList.add(customer2);

        Customer customer3 = new Customer("Innocent");
        customer3.selectProduct(products.get(4), 5);
        customersList.add(customer3);

//        FIFOImpl fifo = new FIFOImpl();
//        fifo.attendToCustomer();
//        //System.out.println(availableUnit);

        PTBQ ptbq = new PTBQ();
        ptbq.attendToCustomer();
        System.out.println(availableUnit);

    }


}