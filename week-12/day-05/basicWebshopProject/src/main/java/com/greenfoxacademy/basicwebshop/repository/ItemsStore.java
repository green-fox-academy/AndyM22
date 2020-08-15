package com.greenfoxacademy.basicwebshop.repository;

import com.greenfoxacademy.basicwebshop.model.ShopItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsStore {

    private List<ShopItem> repository;

    public ItemsStore() {
        this.repository = new ArrayList<>();
        this.repository.add(new ShopItem("Running Shoes", "Nike running shoes for everyday sport", 1000, 5));
        this.repository.add(new ShopItem("Printer", "Some HP printer, that will print pages", 3000, 2));
        this.repository.add(new ShopItem("Coca Cola", "0.5 standard coke", 25, 0));
        this.repository.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100));
        this.repository.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300, 1));
    }

    public List<ShopItem> getRepository() {
        return repository;
    }

    public void setRepository(List<ShopItem> repository) {
        this.repository = repository;
    }

    public List<ShopItem> isAvailable() {
        return this.repository.stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    public List<ShopItem> orderCheapestFirst() {
        return this.repository.stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    public List<ShopItem> containsWord(String name) {
        return this.repository.stream()
                .filter(ShopItem -> ShopItem.getName().toLowerCase().contains(name.toLowerCase()) || ShopItem.getDescription().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    public double averageOfStock() {
        return this.repository.stream()
                .mapToDouble(ShopItem::getQuantityOfStock)
                .average()
                .getAsDouble();
    }

    public String theMostExpansiveItem() {
        return this.repository.stream()
                .max(Comparator.comparingDouble(ShopItem::getPrice))
                .get().getName();
    }

}
