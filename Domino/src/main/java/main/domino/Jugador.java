/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.domino;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private List<Ficha> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarFicha(Ficha ficha) {
        mano.add(ficha);
    }

    public Ficha jugarFicha(int extremoIzquierdo, int extremoDerecho) {
        for (Ficha ficha : mano) {
            if (ficha.getValorIzquierdo() == extremoIzquierdo || ficha.getValorDerecho() == extremoIzquierdo ||
                ficha.getValorIzquierdo() == extremoDerecho || ficha.getValorDerecho() == extremoDerecho) {
                mano.remove(ficha);
                return ficha;
            }
        }
        return null; // No tiene fichas para jugar
    }

    public boolean tieneFichas() {
        return !mano.isEmpty();
    }

    public void mostrarMano() {
        System.out.println("Fichas de " + nombre + ":");
        for (Ficha ficha : mano) {
            System.out.print(ficha + " ");
        }
        System.out.println();
    }
}
