package com.example.snapslide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {
 private static int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
   new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
           Intent homeIntent = new Intent(Main2Activity.this,MainActivity.class);
           startActivity(homeIntent);
           finish();
       }
   },SPLASH_TIME_OUT);

    }
}
