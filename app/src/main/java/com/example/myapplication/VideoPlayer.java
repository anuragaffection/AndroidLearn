package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        VideoView videoPlayer;
        videoPlayer = findViewById(R.id.videoPlayer);

        String videoPath = "https://youtu.be/NI5pwsRNF2M";
        Uri videoUri = Uri.parse(videoPath);
        videoPlayer.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(this);
        mediaController.setMediaPlayer(videoPlayer);
        mediaController.setAnchorView(videoPlayer);

        videoPlayer.setMediaController(mediaController);
        videoPlayer.start();

    }
}