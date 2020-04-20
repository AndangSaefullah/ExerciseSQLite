package com.example.exercisesqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "tambahkontak.db";
    private static final int DATABASE_VERSION =  1;
    public DataHelper (Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate (SQLiteDatabase db) {
        String sql = "Create Table Biodata(no integer primary key, nama text null, email text null, alamat text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2) {

    }
}