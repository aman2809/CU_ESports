package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables
    Animation topAnim,bottomAnim,leftAnim,rightAnim;
    ImageView image;
    TextView left_logo,slogan,right_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //Animation
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        leftAnim = AnimationUtils.loadAnimation(this,R.anim.left_anim);
        rightAnim = AnimationUtils.loadAnimation(this,R.anim.right_anim);
        //Hooks
        image = findViewById(R.id.imageView);
        left_logo = findViewById(R.id.textView3);
        right_logo = findViewById(R.id.textView5);
        slogan = findViewById(R.id.textView2);
        //Animation
        image.setAnimation(topAnim);
        right_logo.setAnimation(rightAnim);
        left_logo.setAnimation(leftAnim);
        slogan.setAnimation(bottomAnim);
        int SPLASHSCREEN = 5000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Log_in.class);
                startActivity(intent);
                finish();
            }
        }, SPLASHSCREEN);
    }
}