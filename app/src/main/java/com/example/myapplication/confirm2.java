package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class confirm2 extends AppCompatActivity {

    TextView username2, email2, password2, mobileNumber2, id2, gender2, age2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm2);

        username2 = findViewById(R.id.username);
        email2 = findViewById(R.id.email);
        password2 = findViewById(R.id.password);
        mobileNumber2 = findViewById(R.id.mobilenumber);
        id2 = findViewById(R.id.IdNumber);
        gender2 = findViewById(R.id.gender);
        age2 = findViewById(R.id.age);


        Intent user = getIntent();
        //username
        String showText = user.getStringExtra("studentUsername");
        username2.setText(showText);

//
//        //email
//        String showEmail = user.getStringExtra("studentEmail");
//        email2.setText(showEmail);
//        //
//
//        //password
//        String showPassword = user.getStringExtra("studentPassword");
//        password2.setText(showPassword);
//        //
//
//        //mobile
//        String showMobile = user.getStringExtra("studentNumber");
//        mobileNumber2.setText(showMobile);
//        //
//
//        //id
//        String showId = user.getStringExtra("studentId");
//        id2.setText(showId);
//        //
//
//        //gender
//        String showGender = user.getStringExtra("studentGender");
//        gender2.setText(showGender);
//        //
//
//        //age
//        String showAge = user.getStringExtra("studentAge");
//        age2.setText(showAge);
        //
    }
}