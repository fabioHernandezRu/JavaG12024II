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
    //atributos
    String nombre;
    int edad;   
    
    Persona(){
       this.nombre = "";
       this.edad = 0;
    }
    
    Persona(String nombre, int edad){
       this.nombre = nombre;
       this.edad=edad;       
    }
    
    Persona(String nombre){
       this.nombre = nombre;       
    }
    
    public void presentarse(){
        System.out.println("hola, me llamo "+nombre+" tengo "+ edad + " anios");
    }
    
    public void saludar(){
        System.out.println("hola, como estas?");
    }
}
