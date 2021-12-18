/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MeinBier.controller;

import MeinBier.model.Consumidor;
import MeinBier.model.Inicializa;
import MeinBier.model.Produtor;
import java.util.ArrayList;

/**
 *
 * @author aline
 */
public class Sistema {
    private ArrayList<Produtor> produtores = new ArrayList<>();
    
    public Consumidor iniciaC(){
        return new Consumidor("Aline");
    }
    public ArrayList<Produtor> iniciaPs(){
        String nome1 = "Jessica";
        String nome2 = "Rafael";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(nome1);
        nomes.add(nome2);
        
        for(String nome : nomes){
            this.produtores.add(new Produtor(nome));
        }
        return this.produtores;
    }
    public Produtor iniciaP(){
        return this.produtores.get(0);
    }
}
