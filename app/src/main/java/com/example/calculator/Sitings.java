package com.example.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sitings extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
