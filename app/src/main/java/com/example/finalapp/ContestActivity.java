package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class ContestActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest);

        viewPager = findViewById(R.id.vPager);
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));

        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

    public void goToMainActivity(View view) {
        Intent intent = new Intent(ContestActivity.this, Home.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent(ContestActivity.this, Home.class);
        startActivity(intent);

    }
}