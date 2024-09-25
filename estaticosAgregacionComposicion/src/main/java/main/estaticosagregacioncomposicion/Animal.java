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
public class Animal { 
    String nombre;
    int id;
    int edad;
    
    /**
     * Constructor de animal
     * @param nombre nombre de animal
     * @param id id de animal
     * @param edad  edad de animal
     */
    public Animal(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + '}';
    }
    
    
}
