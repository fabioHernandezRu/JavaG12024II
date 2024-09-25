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
public class Terreno {
    
    int ancho;
    int largo;
    ArrayList<Jaula> jaulas;

    public Terreno(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
        jaulas = new ArrayList<Jaula>();
        jaulas.add(new Jaula(10, 20, "acero"));
        jaulas.add(new Jaula(30,10,"Madera"));        
    }

    @Override
    public String toString() {
        return "Terreno{" + "ancho=" + ancho + ", largo=" + largo + ", jaulas=" + jaulas + '}';
    }
        
    
    
}
