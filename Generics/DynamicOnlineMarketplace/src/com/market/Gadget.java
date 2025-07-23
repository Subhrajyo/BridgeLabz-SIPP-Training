package com.market;

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    public String getCategory() {
        return "Gadget";
    }
}