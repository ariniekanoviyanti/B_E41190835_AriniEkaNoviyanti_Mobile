package com.example.tugaslayoutt;

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

    public void linear(View view) {
        Intent intent = new Intent(MainActivity.this, linear_layout.class);
        startActivity(intent); //fungsi untuk membuka layout yg lain
    }

    public void relative(View view) {
        Intent intent = new Intent(MainActivity.this, relative_layout.class);
        startActivity(intent);
    }

    public void constraint(View view) {
        Intent intent = new Intent(MainActivity.this, constraint_layout.class);
        startActivity(intent);
    }

    public void frame(View view) {
        Intent intent = new Intent(MainActivity.this, frame_layout.class);
        startActivity(intent);
    }

    public void tabel(View view) {
        Intent intent = new Intent(MainActivity.this, tabel_layout.class);
        startActivity(intent);
    }

    public void materialdesign(View view) {
        Intent intent = new Intent(MainActivity.this, material_design.class);
        startActivity(intent);
    }

    public void scrollview(View view) {
        Intent intent = new Intent(MainActivity.this, scroll_view.class);
        startActivity(intent);
    }

    public void horizontal(View view) {
        Intent intent = new Intent(MainActivity.this, scroll_view_horizontal.class);
        startActivity(intent);
    }
}