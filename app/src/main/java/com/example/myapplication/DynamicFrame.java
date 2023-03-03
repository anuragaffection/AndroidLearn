package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class DynamicFrame extends AppCompatActivity {

    Button btnFragA, btnFragB, btnFragC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_frame);

        loadFrag(new FragmentAnu(), 0);

        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        btnFragA.setOnClickListener(view -> loadFrag(new FragmentAnu(),1));

        btnFragB.setOnClickListener(view -> loadFrag(new FragmentKumar(),1));

        btnFragC.setOnClickListener(view -> loadFrag(new FragmentAffection(),1));

    }

    public void loadFrag (Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag == 0){
            ft.add(R.id.container1, fragment);
        }
        else {
            ft.replace(R.id.container1, fragment);
        }

        ft.commit();
    }
}