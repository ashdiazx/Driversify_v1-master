package com.example.acer.driversify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReportDriver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_driver);
    }

    public void next1(View v){
        Intent i = new Intent(this, ReportDriver2.class);
        startActivity(i);
    }

}
