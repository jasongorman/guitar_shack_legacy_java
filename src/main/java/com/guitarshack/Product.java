package com.guitarshack;

public class Product {
    private final int stock;
    private final int id;
    private final int leadTime;

    public Product(int id, int stock, int leadTime) {
        this.stock = stock;
        this.id = id;
        this.leadTime = leadTime;
    }

    public int getLeadTime() {
        return leadTime;
    }

    public int getId() {
        return id;
    }

    public int getStock() { return stock; }
}
