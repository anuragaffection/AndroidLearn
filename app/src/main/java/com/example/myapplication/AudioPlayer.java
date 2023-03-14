package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class AudioPlayer extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_player);

        Button btnPause, btnPlay, btnStop;

        btnPause = findViewById(R.id.btnPause);
        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);

        MediaPlayer mp = new MediaPlayer();

        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);

        String audioPath = "android.resource://" + getPackageName() + "raw/song_a";

        Uri audioUri = Uri.parse(audioPath);

        try {
            mp.setDataSource(this, audioUri);
            mp.prepare();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });


        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });


        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                mp.seekTo(0);
            }
        });

    }
}