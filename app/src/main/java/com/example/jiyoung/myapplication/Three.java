package com.example.jiyoung.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;


public class Three  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        Button nextbtn2 = (Button)findViewById(R.id.nextbtn2);

        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Four.class);
                startActivity(intent);
            }
        });

        final RatingBar re1,re2,re3;
        Button ubtn1,dbtn1,ubtn2,dbtn2,ubtn3,dbtn3;

        re1 = (RatingBar)findViewById(R.id.re1);
        re2 = (RatingBar)findViewById(R.id.re2);
        re3 = (RatingBar)findViewById(R.id.re3);
        ubtn1=(Button)findViewById(R.id.ubtn1);
        ubtn2=(Button)findViewById(R.id.ubtn2);
        ubtn3=(Button)findViewById(R.id.ubtn3);
        dbtn1=(Button)findViewById(R.id.dbtn1);
        dbtn2=(Button)findViewById(R.id.dbtn2);
        dbtn3=(Button)findViewById(R.id.dbtn3);

        ubtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re1.setRating(re1.getRating()+re1.getStepSize());
            }
        });

        dbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re1.setRating(re1.getRating()-re1.getStepSize());
            }
        });

        ubtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re2.setRating(re2.getRating()+re2.getStepSize());
            }
        });

        dbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re2.setRating(re2.getRating()-re2.getStepSize());
            }
        });

        ubtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re3.setRating(re3.getRating()+re3.getStepSize());
            }
        });

        dbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                re3.setRating(re3.getRating()-re3.getStepSize());
            }
        });



    }
}
