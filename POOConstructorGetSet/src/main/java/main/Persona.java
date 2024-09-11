/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author User
 */
public class Persona {

    final private String nombre;
    private int edad;
    
    public Persona() {
        nombre = "";
    }

    /**
     * constructor de Persona
     * @param nombre valor para el atributo nombre
     * 
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param edad
     */
    public Persona(int edad) {
        this.edad = edad;
        nombre = "";
    }
    
    /**
     *
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    public void setEdad(int edad) {
        if ((edad > 0 || edad < 200)  && (edad > this.edad)){
            this.edad = edad;
        }
    }

    /**
     *
     * @return get nombre
     */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

 
    void presentarse() {
        System.out.println("me llamo: " + nombre + " tengo de edad: " + edad);
    }

    void presentarse(String otro) {
        presentarse();
        System.out.println(otro);
    }

}
