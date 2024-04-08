package com.example.demowebapp;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = setSaluto(nome, provincia);
    }

    public String setSaluto(String nome, String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + " ?";
    }
}
