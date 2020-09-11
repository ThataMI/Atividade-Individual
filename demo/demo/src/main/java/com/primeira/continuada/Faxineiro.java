package com.primeira.continuada;

public class Faxineiro extends Funcionario {

    private Double valorHora;
    private Integer quantidadeHora;

    public Faxineiro( String nome,String re, Integer quantidadeHora, Double valorHora) {
        super(re, nome);
        this.quantidadeHora = 0;
        this.valorHora = 0.0;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Integer getQuantidadeHora() {
        return quantidadeHora;
    }

 
    
    @Override
    public Double calcSalario() {
        return quantidadeHora * valorHora;
    }

    
}
