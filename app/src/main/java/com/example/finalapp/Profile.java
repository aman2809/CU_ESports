package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button back_to_home = findViewById(R.id.back_to_home_button);
        //Back To Home Button
        back_to_home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                back_to_home();
            }
            public void back_to_home()
            {
                Intent intent = new Intent(Profile.this, Log_in.class);
                startActivity(intent);
            }
        });
    }
}