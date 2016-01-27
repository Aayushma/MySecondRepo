package com.example.com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.application.MyApplication;

/**
 * Created by User on 1/26/2016.
 */
public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        super(context);
        setFont();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    //
    public void setFont(){
        setTypeface(MyApplication.Fonts.FONTICON);
    }
}
