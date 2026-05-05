package com.example.brunoatividadeiiapiibimii.datamodel;

public class ClienteDataModel {
    public static final String TABELA = "cliente";
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String CEP = "cep";

    public static final String TELEFONE = "telefone";
    public static final String ENDERECO = "endereco";
    public static final String CIDADE = "cidade";
    public static final String ESTADO = "estado";
    public static final String EMAIL = "email";
    public static String queryCriarTabela = "";


    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA + "(";
        queryCriarTabela += ID + " INTEGER PRIMARY KEY AUTOINCREMENT,";
        queryCriarTabela += NOME + " TEXT,";
        queryCriarTabela += CEP + " TEXT,";
        queryCriarTabela += ENDERECO + " TEXT,";
        queryCriarTabela += CIDADE + " TEXT,";
        queryCriarTabela += ESTADO + " TEXT,";
        queryCriarTabela += TELEFONE + " TEXT,";
        queryCriarTabela += EMAIL + " TEXT";
        queryCriarTabela += ")";

        return queryCriarTabela;

    }
}
