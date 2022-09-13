package com.example.recyclerviewassigment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FullActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
        Intent intent = getIntent();
        String details = intent.getStringExtra("Detailed");

        textView = findViewById(R.id.textView);

        textView.setText(details);
    }
}