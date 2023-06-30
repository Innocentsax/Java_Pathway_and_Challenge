package org.example.TASK_3.ServicesImpl;

import org.example.TASK_3.Entities.Customer;
import org.example.TASK_3.Entities.CustomerChecker;
import org.example.TASK_3.Services.CustomerTransactionServices;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CustomerTransactionServicesImpl implements CustomerTransactionServices {
    private PriorityQueue<CustomerChecker>
            customerCheckerPriorityQueue = new PriorityQueue<>(10, new CustomerChecker());
    private Map<String,
            PriorityQueue<CustomerChecker>> priorityQueueMap = new HashMap<>();
    private static Queue<Customer>
            customerQueueFIFO = new PriorityQueue<>();

    @Override
    public void addToQueue(Customer customer, CustomerChecker customerChecker) {
        customerQueueFIFO.add(customer);
        customer.getCart().forEach(product -> {customerChecker.setQuantity(product.getUnit());
        if(priorityQueueMap.containsKey(product.getName())){
            priorityQueueMap.get(product.getName()).add(customerChecker);
        }else{
            customerCheckerPriorityQueue.add(customerChecker);
            priorityQueueMap.put(product.getName(), customerCheckerPriorityQueue);
        }
        });
        System.out.println("You have added " + customer.getName() + "to the FIFO Queue");
    }

    @Override
    public void buyProduct(Map<String, PriorityQueue<CustomerChecker>> priorityQueueMap, Queue<Customer> customerQueue) {
        assert customerQueueFIFO.peek() != null;
        customerQueueFIFO.peek().getCart().forEach(product -> {
            CustomerChecker removed_Customer;
            while (priorityQueueMap.get(product.getName()).peek() != null){
                removed_Customer = priorityQueueMap.get(product.getName()).poll();
                System.out.println("You have attended to " + removed_Customer.getName() + " from the " + product.getName() + " queue");
            }
        });
    }

    public PriorityQueue<CustomerChecker> getCustomerCheckerPriorityQueue() {
        return customerCheckerPriorityQueue;
    }

    public void setCustomerCheckerPriorityQueue(PriorityQueue<CustomerChecker> customerCheckerPriorityQueue) {
        this.customerCheckerPriorityQueue = customerCheckerPriorityQueue;
    }

    public Map<String, PriorityQueue<CustomerChecker>> getPriorityQueueMap() {
        return priorityQueueMap;
    }

    public void setPriorityQueueMap(Map<String, PriorityQueue<CustomerChecker>> priorityQueueMap) {
        this.priorityQueueMap = priorityQueueMap;
    }

    public Queue<Customer> getCustomerQueueFIFO() {
        return customerQueueFIFO;
    }

    //public void Queue

//    public void Queue<Customer> setCustomerQueueFIFO() {
//        this.customerQueueFIFO = customerQueueFIFO;
//    }

    public void setCustomerQueueFIFO(Queue<Customer> customerQueueFIFO) {
        this.customerQueueFIFO = customerQueueFIFO;
    }
}
