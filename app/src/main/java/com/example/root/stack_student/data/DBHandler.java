package com.example.root.stack_student.data;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Arjemariel J. Requina on 3/24/17.
 */


/**
 * The class used for operations(add, delete, update, retrieve, list) involving in the database.
 */

public class DBHandler extends  SQLiteOpenHelper {
//    The current database version
    public static final int DB_VERSION = 1:
//    Database name
    public static final String DB_NAME = "stack_student";

//    Student Table Name
    public static final String STUDENT_TB = "student";

//    Student Table Column Names
// Creating Tables

    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
//        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + "("
//                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
//                + KEY_PH_NO + " TEXT" + ")";
//        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        // Drop older table if existed
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
//
//        // Create tables again
//        onCreate(db);
    }


}
