package com.example.acer.driversify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void login(View v){
        Intent i = new Intent(this, ReportDriver.class);
        startActivity(i);
    }

    public void signup(View v){
        Intent i = new Intent(this, SignUp.class);
        startActivity(i);
    }
}
