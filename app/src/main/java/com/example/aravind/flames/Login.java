package com.example.aravind.flames;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Handler;
import android.content.Intent;



public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        int secondsDelayed = 4;

        new Handler().postDelayed(new Runnable() {
            public void run() {

                startActivity(new Intent(Login.this, Flames.class));
                finish();
            }
        }, secondsDelayed * 1000);

    }

}
