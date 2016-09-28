package com.example.alex.pract2;

import android.media.Image;

/**
 * File: Person.java
 * Author: Alex DiStasi
 * Created On: 9/15/2016
 * Purpose: A person class that stores and returns the name, email, and number of an individual.
 */
public class Person {

    private String pName;
    private String pEmail;
    private String pPhoneNumber;
    private int pImage;


    //Description: Defines the name, email, phone number, and image of an object in class person
    //input: String name, String email, String phonenumber, int image
    public Person(String name, String email, String phoneNumber, int image){
        pName = name;
        pEmail = email;
        pPhoneNumber = phoneNumber;
        pImage = image;

    }


    //Description: returns the name(string) of a person
    public String getName(){
        return pName;
    }

    //Description: returns the email(string) of a person
    public String getEmail(){
        return pEmail;
    }

    //Description: returns the phone number (string) of a person
    public String getPhoneNumber(){
        return pPhoneNumber;
    }

    //returns the image id (int) of a person
    public int getImage(){
        return pImage;
    }


}
