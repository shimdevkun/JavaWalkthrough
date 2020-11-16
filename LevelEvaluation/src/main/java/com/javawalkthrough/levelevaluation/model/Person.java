package com.javawalkthrough.levelevaluation.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
* This class represents a person's entity. It contains their name, age,
* country and the languages they speak. The toString() method prints
* how they would introduce themselves.
*/
public class Person {
    private String name;
    private int age;
    private String country;
    private String[] languages;

    // TODO: Implement a getter for the person's name
    /*
    * This getter returns the person's name
    */
    public String getName() { return this.name; }

    // TODO: Implement a getter for the person's age
    /*
     * This getter returns the person's age
     */
    public int getAge() { return this.age; }

    // TODO: Implement a getter for the person's country
    /*
     * This getter returns the person's country
     */
    public String getCountry() { return this.country; }


    // TODO: Implement a constructor with a name as parameter
    /*
    * This constructor takes a name and initializes
    * the other fields with the following data:
    * age: 25
    * country: "Canada"
    * languages: { "English", "French" }
    */
    public Person(String name) {
        this.name = name;
        this.age = 25;
        this.country = "Canada";
        this.languages = new String[]{ "English", "French" };
    }

    // TODO: Implement a constructor with parameters for each field
    /*
    * This constructor takes data for all fields.
    */
    public Person(String name, int age, String country, String[] languages) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.languages = languages;
    }


    /*
    * This method returns a string with all the languages spoken.
    * Ex.: languages = { "French", "Spanish", "Italian", "Japanese" }
    * Output: French, Spanish, Italian, Japanese
    */
    private String listLanguages(){
        // TODO: Implement the following method to match the description above
        String message = "";
        int length = languages.length;
        for (int i = 0; i < length - 1; i++)
            message += languages[i] + ", ";
        message += languages[length - 1];

        return message;
        //throw new NotImplementedException(); // comment this line when the implementation is done
    }

    @Override
    public String toString() {
        return "Hey there! My name is " + this.name + ". I am " + this.age + " years old. I speak the following languages: "
                + listLanguages();
    }
}
