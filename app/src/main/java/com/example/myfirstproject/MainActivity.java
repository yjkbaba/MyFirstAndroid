package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"WIFE已断开",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.setClass(MainActivity.this,Main2Activity.class);
                intent.putExtra("studentName","yjk");

                startActivity(intent);
            }
        });

    }
}
