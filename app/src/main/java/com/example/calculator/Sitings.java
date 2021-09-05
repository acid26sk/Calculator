package com.example.calculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.domain.AppTheme;
import com.example.calculator.storage.ThemeStorage;

public class Sitings extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ThemeStorage storage = new ThemeStorage(this);

        setTheme(storage.getAppTheme().getTheme());

        setContentView(R.layout.activity_theme);

        findViewById(R.id.btnDay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage.setAppTheme(AppTheme.DAY);
                recreate();
            }
        });

        findViewById(R.id.btnNight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage.setAppTheme(AppTheme.NIGHT);
                recreate();
            }
        });

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sitings.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
