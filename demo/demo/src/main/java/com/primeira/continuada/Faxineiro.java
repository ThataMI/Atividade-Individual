package com.primeira.continuada;

public class Faxineiro extends Funcionario {

    private Double valorHora;
    private Integer quantidadeHora;

    public Faxineiro( String nome,String re, Integer qtdHora, Double valorHora) {
        super(re, nome);
        this.quantidadeHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return quantidadeHora * valorHora;
    }

    @Override
    public String toString() {
        return "Faxineiro{" +
                "valorHora=" + valorHora +
                ", quantidadeHora=" + quantidadeHora + ", salário=" + calcSalario() +
                "} " + super.toString();

    }
}
