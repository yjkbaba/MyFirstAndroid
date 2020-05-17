package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String myName = String.valueOf(intent.getStringArrayExtra("studentName"));
        display = findViewById(R.id.textView);
        display.setText(myName);
    }
}
