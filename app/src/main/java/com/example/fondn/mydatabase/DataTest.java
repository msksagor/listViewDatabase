package com.example.fondn.mydatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataTest extends Activity {
    EditText name,number;
    Button button;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_test);
        textview = (TextView) findViewById(R.id.text);
        name = (EditText) findViewById(R.id.editTextID);

        button = (Button) findViewById(R.id.button);

       final DatabaseHandler db = new DatabaseHandler(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = name.getText().toString();



                db.addContact(new Contact(names));

                Intent i = new Intent(DataTest.this,Sagor.class);
                startActivity(i);
            }
        });



    }

    void insert(){
        DatabaseHandler db = new DatabaseHandler(this);





    }


}
