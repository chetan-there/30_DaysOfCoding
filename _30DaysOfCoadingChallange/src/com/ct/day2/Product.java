package com.ct.day2;

public class Product {
    private int id;
    private String name;
    private double price;
    private String category;
    private double rating;

    public Product(int id, String name, double price, String category, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return name + " : ₹" + price + " | Category: " + category + " | Rating: " + rating;
    }
}
