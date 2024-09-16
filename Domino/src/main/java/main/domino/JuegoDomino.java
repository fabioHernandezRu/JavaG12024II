/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JuegoDomino {

    private List<Ficha> fichasDisponibles;
    private List<Jugador> jugadores;
    private Mesa mesa;

    public JuegoDomino() {
        fichasDisponibles = new ArrayList<>();
        jugadores = new ArrayList<>();
        mesa = new Mesa();
        inicializarFichas();
    }

    private void inicializarFichas() {
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                fichasDisponibles.add(new Ficha(i, j));
            }
        }
        Collections.shuffle(fichasDisponibles);
    }

    private void repartirFichas() {
        int numJugadores = jugadores.size();
        int fichasPorJugador = 7; // En dominó clásico

        for (int i = 0; i < fichasPorJugador; i++) {
            for (Jugador jugador : jugadores) {
                if (!fichasDisponibles.isEmpty()) {
                    jugador.agregarFicha(fichasDisponibles.remove(0));
                }
            }
        }
    }

    public void agregarJugador(String nombre) {
        jugadores.add(new Jugador(nombre));
    }

    public void iniciarJuego() {
        repartirFichas();
        boolean juegoTerminado = false;
        int turno = 0;

        while (!juegoTerminado) {
            Jugador jugadorActual = jugadores.get(turno % jugadores.size());
            System.out.println("\nTurno de " + jugadorActual.getNombre());

            jugadorActual.mostrarMano();
            mesa.mostrarMesa();

            int extremoIzquierdo = mesa.getExtremoIzquierdo();
            int extremoDerecho = mesa.getExtremoDerecho();

            Ficha fichaAJugar = jugadorActual.jugarFicha(extremoIzquierdo, extremoDerecho);

            if (fichaAJugar != null) {
                mesa.colocarFicha(fichaAJugar);
                System.out.println(jugadorActual.getNombre() + " jugó " + fichaAJugar);
            } else {
                System.out.println(jugadorActual.getNombre() + " no puede jugar y pasa el turno.");
            }

            if (!jugadorActual.tieneFichas()) {
                System.out.println("\n¡" + jugadorActual.getNombre() + " ha ganado el juego!");
                juegoTerminado = true;
            }

            turno++;
            // Aquí se pueden agregar condiciones para detectar bloqueo del juego
            if (turno > 100) { // Evitar bucles infinitos en caso de bloqueo
                System.out.println("El juego se ha bloqueado. No hay movimientos posibles.");
                juegoTerminado = true;
            }
        }
    }
}
