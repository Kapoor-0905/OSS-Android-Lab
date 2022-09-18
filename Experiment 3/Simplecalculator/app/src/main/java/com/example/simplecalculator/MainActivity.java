package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button addbtn;
    private Button subbtn;
    private Button mulbtn;
    private Button divbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.num1);
        mEditText2 = findViewById(R.id.num2);
        mTextViewResult = findViewById(R.id.textView);
        addbtn = findViewById(R.id.add);
        subbtn = findViewById(R.id.sub);
        mulbtn = findViewById(R.id.multiply);
        divbtn = findViewById(R.id.divide);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText1.getText().toString().length()==0)
                {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length()==0)
                {
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int sum = num1 + num2;
                Toast.makeText(MainActivity.this, "Addition is Done", Toast.LENGTH_SHORT).show();
                mTextViewResult.setText(String.valueOf(sum));
            }

        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText1.getText().toString().length()==0)
                {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length()==0)
                {
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int sub = num1 - num2;
                Toast.makeText(MainActivity.this, "Subtraction is Done", Toast.LENGTH_SHORT).show();
                mTextViewResult.setText(String.valueOf(sub));
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText1.getText().toString().length()==0)
                {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length()==0)
                {
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int mul = num1 * num2;
                Toast.makeText(MainActivity.this, "Multiplication is Done", Toast.LENGTH_SHORT).show();
                mTextViewResult.setText(String.valueOf(mul));
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText1.getText().toString().length()==0)
                {
                    mEditText1.setText("0");
                }
                if (mEditText2.getText().toString().length()==0)
                {
                    mEditText2.setText("0");
                }
                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int div = num1 / num2;
                Toast.makeText(MainActivity.this, "Division is Done", Toast.LENGTH_SHORT).show();
                mTextViewResult.setText(String.valueOf(div));
            }
        });
    }
}