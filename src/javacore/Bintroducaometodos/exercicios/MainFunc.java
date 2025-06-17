package javacore.Bintroducaometodos.exercicios;

public class MainFunc {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();


        funcionario.setNome("Sung Jinwoo");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{3000, 5000, 6000});

        funcionario.imprimirDados();
        //funcionario.imprimeMediaSalarios(funcionario.salarios);
        System.out.println("Média: " + funcionario.getMedia());


    }
}
