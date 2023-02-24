package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick;
        btnClick = findViewById(R.id.btnClick);

        Button btnAnim;
        btnAnim = findViewById(R.id.btnAnim);

        Button btnLottie;
        btnLottie = findViewById(R.id.btnlottie);



        btnClick.setOnClickListener(view -> {
            Intent iNext;
            // intent creation or initialisation

            iNext = new Intent(MainActivity.this, ListLearn.class);
            // intent creation and passing

            // bundle passing always in between intent creation and intent start.
            // three types of data passing
            // using bundle passing
            // using shared preference
            // using databases

            iNext.putExtra("Title", "A A ");
            iNext.putExtra("StudentName", "Anurag Affection");
            iNext.putExtra("RollNo ", 10);
            // .putExtra () method is used for bundle passing
            // .putExtra() method is used as key value paris

            startActivity(iNext);
            // intent start
            // do not create intent startActivity on onCreate() function
        });



        btnAnim.setOnClickListener(view -> {
            Intent iAnim;
            iAnim = new Intent(MainActivity.this, Animations.class);
            startActivity(iAnim);
        });


        btnLottie.setOnClickListener(view -> {
            Intent iLottie;
            iLottie = new Intent(MainActivity.this, Lottie.class);
            startActivity(iLottie);
        });


        Button btnList;
        btnList= findViewById(R.id.btnList);
        btnList.setOnClickListener(view -> {
            Intent iList;
            iList = new Intent(MainActivity.this, ListLearn.class);
            startActivity(iList);
        });




    }
}