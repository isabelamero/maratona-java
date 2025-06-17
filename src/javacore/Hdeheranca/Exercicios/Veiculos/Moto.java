package javacore.Hdeheranca.Exercicios.Veiculos;

public class Moto extends Veiculo{
    private String tipoGuidom;

    public Moto(String marca, String modelo, String tipoGuidom) {
        super(marca, modelo);
        this.tipoGuidom = tipoGuidom;
    }

    public String getTipoGuidom() {
        return tipoGuidom;
    }

    public void setTipoGuidom(String tipoGuidom) {
        this.tipoGuidom = tipoGuidom;
    }
    public void exibirInformacoes() {
        System.out.println("Moto:");
        super.exibirInformacoes();
        System.out.println("Tipo do guidom: " + this.tipoGuidom);
    }
}
