package javacore.Hdeheranca.Exercicios.Veiculos;

public class MainVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", "Cobalt", 4);
        Moto moto = new Moto("Yamaha", "YBR 150","Cross");
        Caminhao caminhao = new Caminhao("Mercedez", "Truck", 10000.00);

        carro.exibirInformacoes();
        System.out.println("-----------------------");
        moto.exibirInformacoes();
        System.out.println("-----------------------");
        caminhao.exibirInformacoes();
    }

}
