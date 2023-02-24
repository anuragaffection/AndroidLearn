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


        arrNames.add("00 - AA");
        arrNames.add("01 - Anurag Affection");
        arrNames.add("02 - Spinner");
        arrNames.add("03 - Auto Complete Text View ");
        arrNames.add("04 - Lottie Animation");
        arrNames.add("05 - Card View");
        arrNames.add("06 - Recycler View ");
        arrNames.add("07 - App Bar ");
        arrNames.add("08 - Drawable Learn ");
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
                Toast.makeText(ListLearn.this, "Clicked AA = Anurag Affection ",Toast.LENGTH_LONG).show();
            }
            else if (i==1){
                Intent iAnu;
                iAnu = new Intent(ListLearn.this, MainActivity2.class);
                startActivity(iAnu);
            }
            else if (i == 2 || i == 3){
                Intent iSpinner ;
                iSpinner = new Intent(ListLearn.this, SpinnerLearn.class);
                startActivity(iSpinner);
            }
            else if (i == 4){
                Intent iLottie;
                iLottie = new Intent(ListLearn.this, Lottie.class);
                startActivity(iLottie);
            }
            else if (i == 5){
                Intent iCard;
                iCard = new Intent(ListLearn.this, CardViewLearn.class);
                startActivity(iCard);
            }
            else if (i == 6){
                Intent iRecycle;
                iRecycle = new Intent(ListLearn.this, RecycleLearn.class);
                startActivity(iRecycle);
            }
            else if (i == 7){
                Intent iAppBar;
                iAppBar = new Intent(ListLearn.this, AppBarLearn.class);
                startActivity(iAppBar);
            }
            else if (i == 8){
                Intent iDraw;
                iDraw = new Intent(ListLearn.this, DrawableLearn.class);
                startActivity(iDraw);
            }

        });


    }
}