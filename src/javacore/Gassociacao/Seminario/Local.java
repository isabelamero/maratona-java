package javacore.Gassociacao.Seminario;

public class Local {
    private String endereço;

    public Local() {

    }

    public Local(String endereço) {
        this.endereço = endereço;
    }

    public void imprime() {
        System.out.println(this.endereço);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
