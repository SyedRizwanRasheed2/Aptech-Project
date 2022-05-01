package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class confirmation extends AppCompatActivity {


    AppCompatButton nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        nextpage = findViewById(R.id.nextpage);


        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = getIntent().getStringExtra("studentUsername");
                Intent c1toc2 = new Intent(getApplicationContext(), confirm2.class);
                c1toc2.putExtra("studentUsername", value);
                startActivity(c1toc2);

            }
        });

    }
}