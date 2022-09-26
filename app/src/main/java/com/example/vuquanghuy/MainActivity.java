package com.example.vuquanghuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student3 d = new Student3(3000, "maiyeu");

        String s = d.id + d.name;
        Toast.makeText(
                MainActivity.this,
                s,
                Toast.LENGTH_LONG
        ).show();
    }
}