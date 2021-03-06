package com.example.finalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button back_to_home = findViewById(R.id.back_to_home_button);

        BottomNavigationView mBottomNavigationView;
        overridePendingTransition(R.anim.fade_in, R.anim.fadeout);
        mBottomNavigationView = findViewById(R.id.bottomNav2);
        mBottomNavigationView.getMenu().getItem(2).setChecked(true);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.about) {
                    Intent intent = new Intent(Profile.this, Profile.class);
                    startActivity(intent);
                    return true;
                }
                if (item.getItemId() == R.id.home) {
                    Intent intent = new Intent(Profile.this, Home.class);
                    startActivity(intent);
                    return true;
                }
                if (item.getItemId() == R.id.money) {
                    Intent intent = new Intent(Profile.this, ContestActivity.class);
                    startActivity(intent);
                    return true;
                }

                return false;
            }
        });
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
    @Override
    protected void onPause() {

        super.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fadeout);

    }

}
