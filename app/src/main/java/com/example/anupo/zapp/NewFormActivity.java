package com.example.anupo.zapp;
/*
* Author: Anopum
* Subject
* date:
* Instructor:
* Lab:*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_form);

        //initializing getintent
        Intent intAn=getIntent();

        //declaring string
        String messageNew =intAn.getStringExtra("MyAnMessage");
        String message1 =intAn.getStringExtra("name");
        String message2 =intAn.getStringExtra("stdId");

        //seting the content of textview
        //txtDisplay
        TextView tv=(TextView)findViewById(R.id.tvAnu);
        tv.setText(messageNew+"\n"+message1+"\n"+message2);
    }
}
