package com.example.myfirstapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screen extends AppCompatActivity {

    boolean roundImage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        ImageView imgView=(ImageView) findViewById(R.id.screenImage);
        Drawable drawable  = getResources().getDrawable(R.mipmap.ic_launcher);
        imgView.setImageDrawable(drawable);
    }

    protected void changeImage(View view) {
        ImageView imgView=(ImageView) findViewById(R.id.screenImage);
        if(roundImage){
            Drawable drawable  = getResources().getDrawable(R.mipmap.ic_launcher);
            imgView.setImageDrawable(drawable);
            roundImage = false;
        }
        else {
            Drawable drawable  = getResources().getDrawable(R.mipmap.ic_launcher_round);
            imgView.setImageDrawable(drawable);
            roundImage = true;
        }


    }
}
