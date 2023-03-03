package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentAffection extends Fragment {


    public FragmentAffection() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_affection, container, false);

        TextView txtCard3 = view.findViewById(R.id.txtCard3);
        return view;
    }
}