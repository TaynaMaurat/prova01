package classes; 

public class Aeronave {
    private int quantidadePassageiros;
    private String numeroSerie;
    private String modelo;
    private Pessoa piloto;


    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Pessoa getPiloto() {
        return piloto;
    }
    public void setPiloto(Pessoa piloto) {
        this.piloto = piloto;
    }
    public Aeronave(int quantidadePassageiros, String numeroSerie, String modelo, Pessoa piloto) {
        this.quantidadePassageiros = quantidadePassageiros;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.piloto = piloto;
    }

    
    
}