package com.example.brunoatividadeiiapiibimii.controller;

public interface iCrud<T> {
    public boolean incluir(T obj);

    public boolean alterar(T obj);

    public boolean deletar(T obj);

    public void listar(T obj);
}
