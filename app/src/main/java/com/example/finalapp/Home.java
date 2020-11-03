package com.example.finalapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
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

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            if (item.getItemId() == R.id.about) {
                Intent intent = new Intent(Home.this, Profile.class);
                startActivity(intent);
                return true;
            }
            if (item.getItemId() == R.id.home) {
                Intent intent = new Intent(Home.this, Home.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                return true;
            }
            if (item.getItemId() == R.id.money) {
                Intent intent = new Intent(Home.this, EarnActivity.class);
                startActivity(intent);
                return true;
            }

            return false;
        }
    });

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

public void goToContest(View view) {
        Intent intent = new Intent(Home.this, ContestActivity.class);
        startActivity(intent);
        }
    public void goToHost(View view) {
        Intent intent = new Intent(Home.this, Host.class);
        startActivity(intent);
    }
        public void Dialogue(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(view.getContext()).inflate(R.layout.customview, viewGroup, false);
                builder.setView(dialogView);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

        }


}