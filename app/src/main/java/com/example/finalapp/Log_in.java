package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalapp.R;
import com.example.finalapp.Sign_in;

public class Log_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button sign_up = findViewById(R.id.signup_button);
        Button profile_button = findViewById(R.id.profile_button);
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
                Intent intent = new Intent(Log_in.this, Sign_in.class);
                startActivity(intent);
            }
        });
        profile_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                profile_button();
            }
            public void profile_button()
            {
                Intent intent = new Intent(Log_in.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}