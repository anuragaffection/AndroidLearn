package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerLearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_learn);



        Spinner spinner1 = findViewById(R.id.spinner1);

        ArrayList <String> arrIdName = new ArrayList<>();

        arrIdName.add("Aadhar Card ");
        arrIdName.add("Pan Card");
        arrIdName.add("Voter ID Card ");
        arrIdName.add("Atm Card ");
        arrIdName.add("Credit Card ");
        arrIdName.add("Debit Card ");
        arrIdName.add("Driving License Card ");
        arrIdName.add("Ration Card ");
        arrIdName.add("Student Id Card ");


        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIdName);
        spinner1.setAdapter(spinnerAdapter);




        AutoCompleteTextView autoText1;
        autoText1 = findViewById(R.id.autoText1);

        ArrayList<String> arrLanguage = new ArrayList<>();

        arrLanguage.add("C");
        arrLanguage.add("c++");
        arrLanguage.add("C#");
        arrLanguage.add("CSript");
        arrLanguage.add("Objective c");
        arrLanguage.add("Java");
        arrLanguage.add("JavaScript");
        arrLanguage.add("php");
        arrLanguage.add("Kotlin");
        arrLanguage.add("Dart");
        arrLanguage.add("Go");
        arrLanguage.add("Ruby");
        arrLanguage.add("Python");
        arrLanguage.add("Swift");

        ArrayAdapter<String> autoTextAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguage);

        autoText1.setAdapter(autoTextAdapter);
        autoText1.setThreshold(1);

    }
}