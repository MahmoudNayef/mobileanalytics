package com.example.storesimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Electronic_Screen extends AppCompatActivity {
    ImageView backfood;
    ImageView imglaptop;
    ImageView imgcamera;
    ImageView imgmonitor;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electronic__screen);
        trackScreen("Electronic_Screen");

        backfood = findViewById(R.id.backfood);
        imglaptop = findViewById(R.id.imglaptop);
        imgcamera = findViewById(R.id.imgcamera);
        imgmonitor = findViewById(R.id.imgmonitor);



        backfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronic_Screen.this , MainActivity.class);
                startActivity(intent);

            }
        });

        imglaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronic_Screen.this , Laptop.class);
                startActivity(intent);

            }
        });

        imgcamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronic_Screen.this , Camera.class);
                startActivity(intent);

            }
        });

        imgmonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronic_Screen.this , Monitor.class);
                startActivity(intent);

            }
        });
    }

    void trackScreen(String screenName){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName);
        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
    }
}