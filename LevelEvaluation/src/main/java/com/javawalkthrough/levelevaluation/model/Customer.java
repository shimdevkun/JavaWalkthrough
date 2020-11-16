package com.javawalkthrough.levelevaluation.model;

public class Customer extends Person {
    private Cart cart = new Cart(6);

    public Cart getCart() { return this.cart; }

    public Customer(String name) {
        // TODO: Uncomment the line below once the first Person constructor is set
        super(name);
    }
}
