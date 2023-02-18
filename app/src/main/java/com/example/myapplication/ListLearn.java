package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListLearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_learn);


        //String list = "A list is any information displayed or organised in a logical or linear formation. \nIt is a //view which groups several items and display them in vertical scrollable list. \n\nIt includes ListView, //Spinner, AutoCompleteTextView";

        ListView listView1 = findViewById(R.id.listView1);

        ArrayList<String> arrNames = new ArrayList<>();


        arrNames.add("Ram");
        arrNames.add("Anurag Affection");
        arrNames.add("Spinner");
        arrNames.add("Auto Complete Text View ");
        arrNames.add("Radha");
        arrNames.add("Radhika");
        arrNames.add("Rekha");
        arrNames.add("Tamika");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Rakesh");
        arrNames.add("Radha");
        arrNames.add("Radhika");
        arrNames.add("Rekha");
        arrNames.add("Tamika");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Rakesh");
        arrNames.add("Radha");
        arrNames.add("Radhika");
        arrNames.add("Rekha");
        arrNames.add("Tamika");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Rakesh");
        arrNames.add("Radha");
        arrNames.add("Radhika");
        arrNames.add("Rekha");
        arrNames.add("Tamika");


        ArrayAdapter<String> listadapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);

        listView1.setAdapter(listadapter);


        listView1.setOnItemClickListener((adapterView, view, i, l) -> {
            // adapterView =
            // View view = each view in list
            // int i = position or index
            // long l = time taken on clicking view

            if (i == 0){
                Toast.makeText(ListLearn.this, "Clicked frist item ",Toast.LENGTH_LONG).show();
            }
            else if (i==1){
                Intent iAnu;
                iAnu = new Intent(ListLearn.this, MainActivity2.class);
                startActivity(iAnu);
            }
            else if (i == 2){
                Intent iSpinner ;
                iSpinner = new Intent(ListLearn.this, SpinnerLearn.class);
                startActivity(iSpinner);
            }

        });


    }
}