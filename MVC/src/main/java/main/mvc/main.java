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
        // Crear el Modelo
        Usuario usuario = new Usuario("Alvaro", "alvaro@example.com");
        Scanner scanner = new Scanner(System.in);
        // Crear la Vista
        VistaUsuario vista = new VistaUsuario(scanner);

        // Crear el Controlador
        Controlador controlador = new Controlador(usuario, vista);

        // Mostrar datos iniciales
        controlador.actualizarVista();

        // Actualizar datos del usuario
        controlador.actualizarUsuario();

        // Mostrar datos actualizados
        controlador.actualizarVista();
    }
}
