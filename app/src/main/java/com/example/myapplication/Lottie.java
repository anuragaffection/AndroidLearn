package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Lottie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);

        TextView txtLottie;
        txtLottie = findViewById(R.id.txtLottie);



        String lottie = "A lottie is a json based animation file format that enables designers to ship animations on any platform as easily as shipping static assets. \nTo use lottie animations in our project we need to integrate lottie project library.\n\nLibrary :- It is structurally the same as android app module. \nIt can include everything needed to build an app . \nInstead of compiling into an APK, it compiles into an Android Archive (AAR ) file that is used as an dependency for an Android app module.\n\nImportant attributes:- \napp:lottie_repeatCount = \napp:lottie_repeatMode = ";

        txtLottie.setText(lottie);

    }
}