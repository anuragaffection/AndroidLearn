package com.example.myapplication;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.Objects;


public class ListLearn extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_learn);


        //String list = "A list is any information displayed or organised in a logical or linear formation. \nIt is a //view which groups several items and display them in vertical scrollable list. \n\nIt includes ListView, //Spinner, AutoCompleteTextView";

        ListView listView1 = findViewById(R.id.listView1);

        ArrayList<String> arrNames = new ArrayList<>();


        arrNames.add("00 - AA");
        arrNames.add("01 - Anurag Affection");
        arrNames.add("02 - Spinner");
        arrNames.add("03 - Auto Complete Text View ");
        arrNames.add("04 - Lottie Animation");
        arrNames.add("05 - Card View");
        arrNames.add("06 - Recycler View ");
        arrNames.add("07 - App Bar ");
        arrNames.add("08 - Drawable Learn ");
        arrNames.add("09 - Simple Toast ");
        arrNames.add("10 - Customize Toast ");
        arrNames.add("11 - Simple Alert Dialog Box " );
        arrNames.add("12 - Double Alert Dialog Box ");
        arrNames.add("13 - Triple Button Dialog Box ");
        arrNames.add("14 - Custom Dialog Box ");
        arrNames.add("15 - Simple Notification ");
        arrNames.add("16 - Customize Notification Big Picture ");
        arrNames.add("17 - Customize Notification Inbox Text ");
        arrNames.add("18 - Call me ");
        arrNames.add("19 - Message me ");
        arrNames.add("20 - Mail me ");
        arrNames.add("21 - Share Button ");
        arrNames.add("22 - Static Frame");
        arrNames.add("23 - Dynamic Frame ");
        arrNames.add("24 - Tab ");
        arrNames.add("25 - Drawer");
        arrNames.add("26 - Gaya College Gaya ");
        arrNames.add("27 - Logout from Application ");



        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);

        listView1.setAdapter(listAdapter);


        listView1.setOnItemClickListener((adapterView, view, i, l) -> {
            // adapterView =
            // View view = each view in list
            // int i = position or index
            // long l = time taken on clicking view

            if (i == 0){
                Toast.makeText(ListLearn.this, "Clicked AA = Anurag Affection ", LENGTH_LONG).show();
            }
            else if (i==1){
                Intent iAnu;
                iAnu = new Intent(ListLearn.this, MainActivity2.class);
                startActivity(iAnu);
            }
            else if (i == 2 || i == 3){
                Intent iSpinner ;
                iSpinner = new Intent(ListLearn.this, SpinnerLearn.class);
                startActivity(iSpinner);
            }
            else if (i == 4){
                Intent iLottie;
                iLottie = new Intent(ListLearn.this, Lottie.class);
                startActivity(iLottie);
            }
            else if (i == 5){
                Intent iCard;
                iCard = new Intent(ListLearn.this, CardViewLearn.class);
                startActivity(iCard);
            }
            else if (i == 6){
                Intent iRecycle;
                iRecycle = new Intent(ListLearn.this, RecycleLearn.class);
                startActivity(iRecycle);
            }
            else if (i == 7){
                Intent iAppBar;
                iAppBar = new Intent(ListLearn.this, AppBarLearn.class);
                startActivity(iAppBar);
            }
            else if (i == 8){
                Intent iDraw;
                iDraw = new Intent(ListLearn.this, DrawableLearn.class);
                startActivity(iDraw);
            }
            else if (i == 9){
                makeText(getApplicationContext(), "Simple Toast ", LENGTH_LONG).show();
            }
            else if (i == 10){

                Toast toast = new Toast(getApplicationContext());
                View view2 = getLayoutInflater().inflate(R.layout.custom_toast, findViewById(R.id.clView));
                toast.setView(view2);

                String txtMessage = "Message Sent Successfully! ";

                TextView txtMe;
                txtMe = view2.findViewById(R.id.txtMe);

                txtMe.setText(txtMessage);

                toast.setDuration(LENGTH_LONG);
                toast.show();
            }

            else if (i == 11){

                AlertDialog alertDialog = new AlertDialog.Builder(this).create();

                alertDialog.setTitle("Terms & condition");
                alertDialog.setIcon(R.drawable.baseline_info_24);
                alertDialog.setMessage("Have You read all the T & C ");

                alertDialog.setButton("Yes, I have read ", (dialogInterface, i1) ->
                        Toast.makeText(ListLearn.this, "Yes you can proceed ", Toast.LENGTH_LONG).show());

                alertDialog.show();
            }

            else if (i == 12){

                AlertDialog.Builder delDialog = new AlertDialog.Builder(ListLearn.this);

                delDialog.setTitle("Delete");
                delDialog.setIcon(R.drawable.baseline_delete_24);
                delDialog.setMessage("Are You sure want to delete ? ");

                delDialog.setPositiveButton("Yes", (dialogInterface, i16) ->
                        Toast.makeText(ListLearn.this, "Deleted", LENGTH_LONG).show());

                delDialog.setNeutralButton("No", (dialogInterface, i12) ->
                        Toast.makeText(ListLearn.this, "Item Not deleted", LENGTH_LONG).show());

                delDialog.show();
            }

            else if (i == 13) {

                AlertDialog.Builder extDialog = new AlertDialog.Builder(ListLearn.this);

                extDialog.setTitle("Exist ?");
                extDialog.setMessage("Are You sure want to exist ? ");
                extDialog.setIcon(R.drawable.baseline_exit_to_app_24);

                extDialog.setPositiveButton("Yes", (dialogInterface, i15) -> {
                   Intent iMain;
                   iMain = new Intent(ListLearn.this, MainActivity.class);
                   startActivity(iMain);
                });

                extDialog.setNegativeButton("No", (dialogInterface, i13) ->
                        Toast.makeText(ListLearn.this, "Welcome Back ", LENGTH_LONG).show());

                extDialog.setNeutralButton("Cancel", (dialogInterface, i14) ->
                        Toast.makeText(ListLearn.this, "Cancelled", LENGTH_LONG).show());

                extDialog.show();
            }

            else if (i == 14){

                Dialog dialog = new Dialog(ListLearn.this);
                dialog.setContentView(R.layout.custom_dialog_box);
                dialog.setCancelable(false);

                Button btnOkay = dialog.findViewById(R.id.btnOkay);

                btnOkay.setOnClickListener(view1 -> {
                        Toast.makeText(ListLearn.this, "Closed", LENGTH_LONG).show();
                        dialog.dismiss();
                });

                dialog.show();
            }

            else if ( i == 15){

                final String CHANNEL_ID = "My Channel";
                final int NOTIFICATION_ID = 100;

                Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.mobile_development, null);

                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

                assert bitmapDrawable != null;
                Bitmap largeIcon = bitmapDrawable.getBitmap();

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                Notification notification;

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .setChannelId(CHANNEL_ID)
                            .build();

                    nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
                }
                else {
                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .build();
                }
                nm.notify(NOTIFICATION_ID, notification);

            }

            else if ( i == 16){

                final String CHANNEL_ID = "My Channel";
                final int NOTIFICATION_ID = 100;
                final int REQ_CODE = 105;

                Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.mobile_development, null);

                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

                assert bitmapDrawable != null;
                Bitmap largeIcon = bitmapDrawable.getBitmap();

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                Notification notification;

                Intent iNotify = new Intent(getApplicationContext(), MainActivity.class);
                iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                PendingIntent pendingIntent = PendingIntent.getActivity(ListLearn.this, REQ_CODE, iNotify , PendingIntent.FLAG_UPDATE_CURRENT );

                Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle()
                        .bigPicture(((BitmapDrawable) (Objects.requireNonNull(ResourcesCompat.getDrawable(getResources(), R.drawable.anuragaffection, null)))).getBitmap())
                        .bigLargeIcon(largeIcon)
                        .setBigContentTitle("Image sent By Anurag Affection ")
                        .setSummaryText("Image Message ");


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .setContentIntent(pendingIntent)
                            .setStyle(bigPictureStyle)
                            .setChannelId(CHANNEL_ID)
                            .build();

                    nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
                }
                else {
                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .setContentIntent(pendingIntent)
                            .setStyle(bigPictureStyle)
                            .build();
                }
                nm.notify(NOTIFICATION_ID, notification);

            }

            else if ( i == 17){

                final String CHANNEL_ID = "My Channel";
                final int NOTIFICATION_ID = 100;
                final int REQ_CODE = 105;

                Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.mobile_development, null);

                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

                assert bitmapDrawable != null;
                Bitmap largeIcon = bitmapDrawable.getBitmap();

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                Notification notification;

                Intent iNotify = new Intent(getApplicationContext(), MainActivity.class);
                iNotify.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                PendingIntent pendingIntent = PendingIntent.getActivity(ListLearn.this, REQ_CODE, iNotify , PendingIntent.FLAG_UPDATE_CURRENT );

                Notification.InboxStyle inboxStyle = new Notification.InboxStyle()
                        .addLine("Anurag Affection")
                        .addLine("Steve Rogers ")
                        .addLine("Captain America ")
                        .addLine("Team Cap ")
                        .addLine("Natasha RomanOff")
                        .addLine("Jane Foster ")
                        .addLine("Tony Stark")
                        .addLine("Peter Parker ")
                        .setBigContentTitle("Some name from Avengers ")
                        .setSummaryText("Avengers ");


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .setContentIntent(pendingIntent)
                            .setStyle(inboxStyle)
                            .setChannelId(CHANNEL_ID)
                            .build();

                    nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID, "New Channel", NotificationManager.IMPORTANCE_HIGH));
                }
                else {
                    notification = new Notification.Builder(ListLearn.this)
                            .setLargeIcon(largeIcon)
                            .setSmallIcon(R.drawable.mobile_development)
                            .setContentText("In order to be irreplaceable, one must always be different! ")
                            .setSubText("New Message from Anurag Affection")
                            .setContentIntent(pendingIntent)
                            .setStyle(inboxStyle)
                            .build();
                }
                nm.notify(NOTIFICATION_ID, notification);
            }

            else if ( i == 18 ){
                Intent iDial = new Intent(Intent.ACTION_DIAL);
                iDial.setData(Uri.parse("tel: +918294515714"));
                startActivity(iDial);
            }

            else if ( i == 19 ){
                Intent iMsg = new Intent(Intent.ACTION_SENDTO);
                iMsg.setData(Uri.parse("sms to:" + Uri.encode("+918294515714")));
                iMsg.putExtra("Anurag ", "I am open to work");
                startActivity(iMsg);

            }

            else if (i == 20 ){
                Intent iMail = new Intent(Intent.ACTION_SEND);
                iMail.setType("message / rfc822 ");
                iMail.putExtra(Intent.EXTRA_EMAIL, new String[]{"anuragaffection07@gmail.com"});
                iMail.putExtra(Intent.EXTRA_SUBJECT, "Regarding Android Development ");
                iMail.putExtra(Intent.EXTRA_TEXT, "Freshers Jobs in Android Development ");
                startActivity(Intent.createChooser(iMail, "Mail via "));
            }

            else if ( i == 21 ){
                Intent iShare = new Intent(Intent.ACTION_SEND);
                iShare.setType("plain/text");
                iShare.putExtra(Intent.EXTRA_TEXT, "Share this app, https://www.youtube.com/@AnuragAffection");
                startActivity(Intent.createChooser(iShare, "Share via "));
            }

            else if ( i == 22){
                Intent iStatic;
                iStatic = new Intent(ListLearn.this, StaticFrame.class);
                startActivity(iStatic);
            }

            else if ( i == 23 ){
                Intent iDynamic;
                iDynamic = new Intent(ListLearn.this, DynamicFrame.class);
                startActivity(iDynamic);
            }

            else if ( i == 24){
                Intent iTab;
                iTab = new Intent(ListLearn.this, TabLearn.class);
                startActivity(iTab);
            }

            else if (i == 25){
                Intent iDrawer;
                iDrawer = new Intent(ListLearn.this,DrawerNavigation.class);
                startActivity(iDrawer);
            }

            else if (i == 26){
                Intent iGCG;
                iGCG = new Intent(ListLearn.this, GayaCollegeGaya.class);
                startActivity(iGCG);
            }

            else if ( i == 27){
                SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                editor.putBoolean("flag", false);
                editor.apply();

                Intent iLogin = new Intent(ListLearn.this, LoginPage.class);
                startActivity(iLogin);
                finishAffinity();
            }

        });


    }
}