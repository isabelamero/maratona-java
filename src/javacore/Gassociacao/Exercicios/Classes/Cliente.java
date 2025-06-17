package javacore.Gassociacao.Exercicios.Classes;

// Classe para gerenciar os clientes
public class Cliente {
    private String nome;          // Atributo que guarda o nome do cliente.
    private Pedido[] pedido;      // Array para armazenar pedidos.
    private int contador;         // Contador para controlar a posição atual no array.

    // Construtor padrão
    public Cliente() {
        this.pedido = new Pedido[10]; // Inicializa o array com tamanho padrão.
        this.contador = 0;            // Inicializa o contador como zero.
    }

    // Construtor que permite tamanho personalizado
    public Cliente(String nome, int tamanhoArray) {
        this.nome = nome;
        this.pedido = new Pedido[tamanhoArray]; // Define tamanho do array de pedidos.
        this.contador = 0;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pedido[] getPedido() {
        return pedido;
    }

    public void setPedido(Pedido[] pedido) {
        this.pedido = pedido;
    }

    // Adiciona um novo pedido ao array
    public void novoPedido(String descricao, double valor) {
        if (contador < pedido.length) { // Verifica se há espaço no array.
            pedido[contador++] = new Pedido(descricao, valor); // Adiciona pedido e atualiza contador.
        } else {
            System.out.println("Não é possível adicionar mais pedidos. Limite alcançado.");
        }
    }

    // Lista todos os pedidos do cliente
    public void listarPedidos() {
        if (contador == 0) { // Verifica se há pedidos antes de listar.
            System.out.println("Nenhum pedido encontrado.");
            return;
        }
        for (int i = 0; i < contador; i++) { // Itera apenas pelos índices válidos.
            System.out.println("Descrição do Produto: " + pedido[i].getDescricao() +
                    "\nValor do Pedido: " + pedido[i].getValor());
        }
    }
}
