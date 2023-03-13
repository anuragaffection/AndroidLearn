package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class DatabaseLearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_learn);

        MyDBHelper dbHelper = new MyDBHelper(this);

        dbHelper.addContacts("Raman1", "9876543218");
        dbHelper.addContacts("Raman2", "9876543217");
        dbHelper.addContacts("Raman3", "9876543216");
        dbHelper.addContacts("Raman4", "9876543215");
        dbHelper.addContacts("Raman5", "9876543214");
        dbHelper.addContacts("Raman6", "9876543213");
        dbHelper.addContacts("Raman7", "9876543212");
        dbHelper.addContacts("Raman8", "9876543211");



        ArrayList<ContactModel1> arrContacts = dbHelper.fetchContacts();

    }
}