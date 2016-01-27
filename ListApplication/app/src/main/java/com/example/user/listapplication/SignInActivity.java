package com.example.user.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    TextView signin;
    TextView signup;
    ViewGroup signinlayout;
    ViewGroup signuplayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signin=(TextView) findViewById(R.id.txtSignin);
        signinlayout=(ViewGroup) findViewById(R.id.signinlayout);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signinlayout.setVisibility(View.VISIBLE);
                signuplayout.setVisibility(View.GONE);
            }
        });

        signup=(TextView) findViewById(R.id.txtSignup);
        signuplayout=(ViewGroup) findViewById(R.id.signuplayout);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signuplayout.setVisibility(View.VISIBLE);
                signinlayout.setVisibility(View.GONE);
            }
        });

    }



}
