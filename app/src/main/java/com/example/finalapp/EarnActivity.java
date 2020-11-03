package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EarnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earn);
        BottomNavigationView mBottomNavigationView;

        mBottomNavigationView = findViewById(R.id.bottomNav3);
        overridePendingTransition(R.anim.fade_in, R.anim.fadeout);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mBottomNavigationView.getLayoutParams();
        mBottomNavigationView.getMenu().getItem(0).setChecked(true);

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.about) {
                    Intent intent = new Intent(EarnActivity.this, Profile.class);
                    startActivity(intent);
                    return true;
                }
                if (item.getItemId() == R.id.home) {
                    Intent intent = new Intent(EarnActivity.this, Home.class);
                    startActivity(intent);
                    return true;
                }
                if (item.getItemId() == R.id.money) {
                    Intent intent = new Intent(EarnActivity.this, EarnActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(intent);
                    return true;
                }

                return false;
            }
        });

    }

    @Override
    protected void onPause() {

        super.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fadeout);

    }
}