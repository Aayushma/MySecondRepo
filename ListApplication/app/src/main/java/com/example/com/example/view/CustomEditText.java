package com.example.com.example.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.example.application.MyApplication;

/**
 * Created by User on 1/26/2016.
 */
public class CustomEditText extends EditText {

    public CustomEditText(Context context) {
        super(context);
        setFont();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }
    public void setFont(){
        setTypeface(MyApplication.Fonts.FONTICON);
    }
}
