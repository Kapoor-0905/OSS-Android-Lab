package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText userName, password;
    Button login;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.userName2);
        password = (EditText) findViewById(R.id.password2);
        login = (Button) findViewById(R.id.login2);
        db = new DBHelper(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = userName.getText().toString();
                String pass = password.getText().toString();

                if(username.equals("")||pass.equals("")){
                    Toast.makeText(Login.this, "Please Enter all the fields...", Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuserpass = db.checkUsernamePassword(username,pass);
                    if(checkuserpass ==true){
                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Home.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(Login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}