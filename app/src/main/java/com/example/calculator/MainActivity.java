package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1,number2;
    Button mb1,mb2,mb3,mb4,mb5;
    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView)findViewById(R.id.r);

        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);

        mb1=(Button)findViewById(R.id.b1);
        mb2=(Button)findViewById(R.id.b2);
        mb3=(Button)findViewById(R.id.b3);
        mb4=(Button)findViewById(R.id.b4);
        mb5=(Button)findViewById(R.id.b5);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });

        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1*num2;
                result.setText(String.valueOf(result_num));
            }
        });

        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                result_num=num1/num2;
                result.setText(String.valueOf(result_num));
            }
        });
        mb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });

    }
}