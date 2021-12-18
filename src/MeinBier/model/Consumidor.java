package MeinBier.model;

import java.util.ArrayList;

public class Consumidor extends Usuario {
    private ArrayList<ReceitaConsumidor> receitas = new ArrayList<>();
    public Consumidor(String nome) {
        super(nome);
    }
    public void realizarSolicitacao(ReceitaProdutor receita) {

    }
}
