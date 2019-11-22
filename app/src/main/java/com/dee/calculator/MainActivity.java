package com.dee.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etText;
    Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,btnPoint,btnEquals, btnAdd, btnMultiply, btnDivide, btnSubtract;

    Float Value1, Value2;
    boolean add, sub, mul, div, equals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
        btnPoint = findViewById(R.id.buttonPoint);
        btnEquals = findViewById(R.id.btnEquals);
        btnAdd= findViewById(R.id.btnAdd);
        btnMultiply= findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnSubtract= findViewById(R.id.btnSubtract);
    }
}
