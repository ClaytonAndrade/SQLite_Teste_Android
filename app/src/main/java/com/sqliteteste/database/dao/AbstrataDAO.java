package com.sqliteteste.database.dao;

import android.database.sqlite.SQLiteDatabase;

import com.sqliteteste.database.DBOpenHelper;

/**
 * Created by comp8 on 06/04/2017.
 */

public abstract class AbstrataDAO {

    protected SQLiteDatabase db;
    protected DBOpenHelper db_helper;

    protected final void Open(){
        db = db_helper.getWritableDatabase();
    }
    protected final void Close(){
        db_helper.close();
    }
}
