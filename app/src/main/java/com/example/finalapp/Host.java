package com.example.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalapp.R;

public class Host extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner Map_Spinner , P_Spinner, V_Spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        Map_Spinner = (Spinner) findViewById(R.id.spinner);
        P_Spinner = (Spinner) findViewById(R.id.spinner2);
        V_Spinner = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.map,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.Participants,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.View,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Map_Spinner.setAdapter(adapter);
        Map_Spinner.setOnItemSelectedListener(this);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        P_Spinner.setAdapter(adapter2);
        P_Spinner.setOnItemSelectedListener(this);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        V_Spinner.setAdapter(adapter3);
        V_Spinner.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getId() == R.id.spinner)
        {
            String text = adapterView.getItemAtPosition(i).toString();
        }
        else if(adapterView.getId() == R.id.spinner2)
        {
            String text = adapterView.getItemAtPosition(i).toString();
        }
        else if(adapterView.getId() == R.id.spinner3)
        {
            String text = adapterView.getItemAtPosition(i).toString();
        }


    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void onBackPressed() {
        Intent intent = new Intent(Host.this, Home.class);
        startActivity(intent);

    }

}