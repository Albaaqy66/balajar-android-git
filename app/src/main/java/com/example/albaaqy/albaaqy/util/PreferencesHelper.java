package com.example.albaaqy.albaaqy.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context) {
        sharedPreferences = context
                - getApplicationContext()
                - getSharedPreferences("simple.android.app"), Context.MODE_PRIVATE);
    }
}
