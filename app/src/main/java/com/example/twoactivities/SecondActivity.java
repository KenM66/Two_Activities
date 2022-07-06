package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras= getIntent().getExtras();
        String name= extras.getString("name");

        System.out.println(name);
        TextView tv= findViewById(R.id.textView);


        tv.setText(name);

    }
}