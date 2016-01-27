package com.example.user.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.listapplication.model.CustomArrayAdapter;
import com.example.user.listapplication.model.User;

import java.util.ArrayList;

public class CustomListviewActivity extends AppCompatActivity {
    ListView mlistview;
    ArrayList<User> arrayCustomList= new ArrayList<>();

    ArrayList<User> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);
        arrayCustomList.add(new User("Aayushma", "Java Developer", "http://i.imgur.com/DvpvklR.png"));
        arrayCustomList.add(new User("Aakash","Android","http://i.imgur.com/DvpvklR.png"));
        arrayCustomList.add(new User("Biplab", ".net Developer", "http://i.imgur.com/DvpvklR.png"));
        arrayCustomList.add(new User("Subash", "Designer", "http://i.imgur.com/DvpvklR.png"));
        Init();
        bindData();
    }

    public void Init(){
        mlistview= (ListView) findViewById(R.id.cusListView);
    }
    private void bindData(){
        //ArrayAdapter<String> aStringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
        CustomArrayAdapter cusArraryAdapter = new CustomArrayAdapter(this, R.layout.list_item,arrayCustomList);
        mlistview.setAdapter(cusArraryAdapter);

    }
}
