package com.example.user.listapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {goToNextActivity();
            }
        },2000);
    }
    private void goToNextActivity(){
        Intent intent =new Intent(SplashActivity.this,MyListActivity.class);
        startActivity(intent);
        finish();
    }

}
