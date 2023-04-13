package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GalleryPick extends AppCompatActivity {

    private  final int GALLERY_REQ_CODE = 101;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_pick);

        ImageView picture;
        picture = findViewById(R.id.picture_img);

        Intent iGallery = new Intent(Intent.ACTION_PICK);
        iGallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(iGallery, GALLERY_REQ_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        ImageView picture;
        picture = findViewById(R.id.picture_img);

        super.onActivityResult(requestCode, resultCode, data);

        if ( resultCode == RESULT_OK){

            if ( requestCode == GALLERY_REQ_CODE){
                picture.setImageURI(data.getData());

            }
        }
    }

}