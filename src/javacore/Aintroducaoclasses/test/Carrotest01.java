package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Cobalt";
        carro1.modelo = "Sedan";
        carro1.ano = 2014;


        Carro carro2 = new Carro();
        carro2.nome = "Premium";
        carro2.modelo = "Sedan";
        carro2.ano = 1998;

        carro1 = carro2;

        System.out.println("Nome: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);


    }
}
