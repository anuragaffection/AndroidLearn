package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnAnim;
    Button btnLottie;
    Button btnList;
    BottomNavigationView bottomNV;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnClick = findViewById(R.id.btnClick);
        btnAnim = findViewById(R.id.btnAnim);
        btnLottie = findViewById(R.id.btnlottie);
        btnList= findViewById(R.id.btnList);
        bottomNV = findViewById(R.id.bottomNV);


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

        btnList.setOnClickListener(view -> {
            Intent iList;
            iList = new Intent(MainActivity.this, ListLearn.class);
            startActivity(iList);
        });

        bottomNV.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home){
                loadFrag(new FragmentAnu(), true);
            }
            else if (id == R.id.nav_search){
                loadFrag(new FragmentAffection(), true);
            }
            else if ( id == R.id.nav_profile){
                Intent iList;
                iList = new Intent(MainActivity.this, ListLearn.class);
                startActivity(iList);
            }
            else if (id == R.id.nav_utility){
                Intent iLottie;
                iLottie = new Intent(MainActivity.this, Lottie.class);
                startActivity(iLottie);
            }
            else {
                loadFrag(new FragmentKumar(), false);
            }

            return false;

        });
        bottomNV.setSelectedItemId(R.id.nav_profile);


    }

    public void loadFrag (Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.containerNav, fragment);
        ft.commit();
    }
}