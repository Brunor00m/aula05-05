package com.example.brunoatividadeiiapiibimii.datamodel;

public class UsuarioDataModel {



        public static final String TABELA = "usuario";

        public static final String ID = "id";
        public static final String NOME = "usuario";
        public static final String SENHA = "senha";

        public static String criarTabela(){

            return "CREATE TABLE " + TABELA + " ("
                    + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + NOME + " TEXT, "
                    + SENHA + " TEXT)";
        }
    }


