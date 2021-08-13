package com.example.userdetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class voting extends AppCompatActivity {


    Button button_check;
    EditText enter_age;
    TextView circle, result;

    int age;
    Button button_return;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        button_check = findViewById(R.id.button_check);
        enter_age = findViewById(R.id.enter_age);
        circle = findViewById(R.id.circle);
        result = findViewById(R.id.result);
        button_return = findViewById(R.id.button_return);

        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(voting.this, MainActivity.class);
                startActivity(intent);
            }
        });


        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = Integer.valueOf(enter_age.getText().toString());

                if (age>=17){
                    circle.setBackgroundResource(R.drawable.greencircle);
                    result.setText("You Can Vote");

                } else{
                    circle.setBackgroundResource(R.drawable.redcircle);
                    result.setText("You Can't Vote");
                }
            }
        });
    }
}