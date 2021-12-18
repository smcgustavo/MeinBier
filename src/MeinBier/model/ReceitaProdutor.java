package MeinBier.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class ReceitaProdutor extends Receita {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();
    private LocalTime tempo;
    private float preco;

    public ReceitaProdutor(String nome, ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos, LocalTime tempo, float preco) {
        super(nome,ingredientes);
        this.tempo = tempo;
        this.preco = preco;
        this.equipamentos = equipamentos;
    }
    public ReceitaProdutor(String nome, ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos,float preco) {
        super(nome, ingredientes);
        this.preco = preco;
        this.equipamentos = equipamentos;
    }
    public ReceitaProdutor(String nome, ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos) {
        super(nome, ingredientes);
        this.equipamentos = equipamentos;
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public LocalTime getTempo() {
        return tempo;
    }

    public void setTempo(LocalTime tempo) {
        this.tempo = tempo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}