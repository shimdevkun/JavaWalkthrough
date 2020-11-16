package com.javawalkthrough.levelevaluation.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Person {
    private String name;
    private String country;
    private String[] languages;
    private int age;

    /*
    * This constructor takes a name and initializes
    * the other fields with the following data:
    * age: 25
    * country: "Canada"
    * languages: { "English", "French" }
    */


    /*
    * This constructor takes data for all fields.
    */


    /*
    * This method returns a string with all the languages spoken.
    * Ex.: languages = { "French", "Spanish", "Italian", "Japanese" }
    * Output: French, Spanish, Italian, Japanese
    */
    private String listLanguages(){
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        return "Hey there! My name is " + this.name + ". I am " + this.age + " years old. I speak the following languages: "
                + listLanguages();
    }
}
