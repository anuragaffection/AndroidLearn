package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class MyDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ContactsDB";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_CONTACT = "contact";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_PHONE_NO = "phone_no";


    public MyDBHelper( Context context ) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL (
                " CREATE TABLE " + TABLE_CONTACT + " ( " +
                        KEY_ID + "INTEGER PRIMARY KEY AUTOINCREMENT ," +
                        KEY_NAME + "TEXT," +
                        KEY_PHONE_NO + "TEXT" +
                        ")"
        );

        SQLiteDatabase database = this.getWritableDatabase();
        database.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACT);
        onCreate(db);
    }

    public void addContacts(String name , String phone_no) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_PHONE_NO, phone_no);

        db.insert(TABLE_CONTACT, null, values);
    }


    public ArrayList<ContactModel1> fetchContacts (){

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_CONTACT, null);

        ArrayList<ContactModel1> arrContacts = new ArrayList<>();

        while (cursor.moveToNext()){
            ContactModel1 model1 = new ContactModel1();
            model1.id = cursor.getInt(0);
            model1.name = cursor.getString(1);
            model1.phone_no = cursor.getString(2);

            arrContacts.add(model1);
        }

       return arrContacts;
    }

    public void updateContacts(ContactModel1 contactModel1){

        SQLiteDatabase database = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_PHONE_NO, contactModel1.phone_no);

        database.update(TABLE_CONTACT,values,KEY_ID + " = " + contactModel1.id, null);

    }

}
