package com.generics;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Rice"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("=== Electronics ===");
        WarehouseUtils.displayAllItems(electronicsStorage.getItems());

        System.out.println("=== Groceries ===");
        WarehouseUtils.displayAllItems(groceriesStorage.getItems());

        System.out.println("=== Furniture ===");
        WarehouseUtils.displayAllItems(furnitureStorage.getItems());
    }
}

