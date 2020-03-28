package com.terracodz.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnOk;
    EditText editTxt1;
    EditText editTxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //set UI views to the java objects
        editTxt1 = (EditText)findViewById(R.id.editText1);
        editTxt2 = (EditText)findViewById(R.id.editText2);
        btnOk = (Button)findViewById(R.id.btnOk);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        Toast toast = Toast.makeText(getApplicationContext(), "You just click the OK Button", Toast.LENGTH_LONG);
        toast.show();

        //send the messages with intent objects
        intent.putExtra("NUMBER_1", editTxt1.getText().toString());
        intent.putExtra("NUMBER_2", editTxt2.getText().toString());

        //start the intent
        startActivity(intent);
    }

}
