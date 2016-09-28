package com.example.alex.pract2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //MODEL
    private Person person1;
    private Person person2;
    private Person person3;
    private Person[] people;

    //VIEW
    private TextView nameView;
    private TextView emailView;
    private TextView phoneNumView;
    private ImageView imageView;

    private int personNum=0;
    /*

    private int sallyPicID;
    private int jackSparrowPicID;
    private int harrisPicID;
    */

    /*
    Description: When the app is started, three person objects are created and added to list of people
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* //define the image IDs
        sallyPicID = R.drawable.sallyomalley;
        jackSparrowPicID = R.drawable.jacksparrow;
        harrisPicID = R.drawable.dog;
        //create person objects using the person class
        person1 = new Person("Sally O'Malley", "SallyOMally@gmail.com", "555-5555", sallyPicID);
        person2 = new Person("Jack Sparrow", "pirate@arrrrr.com", "123-1234", jackSparrowPicID);
        person3 = new Person("Harris Barker", "imadog@barkbark.com", "129-1995", harrisPicID);

        //make a list of people
        people = new Person[3];
        people[0]=person1;
        people[1]=person2;
        people[2]=person3; */


        //PersonStorage.createPeople();
        nameView = (TextView)findViewById(R.id.nameView);
        emailView = (TextView)findViewById(R.id.emailView);
        phoneNumView = (TextView)findViewById(R.id.phoneNumView);
        imageView = (ImageView)findViewById(R.id.imageView);

    }

/*
    Description: When next_btn is clicked on the UI, this functions goes through the list of people and
    changes the name, email, phone number, and picture on the UI.
    Last Modified: 9/18/2016

 */
    public void displayNextPerson(View view){
        //iterate through the list of people
        personNum++;
        if(personNum==people.length){
            personNum=0;
        }
        //set view of same, email, phone, and picture
        //emailView.setText(people[personNum].getEmail());

                //person1.getEmail());
        //phoneNumView.setText(people[personNum].getPhoneNumber());
        //imageView.setBackgroundResource(people[personNum].getImage());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
