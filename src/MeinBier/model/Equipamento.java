package MeinBier.model;

public class Equipamento {
    private String nome;
    private String fabricante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Equipamento(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}