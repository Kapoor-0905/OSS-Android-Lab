package com.example.button_listner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            int count = 0;
            @Override
            public void onClick(View view){
                count += 1;
                Toast.makeText(MainActivity.this, "The button is clicked "+count+" times", Toast.LENGTH_SHORT).show();
            }
        });

    }
}