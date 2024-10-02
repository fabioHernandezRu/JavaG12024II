/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.herencia;

import Animal.*; // importa todas las clases del paquete animal
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        /*
        Animal animal1 = new Animal("pepe",1);
        animal1.respirar();
        
        Pez animal2 = new Pez(true,"nemo",2);
        animal2.respirar();
        animal2.nadar();
        System.out.println(animal2);
        
        Mojarra animal3 = new Mojarra(true, 3);
        System.out.println(animal3);
        
        Gato animal4 = new Gato(4, "misifu", 4);
        System.out.println(animal4); 
        animal4.comer();*/

        Animal animal1 = new Animal("pepe", 1);

        Animal animal2 = new Pez(true, "nemo", 2);

        Animal animal3 = new Mojarra(true, 3);

        Animal animal4 = new Gato(4, "misifu", 4);

        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(animal1);
        animales.add(animal2);
        animales.add(animal3);
        animales.add(animal4);
        
        for(int i=0; i<animales.size(); i++){
            animales.get(i).comer(); // polimorfismo
        }
    }
}
