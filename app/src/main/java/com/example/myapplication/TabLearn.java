package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabLearn extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_learn);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tab.setupWithViewPager(viewPager);

    }
}