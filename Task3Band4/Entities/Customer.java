package org.example.Task3Band4.Entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Product> cart = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
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

    public void setCart(Product product) {
        this.cart.add(product);
    }

    public void selectProduct(Product product, int quantity){
        product.setUnit(quantity);
        product.setAmount(quantity*product.getUnitPrize());
        cart.add(product);
    }

    @Override
    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                ", cart=" + cart +
//                '}' + "\n";
        return "Name: " + name + "\ncart: " + cart + "\n";
    }
}
