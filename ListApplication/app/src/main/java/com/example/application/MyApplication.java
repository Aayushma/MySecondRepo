package com.example.application;

import android.app.Application;
import android.graphics.Typeface;

/**
 * Created by User on 1/26/2016.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    public static class Fonts {
        public static Typeface FONTICON;
    }

    private void initFont(){
        Fonts.FONTICON=Typeface.create(Typeface.createFromAsset(getAssets(), "myfont.ttf"), Typeface.NORMAL);
    }
}
