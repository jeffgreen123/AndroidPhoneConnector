package com.example.myfirstapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        ImageView imgView=(ImageView) findViewById(R.id.screenImage);
        Drawable drawable  = getResources().getDrawable(R.mipmap.ic_launcher);
        imgView.setImageDrawable(drawable);
    }
}
