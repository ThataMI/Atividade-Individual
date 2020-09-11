package com.primeira.continuada;

public abstract class Funcionario {

    private String re;
    private String nome;

    public Funcionario(String re, String nome) {
        this.re = re;
        this.nome = nome;
    }

    public abstract Double calcSalario();

    public String getRe() {
        return re;
    }

    public String getNome() {
        return nome;
    }

   
}
