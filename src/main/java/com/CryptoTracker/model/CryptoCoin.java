package com.CryptoTracker.model;

public class CryptoCoin {
    private String id;
    private String name;
    private double price;
    private double change24h;

    public CryptoCoin() {
    }

    public CryptoCoin(String id, String name, double change24h, double price) {
        this.id = id;
        this.name = name;
        this.change24h = change24h;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange24h() {
        return change24h;
    }

    public void setChange24h(double change24h) {
        this.change24h = change24h;
    }
}
