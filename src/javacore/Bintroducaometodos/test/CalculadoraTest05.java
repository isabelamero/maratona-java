package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //no somaArray você não consegue colocar os valores na chamada, tem que ter uma variável
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);

        //o VarArgs serve como uma sintaxe alternativa para Arrays
        calculadora.somaVarArgs(1,2,3,4,5,6,7);

    //public static void main(String... args) a main funcionaria normalmente se fizesse essa troca
    }
}
