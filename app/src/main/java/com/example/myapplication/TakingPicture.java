package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

public class TakingPicture extends AppCompatActivity {

    private final int CAMERA_REQ_CODE = 100;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_picture);

        ImageView picture;
        picture = findViewById(R.id.picture_img);

        Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(iCamera, CAMERA_REQ_CODE );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        ImageView picture;
        picture = findViewById(R.id.picture_img);

        super.onActivityResult(requestCode, resultCode, data);

        if ( resultCode == RESULT_OK){

            if ( requestCode == CAMERA_REQ_CODE){
                Bitmap img = (Bitmap) data.getExtras().get("data");
                picture.setImageBitmap(img);
            }
        }
    }


}