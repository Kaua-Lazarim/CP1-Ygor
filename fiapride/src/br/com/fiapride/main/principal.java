package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class principal {
    public static void main(String[] args) {
        veiculos v1 = new veiculos();
        
        v1.setIndividuo("Ygor Anjos");
        v1.setPlaca("JAV-2469");
        
        //Controle de Gasolina
        v1.adicionar(50);
        v1.gasta(10); 

        System.out.println("Dono: " + v1.getIndividuo() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getGas());
    }
}