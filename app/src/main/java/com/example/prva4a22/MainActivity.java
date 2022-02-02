package com.example.prva4a22;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button clear;
    Button devide;
    Button times;
    Button minus;
    Button plus;
    Button equal;
    EditText vnos;
    Double prvast = 0.0;
    String operacija;
    Boolean napaka = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.clear);
        devide = findViewById(R.id.devide);
        times = findViewById(R.id.times);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        equal = findViewById(R.id.equal);

        vnos = findViewById(R.id.vnos);

    }

    public void one(View v){
        if(napaka==true) {
            vnos.setText("");
            napaka = false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"1");
    }
    public void two(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"2");
    }
    public void three(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"3");
    }
    public void four(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"4");
    }
    public void five(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"5");
    }
    public void six(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"6");
    }
    public void seven(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"7");
    }
    public void eight(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"8");
    }
    public void nine(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"9");
    }
    public void zero(View v){
        if(napaka==true){
            vnos.setText("");
            napaka=false;
        }
        String s = String.valueOf(vnos.getText());
        vnos.setText(s+"0");
    }
    public void brisi(View v) {
        vnos.setText("");
    }

    public void nega(View v){
        String s = String.valueOf(vnos.getText());
        vnos.setText("-"+s);
    }
    public void plus(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            operacija="plus";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            napaka=true;
        }
    }
    public void minus(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            operacija="minus";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            napaka=true;
        }

    }
    public void times(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            operacija="times";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            napaka=true;
        }

    }
    public void devide(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            operacija="devide";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            napaka=true;
        }

    }

    public void enako(View v) {
        switch (operacija) {
            case "plus":
                Double r = prvast + Double.valueOf(vnos.getText().toString());
                vnos.setText(r.toString());
                break;
            case "minus":
                Double a = prvast - Double.valueOf(vnos.getText().toString());
                vnos.setText(a.toString());
                break;
            case "times":
                Double b = prvast * Double.valueOf(vnos.getText().toString());
                vnos.setText(b.toString());
                break;
            case "devide":
                Double c = prvast / Double.valueOf(vnos.getText().toString());
                vnos.setText(c.toString());
                break;

        }
    }
}


/*
package com.example.prva4a22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText vnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnos = findViewById(R.id.vnos);
    }

    public void addText(View v) {
        String s = String.valueOf(vnos.getText());
        vnos.setText(s + ((Button) v).getText().toString());
    }

    public void Clear(View v) {
        vnos.setText("");
    }

    public void Rezultat(View v) {
        String s = String.valueOf(vnos.getText());

        s = s.replace("÷","/");
        s = s.replace("×","*");
        s = s.replace("+/-","-");

        try {
            double r = eval(s);

            if (Math.ceil(r) > r) {
                vnos.setText(String.valueOf(eval(s)));
            } else {
                vnos.setText(String.valueOf((int) eval(s)));
            }
        } catch (Exception ex){
            vnos.setText("Error");
        }
    }

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (; ; ) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (; ; ) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}

 */