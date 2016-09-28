package com.example.alex.pract2;

/**
 * Created by Alex on 9/20/2016.
 */
public class PersonStorage {
    //MODEL
    public Person person1;
    private Person person2;
    private Person person3;
    public Person[] people;

    private int personNum=0;
    private int sallyPicID;
    private int jackSparrowPicID;
    private int harrisPicID;


    public void createPeople(){
        //define the image IDs
        sallyPicID = R.drawable.sallyomalley;
        jackSparrowPicID = R.drawable.jacksparrow;
        harrisPicID = R.drawable.dog;

        person1 = new Person("Sally O'Malley", "SallyOMally@gmail.com", "555-5555", sallyPicID);
        person2 = new Person("Jack Sparrow", "pirate@arrrrr.com", "123-1234", jackSparrowPicID);
        person3 = new Person("Harris Barker", "imadog@barkbark.com", "129-1995", harrisPicID);

        //make a list of people
        people = new Person[3];
        people[0]=person1;
        people[1]=person2;
        people[2]=person3;
    }
}
