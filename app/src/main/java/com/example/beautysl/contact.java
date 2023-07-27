package com.example.beautysl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity {
    Button back;
    Button sigiriya;
    Button nuwaraEliya;
    Button ella;
    Button jaffna;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        back=(Button) findViewById(R.id.back);
        sigiriya=(Button) findViewById(R.id.sigiri);
        nuwaraEliya=(Button) findViewById(R.id.NE);
        ella=(Button) findViewById(R.id.ella);
        jaffna=(Button) findViewById(R.id.jaff);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(contact.this,MainActivity.class);
                startActivity(intent);
            }
        });
        sigiriya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contact.this,Sigiriya.class);
                startActivity(intent);
            }
        });
        nuwaraEliya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contact.this,NuwaraEliya.class);
                startActivity(intent);
            }
        });

        ella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(contact.this,Ella.class);
                startActivity(intent);
            }
        });
        jaffna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(contact.this,Sinha.class);
                startActivity(intent);
            }
        });



    }
}