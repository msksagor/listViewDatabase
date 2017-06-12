package com.example.fondn.mydatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Sagor extends AppCompatActivity {
   ListView listView;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sagor);
        listView = (ListView) findViewById(R.id.listVIewID);
        String[] nameArray= {"Sagor","khan","sabuj","Dhaka","Bangladesh"};

        DatabaseHandler db = new DatabaseHandler(this);

        //customAdapter = new CustomAdapter(getApplicationContext(),nameArray);
        customAdapter = new CustomAdapter(getApplicationContext(),db.getData());
        listView.setAdapter(customAdapter);






        // Reading all contacts
  /*
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            //String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            String log = " ,Name: " + cn.getName() ;
            // Writing Contacts to log

        }*/


    }
}
