package com.primeira.continuada;

public class Porteiro extends Funcionario {

 private Double salario;

    public Porteiro( String nome,String re, Double salario) {
        super(re, nome);
        this.salario = 0.0;
    }

    public Double getSalario() {
        return salario;
    }

    
    @Override
    public Double calcSalario() {
        return salario;
    }


   
}
