package com.example.myapplication;

import static android.widget.Toast.*;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.app.AlertDialog;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListLearn extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
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
        arrNames.add("09 - Simple Toast ");
        arrNames.add("10 - Customize Toast ");
        arrNames.add("11 - Simple Alert Dialog Box " );
        arrNames.add("12 - Double Alert Dialog Box ");
        arrNames.add("13 - Triple Button Dialog Box ");
        arrNames.add("Rekha");
        arrNames.add("Tamika");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Rakesh");
        arrNames.add("Radha");
        arrNames.add("Radhika");



        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);

        listView1.setAdapter(listAdapter);


        listView1.setOnItemClickListener((adapterView, view, i, l) -> {
            // adapterView =
            // View view = each view in list
            // int i = position or index
            // long l = time taken on clicking view

            if (i == 0){
                Toast.makeText(ListLearn.this, "Clicked AA = Anurag Affection ", LENGTH_LONG).show();
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
            else if (i == 9){
                makeText(getApplicationContext(), "Simple Toast ", LENGTH_LONG).show();
            }
            else if (i == 10){
                Toast toast = new Toast(getApplicationContext());
                View view2 = getLayoutInflater().inflate(R.layout.custom_toast, findViewById(R.id.clView));
                toast.setView(view2);

                String txtMessage = "Message Sent Successfully! ";
                TextView txtMe;
                txtMe = view2.findViewById(R.id.txtMe);
                txtMe.setText(txtMessage);

                toast.setDuration(LENGTH_LONG);
                toast.show();
            }

            else if (i == 11){
                AlertDialog alertDialog = new AlertDialog.Builder(this).create();

                alertDialog.setTitle("Terms & condition");
                alertDialog.setIcon(R.drawable.baseline_info_24);
                alertDialog.setMessage("Have You read all the T & C ");

                alertDialog.setButton("Yes, I have read ", (dialogInterface, i1) ->
                        Toast.makeText(ListLearn.this, "Yes you can proceed ", Toast.LENGTH_LONG).show());

                alertDialog.show();
            }

            else if (i == 12){
                AlertDialog.Builder delDialog = new AlertDialog.Builder(ListLearn.this);

                delDialog.setTitle("Delete");
                delDialog.setIcon(R.drawable.baseline_delete_24);
                delDialog.setMessage("Are You sure want to delete ? ");

                delDialog.setPositiveButton("Yes", (dialogInterface, i16) ->
                        Toast.makeText(ListLearn.this, "Deleted", LENGTH_LONG).show());

                delDialog.setNeutralButton("No", (dialogInterface, i12) ->
                        Toast.makeText(ListLearn.this, "Item Not deleted", LENGTH_LONG).show());

                delDialog.show();
            }

            else if (i == 13) {
                AlertDialog.Builder extDialog = new AlertDialog.Builder(ListLearn.this);

                extDialog.setTitle("Exist ?");
                extDialog.setMessage("Are You sure want to exist ? ");
                extDialog.setIcon(R.drawable.baseline_exit_to_app_24);

                extDialog.setPositiveButton("Yes", (dialogInterface, i15) -> {
                   Intent iMain;
                   iMain = new Intent(ListLearn.this, MainActivity.class);
                   startActivity(iMain);
                });

                extDialog.setNegativeButton("No", (dialogInterface, i13) ->
                        Toast.makeText(ListLearn.this, "Welcome Back ", LENGTH_LONG).show());

                extDialog.setNeutralButton("Cancel", (dialogInterface, i14) ->
                        Toast.makeText(ListLearn.this, "Cancelled", LENGTH_LONG).show());

                extDialog.show();
            }



        });


    }
}