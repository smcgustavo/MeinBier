package MeinBier.model;

import java.util.ArrayList;

public class Receita {
    private String nome;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public Receita(String nome, ArrayList<Ingrediente> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receita{" + "ingredientes=" + ingredientes.toString() + '}';
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}