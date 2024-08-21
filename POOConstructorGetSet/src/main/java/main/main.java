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
public class main {
    
    public static void main(String[] args) {
        System.out.println("se creará el objeto jose");
        Persona jose = new Persona();
        
        jose.presentarse();
        System.out.println("objeto creado");
        
        System.out.println("se creará el objeto marcos");
        Persona marcos = new Persona("Marcos");
        marcos.presentarse();
        System.out.println("objeto creado");
        
        System.out.println("se creará el objeto lucas");
        Persona lucas = new Persona(20);
        lucas.presentarse();
        System.out.println("objeto creado");
        
        System.out.println("se creará el objeto juan");
        Persona juan = new Persona("Juan",30);
        juan.presentarse("adios!");
        System.out.println("objeto creado");
        
        // como acceder o modificar atributos privados si se quiere?
        // los metodos getters y setter (accesores y mutadores) lo permiten
        System.out.println("el nombre del objeto juan es: " + juan.getNombre() );
        
        juan.setEdad(-10); 
        juan.presentarse();
    }

}
