package org.example.Task3Band4.Services.ServiceImpl;

import org.example.Task3Band4.Entities.Customer;
import org.example.Task3Band4.Entities.Product;
import org.example.Task3Band4.Services.Sales;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.example.Task3Band4.Entities.Store.customersList;

public class PTBQ implements Sales {
public static Queue<Product> productQueue = new PriorityQueue<>(Collections.reverseOrder());
    @Override
    public void attendToCustomer() {
        for ( Customer x : customersList){
            for (Product p : x.getCart()){
                productQueue.offer(p);
            }
        }
        while (productQueue.peek() != null){
            System.out.println(productQueue.poll());
        }
    }

    /** // Task 4: Using Lambda expression
    @Override
    public void attendToCustomer(){
        customersList.forEach(customer -> {customer.getCart()
                .forEach(product -> {productQueue.offer(product);} );
        });
        productQueue.stream().forEach(System.out::println);
    }*/
}
