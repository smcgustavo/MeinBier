package MeinBier.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class ReceitaProdutor extends Receita {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();
    private LocalTime tempo;
    private float preco;

    public ReceitaProdutor(ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos, LocalTime tempo, float preco) {
        super(ingredientes);
        this.tempo = tempo;
        this.preco = preco;
        this.equipamentos = equipamentos;
    }
}