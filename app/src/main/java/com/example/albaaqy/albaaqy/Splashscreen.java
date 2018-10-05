package com.example.albaaqy.albaaqy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

  PreferencesHelper instance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(() -> {
            if (!instance.isLogin()) {
                startActivity(new Intent(Splashscreen.this, LoginActivity,class);
            } else {
                startActivity(new Intent(Splashscreen.this, LoginActivity,class);
            }
            }, splashInterval);
        })
    }
}
