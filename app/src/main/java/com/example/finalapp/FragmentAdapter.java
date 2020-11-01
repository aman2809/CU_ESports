package com.example.finalapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new Ongoing();
            case 1: return new Upcoming();
            case 2: return new Results();

            default: return new Ongoing();

        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if (position == 0){
            title = "ONGOING";
        }

        else if (position == 1){
            title = "UPCOMING";
        }

        else if (position == 2){
            title = "RESULTS";
        }

        return title;
    }
}