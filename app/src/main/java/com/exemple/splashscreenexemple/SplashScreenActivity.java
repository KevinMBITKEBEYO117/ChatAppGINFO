package com.exemple.splashscreenexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {
private final int SPLASH_SCREEN_TIMEOUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //le rediriger vers la page principale "MainActivity" apres 3 secondes.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //demarer un page
                Intent intent =  new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }
}