package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

        //Modificador estático vai fazer o atributo pertencer a classe e todos os objetos vão compartilhar o mesmo valor

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);



        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
