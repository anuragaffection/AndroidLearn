package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class GayaCollegeGaya extends AppCompatActivity {

    WebView gcg;
    ProgressBar pgBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaya_college_gaya);

        gcg = findViewById(R.id.gcg);
        pgBar = findViewById(R.id.pgBar);

        gcg.loadUrl("https://www.gayacollege.ac.in/");

        gcg.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                pgBar.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                pgBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });



    }

    @Override
    public void onBackPressed() {
        if (gcg.canGoBack()){
            gcg.goBack();
        } else {
            super.onBackPressed();
        }

    }

}