package com.example.userdetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText, editText2, editText3, editText4, editText5, editText6;
    Button button_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        editText3 = findViewById(R.id.editTextTextPersonName3);
        editText4 = findViewById(R.id.editTextTextPersonName4);
        editText5 = findViewById(R.id.editTextTextPersonName5);
        editText6 = findViewById(R.id.editTextTextPersonName6);
        button_continue = findViewById(R.id.button_continue);

        button_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname = editText.getText().toString();
                String fathername = editText2.getText().toString();
                String mothername = editText3.getText().toString();
                String citznno = editText4.getText().toString();
                String mnum = editText5.getText().toString();
                String adres = editText6.getText().toString();


                Intent i = new Intent(MainActivity.this, Details.class);

                i.putExtra("id.fullname", fullname);
                i.putExtra("id.fathersname", fathername);
                i.putExtra("id.mothersname", mothername);
                i.putExtra("id.citizennum", citznno);
                i.putExtra("id.mobileno", mnum);
                i.putExtra("id.Addres", adres);
                startActivity(i);

            }
        });
    }
}