package com.javawalkthrough.levelevaluation.model;

/*
* This cart class represents an object that
* holds the products that a user is likely
* to purchase. It has a field that contains
* the total of the transaction as well as the
* number of products in the cart
*/
public class Cart {
    public Product[] products;
    public double total;
    public int count;

    /*
    * This constructor initializes the cart
    * total and count to 0 and sets the
    * products field to an array of the
    * length passed as parameter
    */
    public Cart(int length)
    {

    }

    /*
    * This method adds a product to the array
    * and recalculates the total amount.
    * It also increments the count value by 1
    */
    public void addProduct(Product product) {
    }
}
