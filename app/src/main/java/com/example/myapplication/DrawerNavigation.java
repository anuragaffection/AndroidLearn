package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class DrawerNavigation extends AppCompatActivity {

    DrawerLayout drawerNavigation;
    NavigationView navigationView;
    // Toolbar toolbar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_navigation);

        drawerNavigation = findViewById(R.id.drawerNavigation);
        navigationView = findViewById(R.id.navigationView);

        //  toolbar = findViewById(R.id.toolbar);

        // setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerNavigation, R.string.openDrawer, R.string.closeDrawer);

        drawerNavigation.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home){
                Intent iList;
                iList = new Intent(DrawerNavigation.this, ListLearn.class);
                startActivity(iList);
            }
            else if (id == R.id.nav_search){
                Toast.makeText(getApplicationContext(), "Clicked Search", Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(), "Clicked ", Toast.LENGTH_LONG).show();
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerNavigation, R.string.openDrawer, R.string.closeDrawer);

        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}