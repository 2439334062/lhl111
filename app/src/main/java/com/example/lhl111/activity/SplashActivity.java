package com.example.lhl111.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.lhl111.R;

public class SplashActivity extends AppCompatActivity {
     private  boolean isSkip;
     private  boolean isBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView = findViewById(R.id.imageView2);
        Glide.with(this).load("http://5b0988e595225.cdn.sohucs.com/images/" +
                "20190831/05de49d16e374e9e997bc97fdf29b0cc.gif").into(imageView);
       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(!isSkip&&!isBack){
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
            }
                finish();
            }
        },5000);
    }

    public void skip(View view) {
        isSkip=true;
        Intent intent = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isBack=true;
    }
}