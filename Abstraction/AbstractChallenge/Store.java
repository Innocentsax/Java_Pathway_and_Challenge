package org.example.Abstraction.AbstractChallenge;

import java.util.ArrayList;

/**
 * In this challenge, you need to build an application, that can be a store front,
 * for any imaginable item for sale.
 *
 * Instead of the Main class we usually create, create a store class, with a main method.
 * The store class should:
 * a. Manage a list of products for sale, including displaying the product details
 * b. Manage an order, which can just be a list of Order Item objects.
 * c. Have methods to add an item to the order, and print the ordered items. so it looks lie a sales receipt.
 *
 * Create a ProductForSale class that should have at least three fields: a type, price, and a description, and should have methods to:
 * a. get a sale price, a concrete method, which takes a quantity, and returns the quantity times the price.
 * b. Print a priced line item, a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and line item price.
 * c. show details, an abstract method, which represents what might be displayed on a product page, product type, description, price , and so on.
 *
 * Create an OrderItem type, that has at minimum 2 fields, quantity and Product for sale.
 * You should create two or three classes that extend the ProductForSale class, that will be product in your store.
 */
record OrderItem(int quantity, ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produce in 1950"));
        storeProducts.add(new furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));


        listProduct();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        printOrder(order2);
    }

    public static void listProduct(){
        for (var item : storeProducts){
            System.out.println("-".repeat(50));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
        order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.product().printPricedItem(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}
