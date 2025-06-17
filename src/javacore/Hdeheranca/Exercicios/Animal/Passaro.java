package javacore.Hdeheranca.Exercicios.Animal;

public class Passaro extends Animal {
    private double tamanhoAsa;

    public Passaro(String nome, int idade, double tamanhoAsa) {
        super(nome, idade);
        this.tamanhoAsa = tamanhoAsa;

    }

    public double getTamanhoAsa() {
        return tamanhoAsa;
    }
    public void setTamanhoAsa(double tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }

    public void mover() {
        System.out.println("Voando");
    }

}
