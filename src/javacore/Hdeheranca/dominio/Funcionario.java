package javacore.Hdeheranca.dominio;

//todas as classes extendem de 'Object'
//"Funcionario extends Pessoa"
//"Pessoa extends Object"

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime() {
        //importa o método da classe Pai(da classe genérica que foi extendida)
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        //protected dá acesso aos atributos diretamente sem uso de get
        //para as subclasses e mesmo pacote
        System.out.println("Eu " + this.nome+ " recebi o slario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
