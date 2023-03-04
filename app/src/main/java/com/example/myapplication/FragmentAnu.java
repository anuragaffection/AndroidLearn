package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentAnu extends Fragment {

    public FragmentAnu() {

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        TextView txtCard1 = null;

        if (getArguments()!= null){
            String name = getArguments().getString("Arg1");
            int roll = getArguments().getInt("Arg2");
            assert false;
            txtCard1.setText(name + " " + roll);
        }


        return inflater.inflate(R.layout.fragment_anu, container, false);
    }
}