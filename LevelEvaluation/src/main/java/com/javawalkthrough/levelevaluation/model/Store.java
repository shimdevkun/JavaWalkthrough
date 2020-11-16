package com.javawalkthrough.levelevaluation.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

public class Store {
    private Product[] products;
    public Product[] getProducts(){
        return this.products;
    }

    /*
    * This method prints all the products available.
    * Ex.: products = {
    *   new Product(Cookies, 2.50),
    *   new Product(Bread, 5.00),
    *   new Product(Milk, 3.75)
    * }
    * Considering the array above, we should obtain:
    * 1 Cookies 2.50
    * 2 Bread 5.00
    * 3 Milk 3.75
    */
    public void displayProducts() {
        // TODO: Implement this method to match the description above
        for (int i = 0; i < products.length; i++) {
            String productInfo = String.format("%d %s %.2f", i+1, products[i].getName(), products[i].getPrice());
            System.out.println(productInfo);
        }
    }

    /*
     * This method retrieves the product from the products field
     * whose position corresponds to the index provided. It then
     * checks if the cart contains the product.
     * @Returns true if product is in cart
     *          or false if it is not
     */
    public boolean isProductInCart(int index, Cart cart) {
        // TODO: Implement this method to match the description above
        Product product = products[index];
        for (int i = 0; i < cart.count; i++)
            if (cart.products[i].getName().equals(product.getName()))
                return true;
        return false;
        //throw new NotImplementedException();
    }

    // ----------------------------------------------
    // -------- DO NOT MODIFY THE SETUP CODE --------
    // ----------------------------------------------
    //region SETUP
    public Store() {
        initializeStore();
    }

    /*
     * This method initializes the store with some products
     */
    private void initializeStore() {
        this.products = new Product[6];
        String[] names = { "Apple", "Juice", "Bread", "Cookies", "Cereal", "Milk"};
        double[] prices = { 1.00, 7.50, 2.50, 3.75, 4.00, 4.50 };

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product(names[i], prices[i]);
        }
    }
    //endregion
}
