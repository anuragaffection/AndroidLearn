package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;

    ArrayList<ContactModel> arrContacts;

    private int lastPosition = -1;


    RecyclerContactAdapter(Context context, ArrayList<ContactModel>arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int Position) {

        int position = holder.getAdapterPosition();
        holder.imgContact.setImageResource(arrContacts.get(position).img);
        holder.txtName.setText(arrContacts.get(position).name);
        holder.txtNumber.setText(arrContacts.get(position).number);

        setAnimation(holder.itemView, position);

        holder.llView.setOnClickListener(view -> {
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.add_contact);

            EditText contactName = dialog.findViewById(R.id.contactName);
            EditText contactNumber = dialog.findViewById(R.id.contactNumber);
            Button btnSave = dialog.findViewById(R.id.btnSave);
            TextView addContact = dialog.findViewById(R.id.addContact);

            String updateContact = "Update Contact ";
            String update = "Update";
            addContact.setText(updateContact);
            btnSave.setText(update);

            contactName.setText((arrContacts.get(position)).name);
            contactNumber.setText((arrContacts.get(position)).number);

            btnSave.setOnClickListener(view1 -> {
                String name = "";
                String number = "";

                if (!contactName.getText().toString().equals("")){
                    name = contactName.getText().toString();
                } else {
                    Toast.makeText(context, "Please Enter Contact Name", Toast.LENGTH_LONG).show();
                }

                if (!contactNumber.getText().toString().equals("")){
                    number = contactNumber.getText().toString();
                } else {
                    Toast.makeText(context, "Please Enter Contact Number", Toast.LENGTH_LONG).show();
                }

                arrContacts.set(position, new ContactModel(name, number));
                notifyItemChanged(position);

                dialog.dismiss();
            });
            dialog.show();
        });


        holder.llView.setOnLongClickListener(view -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(context)
                    .setTitle("Delete contact")
                    .setMessage("Are you sure want to delete ? ")
                    .setIcon(R.drawable.baseline_delete_24)
                    .setPositiveButton("Yes", (dialogInterface, i) -> {
                        arrContacts.remove(position);
                        notifyItemRemoved(position);
                    })
                    .setNegativeButton("No", (dialogInterface, i) -> {

                    });
            builder.show();
            return true;
        });

    }


    @Override
    public int getItemCount() {
        return arrContacts.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtNumber;
        ImageView imgContact;

        LinearLayout llView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgContact = itemView.findViewById(R.id.imgContact);
            llView = itemView.findViewById(R.id.llView);


        }
    }


    private void setAnimation (View viewToAnimate, int position){

        if (position > lastPosition){
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(slideIn);
            lastPosition = position;
        }

    }

}
