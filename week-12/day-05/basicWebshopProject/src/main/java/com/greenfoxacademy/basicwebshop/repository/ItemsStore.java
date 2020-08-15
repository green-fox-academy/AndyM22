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
                .filter(ShopItem -> ShopItem.getName().contains(name) || ShopItem.getDescription().contains(name))
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
