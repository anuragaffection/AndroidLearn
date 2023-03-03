package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FragmentAnu();
        }
        else if (position == 1){
            return new FragmentKumar();
        }
        else {
            return new FragmentAffection();
        }

    }

    @Override
    public int getCount() {
        return 3; // No. of tabs
    }
    // tab
    // bottom navigation
    // drawer


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return "Anurag ";
        }
        else if (position == 1){
            return "Kumar";
        }
        else {
            return "Affection";
        }
    }
    
}
