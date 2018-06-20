package com.sqliteteste.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sqliteteste.database.model.PessoaModel;

/**
 * Created by comp8 on 06/04/2017.
 */

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String BANCO_NOME = "teste.db";
    private static final int BANCO_VERSAO = 1;


    public DBOpenHelper(Context context) {
        super(context, BANCO_NOME, null, BANCO_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(PessoaModel.CREAT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
