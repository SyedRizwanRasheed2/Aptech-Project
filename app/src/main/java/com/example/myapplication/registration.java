package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class registration extends AppCompatActivity {


    TextView signIn;
    ImageView google2, facebook2;
    TextInputEditText username2, email2, password2, mobile2, id2;
    RadioButton male2, female2, other2;
    CalendarView ageCalendar;
    AppCompatButton signuptoconfirm2;
    String age = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);
        signIn = findViewById(R.id.Signin1);
        facebook2 = findViewById(R.id.facebook);
        google2 = findViewById(R.id.google);
        signuptoconfirm2 = findViewById(R.id.signuptoconfirm);
        username2 = findViewById(R.id.username);
        email2 = findViewById(R.id.email);
        password2 = findViewById(R.id.password);
        mobile2 = findViewById(R.id.MobileNumber);
        id2 = findViewById(R.id.IdNumber);
        male2 = findViewById(R.id.male);
        female2 = findViewById(R.id.female);
        other2 = findViewById(R.id.other);
        ageCalendar = findViewById(R.id.age);


        //age
        ageCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                // 12-4-2020
                month += 1;
                age = (day + "-" + month + "-" + year);
            }
        });

        // signuptoconfirm
        Intent signuptoconfirm3 = new Intent(getApplicationContext(), confirmation.class);
        //


        signuptoconfirm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //username
                signuptoconfirm3.putExtra("studentUsername",  username2.getText().toString());
                //

                //email
                String email4 = email2.getText().toString();
                signuptoconfirm3.putExtra("studentEmail", email4);
                //

                //password
                String password4 = password2.getText().toString();
                signuptoconfirm3.putExtra("studentPassword", password4);
                //

                //mobile
                String mobile4 = mobile2.getText().toString();
                signuptoconfirm3.putExtra("studentNumber", mobile4);
                //

                //idNumber
                String id4 = id2.getText().toString();
                signuptoconfirm3.putExtra("studentId", id4);
                //

                //gender
                String gender ="";
                 if (male2.isChecked()){
                     gender=male2.getText().toString();
                 }else if (female2.isChecked()){
                     gender=female2.getText().toString();
                 }else if (other2.isChecked()){
                     gender=other2.getText().toString();
                 }
                signuptoconfirm3.putExtra("studentGender", gender);
                 //

                //age
                signuptoconfirm3.putExtra("studentAge", age);
                //
                startActivity(signuptoconfirm3);

            }
        });

        // google intent
        Intent google3 = new Intent(Intent.ACTION_VIEW);
        google3.setData(Uri.parse("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"));

        google2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(google3);
            }
        });

        // facebook intent
        Intent facebook3 = new Intent(Intent.ACTION_VIEW);
        facebook3.setData(Uri.parse("https://www.facebook.com/"));

        facebook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(facebook3);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}