package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class RecycleLearn extends AppCompatActivity {


    RecyclerContactAdapter adapter;

    RecyclerView recyclerView;
    FloatingActionButton btnOpenDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_learn);


        recyclerView = findViewById(R.id.recyclerContact);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<ContactModel> arrContacts = new ArrayList<>();


        btnOpenDialog.setOnClickListener(view -> {

            Dialog dialog = new Dialog(RecycleLearn.this);
            dialog.setContentView(R.layout.add_contact);

            EditText contactName = dialog.findViewById(R.id.contactName);
            EditText contactNumber = dialog.findViewById(R.id.contactNumber);
            Button btnSave = dialog.findViewById(R.id.btnSave);

            
            btnSave.setOnClickListener(view1 -> {
                String name = "";
                String number = "";

                if (!contactName.getText().toString().equals("")){
                    name = contactName.getText().toString();
                } else {
                    Toast.makeText(RecycleLearn.this, "Please Enter Contact Name", Toast.LENGTH_LONG).show();
                }

                if (!contactNumber.getText().toString().equals("")){
                     number = contactNumber.getText().toString();
                } else {
                    Toast.makeText(RecycleLearn.this, "Please Enter Contact Number", Toast.LENGTH_LONG).show();
                }

                arrContacts.add(new ContactModel(R.drawable.anuragaffection, name, number));
                adapter.notifyItemInserted(arrContacts.size()-1);
                recyclerView.scrollToPosition(arrContacts.size()-1);

                dialog.dismiss();
            });

            dialog.show();
        });




        ContactModel model = new ContactModel(R.drawable.anuragaffection, "Anurag ", "9876543210");
        ContactModel model1 = new ContactModel(R.drawable.anuragaffection, "Anu ", "9876543210");
        ContactModel model2 = new ContactModel(R.drawable.anuragaffection, "Ashutosh Gaurav ", "9876543210");
        ContactModel model3 = new ContactModel(R.drawable.anuragaffection, "Anurag Affection ", "9876543210");
        ContactModel model4 = new ContactModel(R.drawable.anuragaffection, "Anushka  ", "9876543210");
        ContactModel model5 = new ContactModel(R.drawable.anuragaffection, "Alexander ", "9876543210");
        ContactModel model6 = new ContactModel(R.drawable.anuragaffection, "Axerio ", "9876543210");
        ContactModel model7 = new ContactModel(R.drawable.anuragaffection, "Steve Rogers", "9876543210");
        ContactModel model8 = new ContactModel(R.drawable.anuragaffection, "Natasha Romanoff ", "9876543210");
        ContactModel model9 = new ContactModel(R.drawable.anuragaffection, "Ankit  ", "9876543210");
        ContactModel model10 = new ContactModel(R.drawable.anuragaffection, "Tony Stark ", "9876543210");
        ContactModel model11 = new ContactModel(R.drawable.anuragaffection, "A ", "9876543210");

        arrContacts.add(model);
        arrContacts.add(model1);
        arrContacts.add(model2);
        arrContacts.add(model3);
        arrContacts.add(model4);
        arrContacts.add(model5);
        arrContacts.add(model6);
        arrContacts.add(model7);
        arrContacts.add(model8);
        arrContacts.add(model9);
        arrContacts.add(model10);
        arrContacts.add(model11);


        RecyclerContactAdapter recyclerContactAdapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(recyclerContactAdapter);


    }
}