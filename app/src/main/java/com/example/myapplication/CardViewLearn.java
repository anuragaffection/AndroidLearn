package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CardViewLearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_learn);

        String card = "Display of data in similarly styled containers. \nThese cards hava a default elevation above their containing view group, so the system draws shadows below them.";

        TextView textView = findViewById(R.id.txtCard);

        textView.setText(card);
    }
}