package MeinBier.model;

import java.util.ArrayList;

public class Produtor extends Usuario {
    private ArrayList<ReceitaProdutor> receitas = new ArrayList<>();
    
    public Produtor(String nome) {
        super(nome);
    }
    public void aceitarSolicitacao(Solicitacao solicitacao) {

    }
    public ArrayList<ReceitaProdutor> getReceitas() {
        return this.receitas;
    }

    public void setReceitas(ReceitaProdutor receita) {
        this.receitas.add(receita);
    }
}