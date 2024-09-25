/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.estaticosagregacioncomposicion;

import java.lang.Math;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        // Miembros estaticos
        //System.out.println("PI: "+ Math.PI);
        //System.out.println("valor absoluto de -5.2 es:"+ Math.abs(5.2f));

        // Relacion de agregacion
        Jaula j1 = new Jaula(10, 20, "Acero");
        Animal a1 = new Animal("Pepe", 0, 20);
        Animal a2 = new Animal("Pepa", 1, 40);

        System.out.println("j1 " + j1);

        j1.agregarAnimal(a1);
        j1.agregarAnimal(a2);
        System.out.println("j1 " + j1);

        Nevera n1 = new Nevera("MABE");
        Alimento alimento1 = new Alimento("Pera", 10);
        Alimento alimento2 = new Alimento("Manzana", 10);

        n1.agregarAlimento(alimento1);
        n1.agregarAlimento(alimento2);
        System.out.println("nevera: " + n1);

        //Relacion de composición
        Terreno zoologico = new Terreno(50, 50);
        System.out.println("zoologico " + zoologico);

        zoologico.jaulas.get(0).agregarAnimal(new Animal("pepa2", 0, 10));
        zoologico.jaulas.get(1).agregarAnimal(new Animal("pepe2", 0, 20));
        System.out.println("zoologico " + zoologico);

    }

}
