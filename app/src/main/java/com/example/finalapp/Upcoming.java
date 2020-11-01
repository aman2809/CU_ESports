package com.example.finalapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;


public class Upcoming extends Fragment {
    View v;

    private List<ModelResult> firstContact;


    public Upcoming() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_upcoming, container, false);
        RecyclerView myRecyclerView = v.findViewById(R.id.resultRecycler);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),firstContact);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        firstContact = new ArrayList<>();
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));
        firstContact.add(new ModelResult("Squad Battle #4", "Time : 28/07/2020 08:00 PM", R.drawable.appicon));


    }
}