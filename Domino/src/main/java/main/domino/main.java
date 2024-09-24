/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.domino;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    public static void main(String[] args) {
        JuegoDomino juego = new JuegoDomino();
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombreJugador1 = scanner.nextLine();
        juego.agregarJugador(nombreJugador1);

        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombreJugador2 = scanner.nextLine();
        juego.agregarJugador(nombreJugador2);

        juego.iniciarJuego();
       
    }
}
