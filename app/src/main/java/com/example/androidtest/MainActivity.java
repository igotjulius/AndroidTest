package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a verbose message");
        Log.d(TAG, "This is a debug message");
        Log.i(TAG, "This is an info message");
        Log.w(TAG, "This is a warn message");
        Log.e(TAG, "This is an error message");
    }
}