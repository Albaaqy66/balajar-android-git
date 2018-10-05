package com.example.albaaqy.albaaqy;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void b1(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// mengganti isi container dengan fragment baru
        ft.replace(R.id.framelayout, new BlankFragment());
// atau ft.add(R.id.your_placeholder, new FooFragment());
// mulai melakukan hal di atas (jika belum di commit maka proses di atas belum dimulai)
        ft.commit();

    }

    public void b2(View view) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// mengganti isi container dengan fragment baru
        ft.replace(R.id.framelayout, new BlankFragment2());
// atau ft.add(R.id.your_placeholder, new FooFragment());
// mulai melakukan hal di atas (jika belum di commit maka proses di atas belum dimulai)
        ft.commit();
    }
}
