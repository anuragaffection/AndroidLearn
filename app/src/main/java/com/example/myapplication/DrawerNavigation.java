package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


import com.google.android.material.navigation.NavigationView;

public class DrawerNavigation extends AppCompatActivity {

    DrawerLayout drawerNavigation;
    NavigationView navigationView;
    Toolbar toolbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_navigation);

        drawerNavigation = findViewById(R.id.drawerNavigation);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerNavigation, toolbar, R.string.openDrawer, R.string.closeDrawer);

        drawerNavigation.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home){
                loadFrag(new FragmentAnu(), true);
            }
            else if (id == R.id.nav_search){
                loadFrag(new FragmentAffection(), true);
            }
            else if ( id == R.id.nav_profile){
                Intent iHome;
                iHome = new Intent(DrawerNavigation.this, MainActivity.class);
                startActivity(iHome);
            }
            else if (id == R.id.nav_utility){
                Intent iLottie;
                iLottie = new Intent(DrawerNavigation.this, Lottie.class);
                startActivity(iLottie);
            }
            else {
                loadFrag(new FragmentKumar(), false);
            }

            drawerNavigation.closeDrawer(GravityCompat.START);
            return true;
        });

    }

    @Override
    public void onBackPressed() {
        if (drawerNavigation.isDrawerOpen(GravityCompat.START)){
            drawerNavigation.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }

    public void loadFrag (Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.containerNav, fragment);
        ft.commit();
    }

}