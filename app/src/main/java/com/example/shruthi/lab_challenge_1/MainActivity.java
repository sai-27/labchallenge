package com.example.shruthi.lab_challenge_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {
    //EditText fname;
    EditText name, pass;
    Button submit, sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        setContentView(R.layout.activity_main);

        updateUI();
    }

    private void updateUI() {
        name = (EditText) findViewById(R.id.name);
        pass = (EditText) findViewById(R.id.pwd);
        submit = (Button) findViewById(R.id.submit);
        sign = (Button) findViewById(R.id.sign);


        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, main2.class);
                intent.putExtra("Name", name.getText().toString());
                intent.putExtra("Email", pass.getText().toString());
                startActivity(intent);

            }
        });
    }
}