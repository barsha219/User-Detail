 package com.example.userdetailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class Details extends AppCompatActivity {

    TextView text_fullname, fname, mname, adrs, mblno, citizenno;
    Button button_vote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        text_fullname = findViewById(R.id.text_fullname);
        fname = findViewById(R.id.fname);
        mname = findViewById(R.id.mname);
        citizenno = findViewById(R.id.citizenno);
        mblno = findViewById(R.id.mblno);
        adrs = findViewById(R.id.adrs);

        button_vote = findViewById(R.id.button_vote);
        button_vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Details.this, voting.class));
            }
        });




        String fullname = getIntent().getStringExtra("id.fullname");
        String fathername = getIntent().getStringExtra("id.fathersname");
        String mothername = getIntent().getStringExtra("id.mothersname");
        String citznno = getIntent().getStringExtra("id.citizennum");
        String mnum = getIntent().getStringExtra("id.mobileno");
        String adres = getIntent().getStringExtra("id.Addres");



        text_fullname.setText(fullname);
        fname.setText(fathername);
        mname.setText(mothername);
        citizenno.setText(citznno);
        mblno.setText(mnum);
        adrs.setText(adres);





    }
}