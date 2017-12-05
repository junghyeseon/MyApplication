package com.example.jiyoung.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Second extends Activity{

    MediaPlayer mP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        final ImageView ivmusic = (ImageView)findViewById(R.id.ivmusic) ;
        Button nextbtn = (Button)findViewById(R.id.nextntn);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Three.class);
                startActivity(intent);
            }
        });

        final String[] music = { "백현","태연","아이유" };


        final Spinner spinner = (Spinner) findViewById(R.id.spin);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, music);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                ImageView ivmusic = (ImageView) findViewById(R.id.ivmusic);
                ivmusic.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivmusic.setPadding(5, 5, 5, 5);

                switch (arg2) {
                    case 0:
                    ivmusic.setImageResource(R.drawable.back);
                        mP = MediaPlayer.create(getApplicationContext(),R.raw.back);
                        break;
                    case 1:
                        ivmusic.setImageResource(R.drawable.tae);
                        mP = MediaPlayer.create(getApplicationContext(),R.raw.tae);
                        break;
                    case 2:
                        ivmusic.setImageResource(R.drawable.iu);
                        mP = MediaPlayer.create(getApplicationContext(),R.raw.iu);
                        break;
                }


            }

            public void onNothingSelected(AdapterView<?> arg0) {

            }

        });


            final Switch swi = (Switch)findViewById(R.id.swi);
        swi.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                    if (swi.isChecked() == true)
                    mP.start();
                    else
                        mP.stop();
            }
        });

    }
}
