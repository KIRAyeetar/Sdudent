package com.example.administrator.phonebook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *   想创建SQ数据库失败.......这页可以无视....
 */


public class Student extends SQLiteOpenHelper {

    private static final String DB_NAME = "Student.db";
    private static final int version = 1;
    public Student(Context context) {
        super(context, DB_NAME, null, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table user(username varchar(20) not null , password varchar(60) not null );";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
