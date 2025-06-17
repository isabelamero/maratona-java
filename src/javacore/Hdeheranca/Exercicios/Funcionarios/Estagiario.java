package javacore.Hdeheranca.Exercicios.Funcionarios;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario(double salarioBase){
        return salarioBase*0.8;
    }
}
