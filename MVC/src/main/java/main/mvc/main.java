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
public class main {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Crear el Modelo
        Usuario usuario = new Usuario("Alvaro", "alvaro@example.com");

        // Crear la Vista
        //VistaUsuario vista = new VistaUsuario(scanner);
        
        vistaGUI vistaGui = new vistaGUI();
 
        // Crear el Controlador
        Controlador controlador = new Controlador(usuario, vistaGui);

        // Mostrar datos iniciales
        controlador.actualizarVista();
    }
}
