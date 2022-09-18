package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "onCreate is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life Cycle","onCreate is invoked");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onStart is invoked"); //used for debugging purpose
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onResume is invoked");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onPause is invoked");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onStop is invoked");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onRestart is invoked");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy is Invoked", Toast.LENGTH_SHORT).show();
        Log.d("Activity Life cycle", "onDestroy is invoked");
    }
}