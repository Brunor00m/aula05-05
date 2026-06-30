package com.example.brunoatividadeiiapiibimii.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import android.database.sqlite.SQLiteDatabase;

import android.util.Log;


import com.example.brunoatividadeiiapiibimii.api.AppUtil;
import com.example.brunoatividadeiiapiibimii.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String NAME = "etim.db";
    public static int version = 2;

    public boolean update(String tabela, ContentValues dados, String whereClause, String[] whereArgs){

        db = getWritableDatabase();

        return db.update(tabela, dados, whereClause, whereArgs) > 0;

    }
    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, NAME, null, version);
        this.db = getWritableDatabase();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG,"Criando a tabela"+ ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criarTabela());
    }
    public boolean insert(String tabela, ContentValues dados){
        db=getWritableDatabase();
        boolean retorno = false;
        return  db.insert(tabela, null, dados)>0;
    }

}
