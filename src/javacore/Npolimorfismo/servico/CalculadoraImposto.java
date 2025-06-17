package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;


public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        if(produto instanceof Tomate) {
            /*Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
            OU
            System.out.println(((Tomate)produto).getDataValidade());
            OU
            */
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println(dataValidade);
        }


    }

}
