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

public class RelativeLayout extends AppCompatActivity {

    EditText txtFirstName;
    EditText txtLastName;
    Button btnLogin;
    String firstname;
    String lastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
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

   /* @Override
    public void onClick(View view)
    {
        username=txtUserName.getText().toString();
        password=txtPassword.getText().toString();
        Log.i("Username: ",username);
        Log.i("Password: ",password);
        Toast.makeText(MainActivity.this, "submitted", Toast.LENGTH_SHORT).show();
    }*/

    private void initViews(){
        txtFirstName =(EditText) findViewById(R.id.editTextFirstname);
        txtLastName =(EditText) findViewById(R.id.editTextLastname);
        firstname= txtFirstName.getText().toString();
        lastname= txtLastName.getText().toString();
         btnLogin=(Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(newClickListener);
        txtLastName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if(actionId== EditorInfo.IME_ACTION_DONE){
                    redirectToSecond();
                }
                return true;
            }
        });
    }


    View.OnClickListener newClickListener= new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            /*if(view.getId()==R.id.btnSubmit) {
                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
                Log.i("Submit Clicked", "");
            }
            else{
                Toast.makeText(MainActivity.this,"Exit",Toast.LENGTH_LONG).show();
                Log.i("ExitClicked","");
            }
            username=txtUserName.getText().toString();
            password=txtPassword.getText().toString();
            Log.i("Username: ",username);
            Log.i("Password: ",password);*/
            //for linearlayout
            if(view.getId()==R.id.btnLogin) {
                //Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                Log.i("Submit Clicked", "");
                redirectToSecond();
            }
        }

    };
    public void redirectToSecond(){
        Intent mIntent= new Intent(RelativeLayout.this,SecondActivity.class);
        mIntent.putExtra("firstname",txtFirstName.getText().toString());
        mIntent.putExtra("lastname",txtLastName.getText().toString());
        startActivity(mIntent);
    }
}
