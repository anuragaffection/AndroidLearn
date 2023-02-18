package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Animations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

        TextView txtAnu;
        Button btnTranslate, btnAlpha, btnRotate, btnScale;


        txtAnu = findViewById(R.id.txtAnu);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);


        btnTranslate.setOnClickListener(view -> {
           Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
            txtAnu.startAnimation(move);
        });


        btnAlpha.setOnClickListener(view -> {
           Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
           txtAnu.startAnimation(alpha);
        });


        btnRotate.setOnClickListener(view -> {
            Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            txtAnu.startAnimation(rotate);
        });


        btnScale.setOnClickListener(view -> {
            Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
            txtAnu.startAnimation(scale);
        });







        // animation is the process of creating motion and shape change.
        // these are used when the UI changes state, such as when new content loads
        // animations also add a polished look to your app which gives is a higher quality look and feel
        //

        // types of animations
        // scale animations
        // rotate animations
        // translate(move) animations
        // alpha animations

        // important attributes
        // android:interpolator =
        // android:duration =
        // android:fillAfter =
        // android:interpolator =
        // android:startOffset =
        // android:repeatMode =
        // android:repeatCount =
        //


        // create anim folder ( anim is default name for animations )
        // create anim folder within resources folder
        // create move folder under anim folder


    }
}