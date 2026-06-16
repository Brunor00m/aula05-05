package com.example.brunoatividadeiiapiibimii.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.brunoatividadeiiapiibimii.datamodel.ClienteDataModel;
import com.example.brunoatividadeiiapiibimii.datasource.AppDataBase;
import com.example.brunoatividadeiiapiibimii.model.Cliente;


public class ClienteController extends AppDataBase {

    ContentValues dados;
    public boolean insert(Cliente obj) {
        dados = new ContentValues();
        dados.put(ClienteDataModel.NOME, obj.getNome());
        dados.put(ClienteDataModel.EMAIL, obj.getEmail());

        String tabela = ClienteDataModel.TABELA;
        return insert(tabela, dados);

    }


    public ClienteController(Context context){
        super(context);

    }
}
