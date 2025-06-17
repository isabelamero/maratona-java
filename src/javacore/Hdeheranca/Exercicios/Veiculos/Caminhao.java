package javacore.Hdeheranca.Exercicios.Veiculos;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao(String marca, String modelo, double capacidadeCarga) {
        super(marca, modelo);
        this.capacidadeCarga = capacidadeCarga;
    }
    public void exibirInformacoes(){
        System.out.println("Caminhão:");
        super.exibirInformacoes();
        System.out.println("Capacidade da carga: " + this.capacidadeCarga);
    }

}
