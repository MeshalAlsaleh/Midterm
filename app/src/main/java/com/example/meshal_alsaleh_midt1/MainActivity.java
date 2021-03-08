package com.example.meshal_alsaleh_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
        ImageView pic;
        MediaPlayer mpSong;
        int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView fo =(ImageView)findViewById(R.id.fox);

        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this, R.raw.track1);
        playing = 0;

        Button btnclick12 = (Button)findViewById(R.id.button1);
        btnclick12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        Button btnclick13 = (Button)findViewById(R.id.button6);
        btnclick13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

        fo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (playing){
                    case 0:
                        mpSong.start();
                        playing = 1;
                        break;
            }}
        });
        }

}
