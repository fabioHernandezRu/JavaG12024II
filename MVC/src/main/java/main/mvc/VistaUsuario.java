/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.mvc;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class VistaUsuario {
    
    private Scanner scanner;
    
    VistaUsuario(Scanner scanner){
        this.scanner =  scanner;
    }
    
    public void mostrarDetallesUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }

    public String solicitarNuevoNombre() {
        
        
        System.out.print("Ingrese nuevo nombre: ");
        return this.scanner.nextLine();
    }

    public String solicitarNuevoEmail() { 
        System.out.print("Ingrese nuevo email: ");
        return this.scanner.nextLine();
    }
}
