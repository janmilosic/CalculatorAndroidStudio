package com.example.prva4a22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button clear, equals;
    Button add, subtract, divide, multipy;

    String niz1;

    EditText vnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.oneBTN);
        two = findViewById(R.id.twoBTN);
        three = findViewById(R.id.threeBTN);
        four = findViewById(R.id.fourBTN);
        five = findViewById(R.id.fiveBTN);
        six = findViewById(R.id.sixBTN);
        seven = findViewById(R.id.sevenBTN);
        eight = findViewById(R.id.eightBTN);
        nine = findViewById(R.id.nineBTN);
        zero = findViewById(R.id.zeroBTN);
        vnos = findViewById(R.id.vnos);

        clear = findViewById(R.id.clearBTN);
        equals = findViewById(R.id.equalsBTN);

        add = findViewById(R.id.addBTN);
        subtract = findViewById(R.id.subtractBTN);
        multipy = findViewById(R.id.multiplyBTN);
        divide = findViewById(R.id.divideBTN);

    }

    public void One(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "1");
    }

    public void Two(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "2");
    }

    public void Three(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "3");
    }

    public void Four(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "4");
    }

    public void Five(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "5");
    }

    public void Six(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "6");
    }

    public void Seven(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "7");
    }

    public void Eight(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "8");
    }

    public void Nine(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "9");
    }

    public void Zero(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + "0");
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