package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {

            SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
            Boolean check = pref.getBoolean("flag", false);

            Intent iNext;
            if (check){
                iNext = new Intent(splash_screen.this, MainActivity.class);
            }
            else {
                iNext = new Intent(splash_screen.this, LoginPage.class);
            }

            startActivity(iNext);
            finish();
        }, 3000);


        // to make splash screen first change the intent from mainActivity to splash_screen
        // go to androidManifest.xml and change the intent filter
        // Handler() function to handle time


    }
}