/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.domino;

/**
 *
 * @author Fabio Hernandez
 */
public class Ficha {

    private int valorIzquierdo;
    private int valorDerecho;

    public Ficha(int valorIzquierdo, int valorDerecho) {
        this.valorIzquierdo = valorIzquierdo;
        this.valorDerecho = valorDerecho;
    }

    public int getValorIzquierdo() {
        return valorIzquierdo;
    }

    public int getValorDerecho() {
        return valorDerecho;
    }

    public void voltear() {
        // Agregar codigo para girar la ficha

    }

    @Override
    public String toString() {
        return "[" + valorIzquierdo + "|" + valorDerecho + "]";
    }
}
