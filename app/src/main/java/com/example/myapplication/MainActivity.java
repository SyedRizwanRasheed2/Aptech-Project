package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView signUp;
    ImageView ivGoogle, ivFacebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp = findViewById(R.id.Signup1);
        ivGoogle = findViewById(R.id.google);
        ivFacebook = findViewById(R.id.facebook);

        // fb intent
        Intent facebook = new Intent(Intent.ACTION_VIEW);
        facebook.setData(Uri.parse("https://www.facebook.com/"));

        // google intent
        Intent google = new Intent(Intent.ACTION_VIEW);
        google.setData(Uri.parse("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"));


        ivGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(google);
            }
        });

        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(facebook);
            }
        });


        // Signup intent
        Intent singinTosignup = new Intent(getApplicationContext(), registration.class);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(singinTosignup);
            }
        });

        //camel case

    }
}