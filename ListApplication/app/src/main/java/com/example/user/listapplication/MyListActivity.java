package com.example.user.listapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.listapplication.model.User;

import java.util.ArrayList;

public class MyListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ArrayList<String> fruits= new ArrayList<String>();

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);


        init();
        bindData();
    }
    private void init(){
        list= (ListView) findViewById(R.id.listview);
        list.setOnItemClickListener(this);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Papaya");

    }
    private void bindData(){
        //ArrayAdapter<String> aStringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
        ArrayAdapter<String> aStringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Example_title));
        list.setAdapter(aStringArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        String clickItem=(String) parent.getAdapter().getItem(position);
        Toast.makeText(MyListActivity.this, "Position clicked :" +position+ "" +clickItem, Toast.LENGTH_SHORT).show();

        switch (position){
            case 0:
                Intent nIntent=new Intent(MyListActivity.this,Layout.class);
                startActivity(nIntent);
                break;
            case 1:
                Intent oIntent=new Intent(MyListActivity.this,RelativeLayout.class);
                startActivity(oIntent);
                break;
            case 2:
                Intent mIntent=new Intent(MyListActivity.this,CustomListviewActivity.class);
                startActivity(mIntent);
                break;
            case 3:
                Intent Intent=new Intent(MyListActivity.this,StyleExample.class);
                startActivity(Intent);
                break;
            case 4:
                Intent in=new Intent(MyListActivity.this,LoginActivity.class);
                startActivity(in);
                break;
            case 5:
                Intent inte=new Intent(MyListActivity.this,SignInActivity.class);
                startActivity(inte);
                break;
            case 6:
                Intent inten=new Intent(MyListActivity.this,CustomFontExample.class);
                startActivity(inten);
                break;
        }
    }

}
