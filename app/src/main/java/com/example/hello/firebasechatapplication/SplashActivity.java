package com.example.hello.firebasechatapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hello.firebasechatapplication.activities.Login;

public class SplashActivity extends AppCompatActivity {
    private static final int interval =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,Login.class));
            }
        },interval);
    }
}
