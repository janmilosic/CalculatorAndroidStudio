package com.example.prva4a22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button clear, divide, multiply, minus, plus, equal, procent, sqrt, decimal;

    Double prvast = 0.0;
    Boolean errors = false;
    String racunska_operacija;

    private EditText vnos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vnos = findViewById(R.id.vnos);

        Button button0 = findViewById(R.id.zeroBTN);
        Button button1 = findViewById(R.id.oneBTN);
        Button button2 = findViewById(R.id.twoBTN);
        Button button3 = findViewById(R.id.threeBTN);
        Button button4 = findViewById(R.id.fourBTN);
        Button button5 = findViewById(R.id.fiveBTN);
        Button button6 = findViewById(R.id.sixBTN);
        Button button7 = findViewById(R.id.sevenBTN);
        Button button8 = findViewById(R.id.eightBTN);
        Button button9 = findViewById(R.id.nineBTN);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        clear = findViewById(R.id.clearBTN);
        divide = findViewById(R.id.divideBTN);
        multiply = findViewById(R.id.multiplyBTN);
        minus = findViewById(R.id.subtractBTN);
        plus = findViewById(R.id.addBTN);
        equal = findViewById(R.id.equalsBTN);
        vnos = findViewById(R.id.vnos);
        procent = findViewById(R.id.procentBTN);
        sqrt = findViewById(R.id.sqrtBTN);
        decimal = findViewById(R.id.decimalBTN);

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
            racunska_operacija="plus";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }
    }
    public void minus(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            racunska_operacija="minus";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }

    }
    public void multiply(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            racunska_operacija="multiply";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }

    }
    public void divide(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            racunska_operacija="divide";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }

    }
    public void procent(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            racunska_operacija="procent";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }

    }
    public void sqrt(View v){
        try{
            prvast=Double.valueOf(vnos.getText().toString());
            vnos.setText("");
            racunska_operacija="sqrt";
        }catch (NumberFormatException e){
            vnos.setText("Error");
            errors=true;
        }

    }
        public void decimal(View v){
            if(errors==true){
                vnos.setText("");
                errors=false;
            }
            String s = String.valueOf(vnos.getText());
            vnos.setText(s+".");
        }


    public void enako(View v) {
        switch (racunska_operacija) {
            case "plus":
                Double r = prvast + Double.valueOf(vnos.getText().toString());
                vnos.setText(r.toString());
                break;
            case "minus":
                Double a = prvast - Double.valueOf(vnos.getText().toString());
                vnos.setText(a.toString());
                break;
            case "multiply":
                Double b = prvast * Double.valueOf(vnos.getText().toString());
                vnos.setText(b.toString());
                break;
            case "divide":
                Double c = prvast / Double.valueOf(vnos.getText().toString());
                vnos.setText(c.toString());
                break;
            case "procent":
                Double d = prvast / 100;
                vnos.setText(d.toString());
                break;
            case "sqrt":
                Double e = Math.sqrt(prvast);
                vnos.setText(e.toString());
                break;

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zeroBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String a = String.valueOf(vnos.getText());
                vnos.setText(a+"0");
                break;
            case R.id.oneBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String b = String.valueOf(vnos.getText());
                vnos.setText(b+"1");
                break;
            case R.id.twoBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String c = String.valueOf(vnos.getText());
                vnos.setText(c+"2");
                break;
            case R.id.threeBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String d = String.valueOf(vnos.getText());
                vnos.setText(d+"3");
                break;
            case R.id.fourBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String e = String.valueOf(vnos.getText());
                vnos.setText(e+"4");
                break;
            case R.id.fiveBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String f = String.valueOf(vnos.getText());
                vnos.setText(f+"5");
                break;
            case R.id.sixBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String g = String.valueOf(vnos.getText());
                vnos.setText(g+"6");
                break;
            case R.id.sevenBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String h = String.valueOf(vnos.getText());
                vnos.setText(h+"7");
                break;
            case R.id.eightBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String i = String.valueOf(vnos.getText());
                vnos.setText(i+"8");
                break;
            case R.id.nineBTN:
                if(errors==true) {
                    vnos.setText("");
                    errors = false;
                }
                String j = String.valueOf(vnos.getText());
                vnos.setText(j+"9");
                break;
        }
    }
}

/*


STARA KODA UPORABA EVAL FUNKCIJE

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