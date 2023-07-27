package com.example.beautysl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NuwaraEliya extends AppCompatActivity {
    Button back;
    TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuwara_eliya);

        back = (Button) findViewById(R.id.bc);
        tv=(TextView) findViewById(R.id.link);


        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setLinkTextColor(Color.YELLOW);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(NuwaraEliya.this,contact.class);
                startActivity(intent);
            }
        });

    }
}