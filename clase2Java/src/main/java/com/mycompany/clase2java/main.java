/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2java;

import java.util.*;

/**
 *
 * @author User
 */
public class main {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) { // main + tabulacion

        int numero1;

        numero1 = 10;
        int numero2;

        numero2 = input.nextInt();
        if (numero1 > 8) {
            System.out.println("numero1 es mayor a 8");
            if (numero2 > 10) {
                System.out.println("numero 2 es mayor a 10");
            }
            int contador;

            contador = 1;
            while (contador < 5) {
                System.out.println(contador);
                contador = contador + 1;
            }
        } else {
            System.out.println("el numero1 no es mayor a 8");
        }
        System.out.println(numero1);
        System.out.println("fin del programa");
    }
}

 