package com.market;

//Abstract base class
abstract class Product {
 private String name;
 private double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public abstract String getCategory();

 public String getName() { return name; }
 public double getPrice() { return price; }

 public void setPrice(double price) {
     this.price = price;
 }

 public String toString() {
     return name + " [" + getCategory() + "] - ₹" + price;
 }
}
 
