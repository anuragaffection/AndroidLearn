package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentKumar extends Fragment {

    private static final String ARG1 = "argument1";
    private static final String ARG2 = "argument2";

    public FragmentKumar() {

    }

    public static FragmentKumar getInstance(String value1, int value2){
        FragmentKumar fragmentKumar = new FragmentKumar();

        Bundle bundle = new Bundle();
        bundle.putString(ARG1, value1);
        bundle.putInt(ARG2, value2);

        fragmentKumar.setArguments(bundle);

        return fragmentKumar;
    }




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView txtCard2 = null;

        if (getArguments()!= null){
            String name = getArguments().getString(ARG1);
            int roll = getArguments().getInt(ARG2);
            assert false;
            txtCard2.setText(name + " " + roll);
        }


        return inflater.inflate(R.layout.fragment_kumar, container, false);
    }
}