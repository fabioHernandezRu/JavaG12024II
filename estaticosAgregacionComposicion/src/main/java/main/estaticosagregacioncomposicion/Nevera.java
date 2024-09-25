/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Nevera {
    String marca;
    ArrayList<Alimento> alimentos;

    public Nevera(String marca) {
        this.marca = marca;
        alimentos = new ArrayList<>();
    }
    
    public void agregarAlimento(Alimento alimento){
        alimentos.add(alimento);
    }

    @Override
    public String toString() {
        return "Nevera{" + "marca=" + marca + ", alimentos=" + alimentos + '}';
    }
    
    
}
