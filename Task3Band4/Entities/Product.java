package org.example.Task3Band4.Entities;

public class Product implements Comparable<Product>{
    private String description;
    private int unit;
    private double unitPrize;
    private double amount;

//    public Product(String description, int unit, int unitPrize, int amount) {
//        this.description = description;
//        this.unit = unit;
//        this.unitPrize = unitPrize;
//        this.amount = amount;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getUnitPrize() {
        return unitPrize;
    }

    public void setUnitPrize(double unitPrize) {
        this.unitPrize = unitPrize;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
//        return "Product{" +
//                "description='" + description + '\'' +
//                ", unit=" + unit +
//                ", unitPrize=" + unitPrize +
//                ", amount=" + amount +
//                '}' + "\n";
        return "Description: " + description + "\nUnit: " + unit + "\nUnitPrize: " + unitPrize + "\nAmount: " + amount + "\n";

    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.unit, o.getUnit());
    }
}
