/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.mvc;

/**
 *
 * @author User
 */
public class Controlador {

    private Usuario modelo;
    private VistaUsuario vista;

    public Controlador(Usuario modelo, VistaUsuario vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarDetallesUsuario(modelo);
    }

    public void actualizarUsuario() {
        String nuevoNombre = vista.solicitarNuevoNombre();
        String nuevoEmail = vista.solicitarNuevoEmail();
        modelo.setNombre(nuevoNombre);
        modelo.setEmail(nuevoEmail);
    }
}
