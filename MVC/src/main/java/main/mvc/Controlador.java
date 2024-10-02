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
    private vistaGUI vista;

    public Controlador(Usuario modelo, vistaGUI vista) {
        this.modelo = modelo;
        this.vista = vista;
        initController();
    }

    private void initController() {
        // Puede escuchar eventos como clics en botones para actualizar el usuario
        vista.actualizar.addActionListener(e -> actualizarUsuario());
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
