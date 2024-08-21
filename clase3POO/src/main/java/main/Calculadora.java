/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calculadora {

    //atributos
    float numero1;
    float numero2;
    float suma;
    float resta;
    Scanner scanner = new Scanner(System.in);

    //metodos
    void pedirNumeros() {
        System.out.println("ingrese numero1: ");
        numero1 = scanner.nextFloat();
        System.out.println("ingrese numero2:");
        numero2 = scanner.nextFloat();
    }

    void sumar() {
        suma = numero1 + numero2;
    }

    void restar() {
        resta = numero1 - numero2;
    }

    void realizarOperaciones() {
        sumar();
        restar();
    }

    void mostrarResultados() {
        System.out.println("suma = " + suma + " resta = " + resta);
    }

}
