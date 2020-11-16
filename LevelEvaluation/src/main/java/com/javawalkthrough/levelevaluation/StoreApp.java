package com.javawalkthrough.levelevaluation;

import com.javawalkthrough.levelevaluation.model.Customer;
import com.javawalkthrough.levelevaluation.model.Store;

import java.util.Scanner;

public class StoreApp {
    /*
     * -------------- DO NOT EDIT ANY OF THE CODE PROVIDED --------------
     *
     * This method allows a user named Mikes to add products to his cart
     * The text after * should be displayed in the console
     * The text surrounded by -- is an example of a user input
     * You must complete the todos in the Store class first
     * You must use the Store class
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer("Mikes");
        Store store = new Store();

        char choice = ' ';
        char checkout = 'c';

        // Hello Mikes!
        System.out.println();

        while (choice != checkout) {
            // TODO: Print the store products
            // * Here is the list of our products:
            // * 1 Apple 1.00
            // * 2 Juice 7.50
            // * 3 Bread 2.50
            // * 4 Cookies 3.75
            // * 5 Cereal 4.00
            // * 6 Milk 4.50

            System.out.println();

            // * Enter a number to add a product to your cart
            // * or c to proceed to checkout

            // -- 4 --
            // TODO: Store the user's choice in the choice variable


            // -------------- SCENARIOS --------------
            // *** SCENARIO 1: user enters c ***
            // * Your cart contains the following items:
            // * Milk, Cereal, Cookies
            // * Your total is $xx.xx
            // * Thank you for shopping at StoreApp

            // *** SCENARIO 2: Item is not in cart ***
            // * You have successfully added "Cookies"

            // *** SCENARIO 3: Item is in cart ***
            // * This product is already in your cart
            // -------------- SCENARIOS --------------


            // TODO: If SCENARIO 1: Print the customer's cart info
            // TODO: If SCENARIO 2: Add the product to the user's cart and indicate it to the user
            // TODO: If SCENARIO 3: Tell the user that the product is already in their cart


            System.out.println();
        }
    }
}
