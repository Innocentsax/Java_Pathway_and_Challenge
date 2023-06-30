package org.example.TASK_3.Entities;

import java.util.Comparator;

public class CustomerChecker implements Comparator<CustomerChecker> {
    private String name;
    private long quantity;

    @Override
    public int compare(CustomerChecker o1, CustomerChecker o2) {
        return Long.compare(o2.quantity, o1.quantity);
    }
    public CustomerChecker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }


}
