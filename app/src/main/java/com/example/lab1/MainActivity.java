package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView tV;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc =findViewById(R.id.increment);
        dec = findViewById(R.id.decrement);
        tV = findViewById(R.id.counterValue);

        inc.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tV.setText(count + " CLICKS!");
            }
        });
        dec.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tV.setText(count + " CLICKS!");
            }
        });
    }
}