package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent fromAct1;
        String title;
        String studentName;
        int rollNo;
        // initialisation


        fromAct1 = getIntent();
        title = fromAct1.getStringExtra("Title");
        studentName = fromAct1.getStringExtra("StudentName");
        rollNo = fromAct1.getIntExtra("RollNo", 1);
        // getting from mainActivity.java


        TextView textForBundle;
        textForBundle = findViewById(R.id.textForBundle);
        String display = "Title = " + title + "\nName = " + studentName + "\nRoll = " + rollNo;
        textForBundle.setText(display);
        // getting and setting the value from xml of activity_main2.xml


        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
        // setting title in action bar





    }
}