package org.example.TASK_3.Services;

import org.example.TASK_3.Entities.Customer;
import org.example.TASK_3.Entities.CustomerChecker;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public interface CustomerTransactionServices {
    void addToQueue(Customer customer, CustomerChecker customerChecker);

    void buyProduct(Map<String, PriorityQueue<CustomerChecker>> priorityQueueMap, Queue<Customer> customerQueue);
}
