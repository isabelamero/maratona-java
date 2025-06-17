package javacore.Hdeheranca.Exercicios.Veiculos;

public class Carro extends Veiculo{
    private int numeroPortas;


    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro:");
        super.exibirInformacoes();
        System.out.println("Número de portas: " + this.numeroPortas);
    }
}
