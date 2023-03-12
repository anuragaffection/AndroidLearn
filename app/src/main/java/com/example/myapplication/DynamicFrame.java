package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class DynamicFrame extends AppCompatActivity {

    private static final String ROOT_FRAGMENT_TAG = "anu";
    Button btnFragA, btnFragB, btnFragC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_frame);

        loadFrag(new FragmentAnu(), 0);

        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        btnFragA.setOnClickListener(view -> loadFrag(new FragmentAnu(),1));

        btnFragB.setOnClickListener(view -> loadFrag( FragmentKumar.getInstance("Affection", 11),1));

        btnFragC.setOnClickListener(view -> loadFrag(new FragmentAffection(),1));

    }

    public void loadFrag (@NonNull Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Bundle bundle = new Bundle();
        bundle.putString("Arg1", "Anurag");
        bundle.putInt("Arg2", 18);

        fragment.setArguments(bundle);

        if (flag == 0){
            ft.add(R.id.container1, fragment);
            fm.popBackStack(ROOT_FRAGMENT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(ROOT_FRAGMENT_TAG);
        }
        else {
            ft.replace(R.id.container1, fragment);
            ft.addToBackStack(null);
        }


        ft.commit();
    }
}