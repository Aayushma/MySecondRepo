package com.example.user.listapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Layout extends AppCompatActivity {

    EditText txtUserName;
    EditText txtPassword;
    EditText txtFirstName;
    EditText txtLastName;
    TextView textFieldPassword;
    TextView textFieldUserName;
    Button btnSubmit;
    Button btnExit;
    Button btnLogin;
    String username;
    String password;
    String firstname;
    String lastname;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_layout);
            Log.v("Create", "Step 2");
            initViews();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.v("Start","Step 1");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.v("Destroyed", "Step 3");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.v("Paused", "step 4");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.v("Resume", "Step 5");
        }



    private void initViews(){
        txtUserName = (EditText) findViewById(R.id.txtUsername);
        txtPassword =(EditText) findViewById(R.id.txtPassword);

        username= txtUserName.getText().toString();
        password= txtPassword.getText().toString();

        btnSubmit=(Button) findViewById(R.id.btnSubmit);
        btnExit=(Button) findViewById(R.id.btnExit);

    }


    View.OnClickListener newClickListener= new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.btnSubmit) {
                Toast.makeText(Layout.this, "Submitted", Toast.LENGTH_SHORT).show();
                Log.i("Submit Clicked", "");
            }
            else{
                Toast.makeText(Layout.this,"Exit",Toast.LENGTH_LONG).show();
                Log.i("ExitClicked","");
            }

        }

    };
    public void redirectToSecond(){
        Intent mIntent= new Intent(Layout.this,SecondActivity.class);
        mIntent.putExtra("firstname",txtFirstName.getText().toString());
        mIntent.putExtra("lastname",txtLastName.getText().toString());
        startActivity(mIntent);
    }
    }

