package javacore.Hdeheranca.Exercicios.Funcionarios;

public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        double salarioBase = 2356.00;

        Gerente gerente = new Gerente("Tsunade",salarioBase,1000.00);
        Estagiario estagiario = new Estagiario("Naruto", salarioBase);

        double gerenteSalario = gerente.calcularSalario(salarioBase);
        double estagiarioSalario = estagiario.calcularSalario(salarioBase);

        System.out.println("Gerente salário: " + gerenteSalario);
        System.out.printf("Estagiário salário: %.2f%n", estagiarioSalario);
    }
}
