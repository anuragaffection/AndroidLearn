package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentKumar extends Fragment {

    public FragmentKumar() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_kumar, container, false);

        TextView txtCard2 = view.findViewById(R.id.txtCard2);

        return view;
    }
}