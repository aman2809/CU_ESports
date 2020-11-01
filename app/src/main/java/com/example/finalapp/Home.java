package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
public class Home extends AppCompatActivity{
        RecyclerView recyclerView;
        BottomNavigationView mBottomNavigationView;

protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mBottomNavigationView = findViewById(R.id.bottomNav);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) mBottomNavigationView.getLayoutParams();
        mBottomNavigationView.getMenu().getItem(1).setChecked(true);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList <GamingModel> list = new ArrayList<>();
        list.add(new GamingModel(R.drawable.callofduty , getString(R.string.cod)));
        list.add(new GamingModel(R.drawable.freefire , getString(R.string.f_fire)));
        list.add(new GamingModel(R.drawable.pubglite , getString(R.string.p_lite)));
        list.add(new GamingModel(R.drawable.pubg , getString(R.string.p_ubg)));
        list.add(new GamingModel(R.drawable.callofduty , getString(R.string.ash_9)));

        GamingAdaptor adapter = new GamingAdaptor(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        }

public void goToAnActivity(View view) {
        Intent intent = new Intent(Home.this, ContestActivity.class);
        startActivity(intent);
        }


}