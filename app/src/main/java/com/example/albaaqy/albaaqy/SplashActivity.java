package com.example.albaaqy.albaaqy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.albaaqy.albaaqy.util.PreferencesHelper;

public class SplashActivity extends AppCompatActivity {


    PreferencesHelper intances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        intances = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler () .postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!intances.isLogin()) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
            }
        }, splashInterval);
    }
}
