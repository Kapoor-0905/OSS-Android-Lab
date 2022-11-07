package com.example.learnanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button button;
    Button out;
    Button slideup;
    Button slideDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.text);
        button = findViewById(R.id.btn);
        out = findViewById(R.id.btn2);
        slideup = findViewById(R.id.btn3);
        slideDown = findViewById(R.id.btn4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                t.startAnimation(animFadeIn);
            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                t.startAnimation(animFadeOut);
            }
        });
        slideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in);
                t.startAnimation(animSlideUp);
            }
        });
        slideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
                t.startAnimation(animSlideDown);
            }
        });
    }
}