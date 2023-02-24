package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class AppBarLearn extends AppCompatActivity {

    Toolbar toolbar ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_learn);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Anurag Affection");
        }

        toolbar.setTitle("Anurag Affection ");
        toolbar.setSubtitle("Anurag ");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.opt_new){
            Toast.makeText(this,"Created new file", Toast.LENGTH_LONG).show();
        }
        else if (itemId == R.id.opt_save) {
            Toast.makeText(this, "Saved the file ",Toast.LENGTH_LONG).show();
        }
        else if (itemId == R.id.opt_delete){
            Toast.makeText(this, "File deleted ", Toast.LENGTH_LONG).show();
        }
        else if (itemId == R.id.opt_contact){
            Toast.makeText(this,"anuragaffection07@gmail.com", Toast.LENGTH_LONG).show();
        }
        else if (itemId == android.R.id.home){
            super.onBackPressed();
        }
        else {
            Toast.makeText(this,"File opened ", Toast.LENGTH_LONG).show();
        }


        return super.onOptionsItemSelected(item);
    }
}