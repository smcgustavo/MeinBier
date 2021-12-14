package MeinBier.model;

import java.util.ArrayList;

public class Receita {
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Receita(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}