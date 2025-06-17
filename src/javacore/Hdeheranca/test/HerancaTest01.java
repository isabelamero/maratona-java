package javacore.Hdeheranca.test;

import javacore.Hdeheranca.dominio.Endereco;
import javacore.Hdeheranca.dominio.Funcionario;
import javacore.Hdeheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111111");
        pessoa.setEndereço(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222222");
        funcionario.setEndereço(endereco);
        funcionario.setSalario(20000);
        System.out.println("------------------------");
        funcionario.imprime();

    }
}
