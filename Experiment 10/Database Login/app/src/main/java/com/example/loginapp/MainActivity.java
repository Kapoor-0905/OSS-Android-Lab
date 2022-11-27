package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userName, password, repeatPassword;
    Button logIn, register;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        repeatPassword = (EditText) findViewById(R.id.rePassword);
        logIn = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        db = new DBHelper(this);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = userName.getText().toString();
                String pass = password.getText().toString();
                String repass = repeatPassword.getText().toString();

                if(user.equals("") || pass.equals("") || repass.equals("")){
                    Toast.makeText(MainActivity.this, "Please Enter all the fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(repass)){
                        Boolean checkUser = db.checkUserName(user);
                        if(checkUser == false){
                            Boolean insert = db.insertData(user, pass);
                            if(insert == true){
                                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Home.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "User Already Exists!!! Please Sign in", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Passwords Doesn't Match!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        }
    }
