package javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    public static final double VELOCIDADE_LIMITE = 250;

    public final void imprime() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    /*Constantes devem ser em CAPS e Underline e é necessário dar um valor
    Valor não pode ser alterado uma vez que foi associado indepentende se é privado ou público*/

    /*Outras maneira sde inicializar a constante
    public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 250;
    }
    ou

    public Carro() {
    VELOCIDADE_LIMITE = 250;
    }
    e se tirar o static pela main chama pelo nome do Objeto e não pela classe
    */
}
