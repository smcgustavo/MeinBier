package MeinBier.model;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Solicitacao> solicitacoes = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(ArrayList<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome +  ", solicitacoes=" + solicitacoes + '}';
    }
}