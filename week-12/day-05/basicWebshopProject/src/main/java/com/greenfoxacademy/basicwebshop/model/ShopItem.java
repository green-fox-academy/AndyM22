package com.greenfoxacademy.basicwebshop.model;

public class ShopItem {

    private String name;
    private String description;
    private double price;
    private int quantityOfStock;
    private types type;

    public ShopItem(String name, String description, double price, int quantityOfStock, types type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
        this.type = type;
    }

        public types getType() {
        return type;
    }

    public void setType(types type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }
}
