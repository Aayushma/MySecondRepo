package com.example.user.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        //String firstname=getIntent().getStringExtra("firstname").toString();
        //String lastname=getIntent().getStringExtra("lastname").toString();
        //String firstname=getIntent().getExtras().getString("firstname");
        //String lastname=getIntent().getExtras().getString("lastname");
        // Toast.makeText(SecondActivity.this,firstname+" "+lastname, Toast.LENGTH_SHORT).show();
        Bundle fullname = getIntent().getExtras();

        if (fullname != null) {
            String fn = fullname.getString("firstname");
            String ln = fullname.getString("lastname");
            if (fn != null) {
                Toast.makeText(SecondActivity.this, fn + " " + ln, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
