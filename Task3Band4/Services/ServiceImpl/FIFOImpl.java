package org.example.Task3Band4.Services.ServiceImpl;

import org.example.Task3Band4.Entities.Customer;
import org.example.Task3Band4.Entities.Product;
import org.example.Task3Band4.Services.Sales;

import java.util.LinkedList;
import java.util.Queue;

import static org.example.Task3Band4.Entities.Store.availableUnit;
import static org.example.Task3Band4.Entities.Store.customersList;

public class FIFOImpl implements Sales {
    public static Queue<Customer> fifoQueue = new LinkedList<>();
    @Override
    public void attendToCustomer() {

        for (Customer customer : customersList){
            for (Product i : customer.getCart()){
                int remainingUnit = availableUnit.get(i.getDescription()) - i.getUnit();
                availableUnit.replace(i.getDescription(), remainingUnit);
            }
            fifoQueue.offer(customer);
        }
        while(fifoQueue.peek() != null) {
            System.out.println(fifoQueue.poll());
        }
    }

   /** // Tasks 4: Using Lambda expression
    @Override
    public void attendToCustomer2(){
        customersList.forEach(customer -> {customer
                .getCart().forEach(product -> {
                    int remainingUnit = availableUnit.get(product.getDescription()) - product.getUnit();
                    availableUnit.replace(product.getDescription(), remainingUnit);
                });
            fifoQueue.offer(customer);
        });
        fifoQueue.stream().forEach(System.out::println);
    }*/
}
