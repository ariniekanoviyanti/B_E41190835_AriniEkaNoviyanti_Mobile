package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exp(View view) {
        Intent intent = new Intent(MainActivity.this, explisit.class);
        startActivity(intent);
    }

    public void imp(View view) {
        Intent intent = new Intent(MainActivity.this, implisit.class);
        startActivity(intent);
    }
}
