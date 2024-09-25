/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

/**
 *
 * @author User
 */
public class Alimento {
    String nombre;
    int cantidad;

    public Alimento(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
}
