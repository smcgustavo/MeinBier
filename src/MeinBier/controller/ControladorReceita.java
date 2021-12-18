package MeinBier.controller;

import MeinBier.model.Equipamento;
import MeinBier.model.Ingrediente;
import MeinBier.model.ReceitaProdutor;
import java.time.LocalTime;
import java.util.ArrayList;

public class ControladorReceita {
    public ReceitaProdutor criarReceita(String nome, ArrayList<Ingrediente> ingredientes, ArrayList<Equipamento> equipamentos){
        return new ReceitaProdutor(nome, ingredientes, equipamentos);
    }
}