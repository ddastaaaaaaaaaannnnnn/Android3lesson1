package com.example.android3lesson1.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android3lesson1.R;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Android3lesson1);
        setContentView(R.layout.activity_main);
    }
}