package com.market;

import java.util.List;

public class MarketPlace {
    public static void main(String[] args) {
        Catalog<Book> bookCatalog = new Catalog<>();
        bookCatalog.addProduct(new Book("The Alchemist", 299));
        bookCatalog.addProduct(new Book("Clean Code", 499));

        Catalog<Clothing> clothingCatalog = new Catalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 399));

        Catalog<Gadget> gadgetCatalog = new Catalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartwatch", 2999));

        
        showCatalog(bookCatalog.getProducts());
        showCatalog(clothingCatalog.getProducts());
        showCatalog(gadgetCatalog.getProducts());
    }
    public static void showCatalog(List<? extends Product> items) {
	    for (Product item : items) {
	        System.out.println(item);
	    }
	}
}
