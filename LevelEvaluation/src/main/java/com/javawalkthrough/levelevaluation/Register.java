package com.javawalkthrough.levelevaluation;

import com.javawalkthrough.levelevaluation.model.Person;
import java.util.Scanner;

public class Register {
    /*
     * -------------- DO NOT EDIT ANY OF THE CODE PROVIDED --------------
     *
     * This method prints info provided by a user about themselves
     * The text after * should be displayed in the console
     * The text surrounded by -- is an example of a user input
     * You must complete the todos in the Person class first
     * You must use the Person class with its toString method
     *
     * --- Feel free to create any variables that you consider a must ---
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person;

        // * Hello, please enter your name:
        // -- Max --
        System.out.println("Hello, please enter your name:");
        String name = scanner.nextLine();

        // * How old are you?
        // -- 25 --
        System.out.println("How old are you?");
        String age = scanner.nextLine();

        // * Where are you from?
        // -- United States --
        System.out.println("Where are you from?");
        String country = scanner.nextLine();

        // * What languages do you speak?
        // -- English French Japanese --
        System.out.println("What languages do you speak?");
        String[] languages = scanner.nextLine().split(" ");

        System.out.println();

        // * Hey there! My name is Max.
        // * I am from the United States and I am 25 years old.
        // * I speak the following languages: English, French, Japanese.
        person = new Person(name, Integer.parseInt(age), country, languages);
        System.out.println(person.toString());
    }
}
