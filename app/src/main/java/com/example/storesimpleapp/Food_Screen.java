package com.example.storesimpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class Food_Screen extends AppCompatActivity {
    ImageView backfood;
    ImageView imghumburger;
    ImageView imgtoast;
    ImageView imgsandwitch;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food__screen);
        trackScreen("Food_Screen");


        backfood = findViewById(R.id.backfood);
        imghumburger = findViewById(R.id.imghumburger);
        imgtoast = findViewById(R.id.imgtoast);
        imgsandwitch = findViewById(R.id.imgsandwitch);



        backfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_Screen.this , MainActivity.class);
                startActivity(intent);
            }
        });

        imghumburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_Screen.this , Humburger.class);
                startActivity(intent);
            }
        });

        imgtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_Screen.this , Toast.class);
                startActivity(intent);

            }
        });

        imgsandwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food_Screen.this , Shawerma.class);
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