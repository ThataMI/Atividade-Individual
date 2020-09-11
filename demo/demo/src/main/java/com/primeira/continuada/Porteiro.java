package com.primeira.continuada;

public class Porteiro extends Funcionario {

 private Double salario;

    public Porteiro( String nome,String re, Double salario) {
        super(re, nome);
        this.salario = salario;
    }

    @Override
    public Double calcSalario() {
        return salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}' + super.toString();
    }
}
