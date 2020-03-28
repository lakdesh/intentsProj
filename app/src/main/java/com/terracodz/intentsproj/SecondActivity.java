package com.terracodz.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    //create objects for UI components
    EditText editTxt1, editTxt2;
    Button btnPlus, btnMinus, btnMulti, btnDevide;
    TextView ans;

    //variables for string values from the intent
    String num1,num2;

    //variables for double values
    double val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //set UI view objects with java objects;
        editTxt1 = (EditText) findViewById(R.id.editText1);
        editTxt2 = (EditText) findViewById(R.id.editText2);

        btnPlus =(Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnDevide = (Button)findViewById(R.id.btnDevide);

        ans = (TextView)findViewById(R.id.ans);

        //create the intent for recieving
        Intent intent = getIntent();
        num1 = intent.getStringExtra("NUMBER_1");
        num2 = intent.getStringExtra("NUMBER_2");

        //set the recieved values to the editTexts
        editTxt1.setText(num1);
        editTxt2.setText(num2);

        //convert the string vales into double values
        val1 = Double.parseDouble(num1);
        val2 = Double.parseDouble(num2);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(val1+" + "+val2+" = "+(val1+val2));
                Toast toast = Toast.makeText(getApplicationContext(), "Add two numbers", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(val1+" - "+val2+" = "+(val1-val2));
                Toast toast = Toast.makeText(getApplicationContext(), "Substract two numbers", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(val1+" x "+val2+" = "+(val1*val2));
                Toast toast = Toast.makeText(getApplicationContext(), "Multiply Two numbers", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(val1+" / "+val2+" = "+(val1+val2));
                Toast toast = Toast.makeText(getApplicationContext(), "Devide two numbers", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
