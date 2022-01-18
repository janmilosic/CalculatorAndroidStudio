package com.example.prva4a22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button clear, equals;
    Button add, subtract, divide, multipy;

    String niz1;

    EditText vnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnos = findViewById(R.id.vnos);

        clear = findViewById(R.id.clearBTN);
        equals = findViewById(R.id.equalsBTN);

        add = findViewById(R.id.addBTN);
        subtract = findViewById(R.id.subtractBTN);
        multipy = findViewById(R.id.multiplyBTN);
        divide = findViewById(R.id.divideBTN);

    }

    public void addNumber(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + ((Button)v).getText().toString());
    }

    public void Clear(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText("");
    }



    public void Add(View v){
        String add = String.valueOf(vnos.getText());
        niz1 = String.valueOf(vnos.getText());
        vnos.setText(add + "+");
    }

    public void Subtract(View v){
        String subtract = String.valueOf(vnos.getText());
        vnos.setText(subtract + "-");
    }

    public void Multipy(View v){
        String multiply = String.valueOf(vnos.getText());
        vnos.setText(multiply + "×");
    }

    public void Divide(View v){
        String divide = String.valueOf(vnos.getText());
        vnos.setText(divide + "÷");
    }


}