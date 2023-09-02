package com.example.merrychristmas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MerryChristmas extends AppCompatActivity {
    LottieAnimationView l;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merry_christmas);
        l=findViewById(R.id.mc);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MerryChristmas.this,"Merry Christmas",Toast.LENGTH_LONG).show();
            }
        });
    }
}