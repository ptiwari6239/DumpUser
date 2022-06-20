package com.example.dumpuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText txxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnyes);
        b2 = findViewById(R.id.btn1);
        b3 = findViewById(R.id.btn2);
        b4 = findViewById(R.id.btn3);
        b5 = findViewById(R.id.btn4);
        b6 = findViewById(R.id.btn5);
        b7 = findViewById(R.id.btn6);

        txxt = findViewById(R.id.txt1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setVisibility(View.VISIBLE);
                b2.setVisibility(View.INVISIBLE);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setVisibility(View.VISIBLE);
                b3.setVisibility(View.INVISIBLE);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.VISIBLE);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setVisibility(View.INVISIBLE);
                b6.setVisibility(View.VISIBLE);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setVisibility(View.INVISIBLE);
                b7.setVisibility(View.VISIBLE);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.VISIBLE);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txxt.setText("I   KNEW   IT !!");
            }
        });
    }
}