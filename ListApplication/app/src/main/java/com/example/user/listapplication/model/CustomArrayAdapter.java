package com.example.user.listapplication.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.listapplication.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by User on 1/17/2016.
 */

public class CustomArrayAdapter extends ArrayAdapter<User> {
    ArrayList<User> userArrayList;
    Context mcontext;
    LayoutInflater minflater;
    int resource;

    public CustomArrayAdapter(Context mcontext,int resource, ArrayList<User> listm){
        super(mcontext,resource,listm);
        this.mcontext=mcontext;
        this.resource=resource;
        this.userArrayList=listm;
        this.minflater=(LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       User mUser=getItem(position);
       convertView=minflater.inflate(resource,parent,false);
       TextView textViewTitle=(TextView) convertView.findViewById(R.id.textViewTitle);
        TextView textViewSubTitle=(TextView) convertView.findViewById(R.id.textViewSubTitle);
        ImageView imageView=(ImageView) convertView.findViewById(R.id.imageView);
        textViewTitle.setText(mUser.getName());
        textViewSubTitle.setText(mUser.getJobtitle());
        Picasso.with(mcontext).load(mUser.getImage()).into(imageView);
        return convertView;
    }

    @Override
    public int getCount() {
        return this.userArrayList.size();
    }
}
