package com.example.storesimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Sweet_Screen extends AppCompatActivity {
    ImageView backfood;
    ImageView imgcake;
    ImageView imgmeringuet;
    ImageView imgpancake;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sweet__screen);

        backfood = findViewById(R.id.backfood);
        imgcake = findViewById(R.id.imgcake);
        imgmeringuet = findViewById(R.id.imgmeringuet);
        imgpancake = findViewById(R.id.imgpancake);
        trackScreen("Sweet_Screen");



        backfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sweet_Screen.this , MainActivity.class);

            }
        });

        backfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sweet_Screen.this , MainActivity.class);
                startActivity(intent);

            }
        });

        imgcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sweet_Screen.this , ChocolateCake.class);
                startActivity(intent);

            }
        });

        imgmeringuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sweet_Screen.this , Meringue.class);
                startActivity(intent);

            }
        });

        imgpancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sweet_Screen.this , PanCake.class);
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