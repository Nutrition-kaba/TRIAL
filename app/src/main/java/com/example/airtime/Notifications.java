package com.example.airtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Notifications extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);


    }
}