package javacore.Hdeheranca.dominio;

//todas as classes extendem de 'Object'
//"Pessoa extends Object"

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereço;

    static {
    System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }


    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    /*public Pessoa() {
        //tá chamando o super da classe object
        super();
    }*/

    public void imprime() {
    System.out.println(this.nome);
    System.out.println(this.cpf);
    System.out.println(this.endereço.getRua() + " " + this.endereço.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
}
