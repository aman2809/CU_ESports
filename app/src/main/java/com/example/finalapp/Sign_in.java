package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button sign_up = findViewById(R.id.button_sign_up);
        //Sign Up Button Action
        sign_up.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Sign_in();
            }
            public void Sign_in()
            {
                Intent intent = new Intent(Sign_in.this, Home.class);
                startActivity(intent);
            }
        });
    }
}