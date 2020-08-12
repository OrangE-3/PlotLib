package com.orange.graphplotteruser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.orange.plotlib.Plot2D;

public class MainActivity extends AppCompatActivity {
    private Plot2D plot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plot= findViewById(R.id.myplot);

    }
}