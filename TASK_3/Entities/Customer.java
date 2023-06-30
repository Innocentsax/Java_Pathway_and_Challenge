package org.example.TASK_3.Entities;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer>{
    private double wallet;
    private String name;
    private List<Product> cart = new ArrayList<>();

    public Customer(double wallet, String name, List<Product> cart) {
        this.wallet = wallet;
        this.name = name;
        this.cart = cart;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
