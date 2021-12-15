package MeinBier.controller;

import MeinBier.model.Equipamento;
import MeinBier.model.Ingrediente;
import MeinBier.model.ReceitaProdutor;
import java.time.LocalTime;
import java.util.ArrayList;

public class ControladorReceita {
    public void criarReceita(ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos, LocalTime tempo, float preco){
        ReceitaProdutor receita = new ReceitaProdutor(ingredientes, equipamentos, tempo, preco);
    }
}