package com.raven.streams;

public class Item {
    private int id;
    private double price;
    private int stock;

    public Item() {
    }

    public Item(int id, double price, int stock) {
        this.id = id;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
