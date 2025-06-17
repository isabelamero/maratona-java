package javacore.Gassociacao.Exercicios.Classes;

import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 5);

        cliente.novoPedido("Pizza", 30.5);
        cliente.novoPedido("Refrigerante", 5.0);

        cliente.listarPedidos();


    }
}
