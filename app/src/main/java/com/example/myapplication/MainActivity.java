package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Edit, number2Edit;
    TextView resultText;
    Button btnCompare;
    int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void compare(View view){
        number1Edit = findViewById(R.id.txt_number1);
        number2Edit = findViewById(R.id.txt_number2);
        resultText = findViewById(R.id.txtv_result);
        number1 = Integer.parseInt(number1Edit.getText().toString());
        number2 = Integer.parseInt(number2Edit.getText().toString());

        if(number1 > number2){
            resultText.setText(String.valueOf(number1) + " > " + String.valueOf(number2));
        }else if(number1 == number2){
            resultText.setText(String.valueOf(number1) +" == "+ String.valueOf(number2));
        }else{
            resultText.setText(String.valueOf(number1) + " < " + String.valueOf(number2));
        }
    }
}