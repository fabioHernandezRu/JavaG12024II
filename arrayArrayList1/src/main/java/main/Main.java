/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        /*
        String alumnos[] = {"Mateo", "Marcos", "Lucas", "Juan"};
        System.out.println("el tamaño del arreglo alumnos es: " + alumnos.length);
        
        showArray(alumnos);
        
        delete(alumnos,1);
        showArray(alumnos);
        addElement(alumnos, "asdfasdf", 1);
        showArray(alumnos);
         */

 /*
        ArrayList<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Mateo");
        listaAlumnos.add("Marcos");
        listaAlumnos.add("Lucas");
        listaAlumnos.add("Juan");
        
        System.out.println("listaAlumnos = " + listaAlumnos);
         */
        Scanner scanner = new Scanner(System.in);
        int nAlumnos;  //numero de alumnos
        System.out.println("Cuantos alumnos desea ingresar?");
        nAlumnos = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        for (int i = 0; i < nAlumnos; i++) { 
            System.out.println("Ingrese Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese email: ");
            String email = scanner.nextLine();
            listaAlumnos.add(new Alumno(i, nombre, email));

        }
        for (int i = 0; i < nAlumnos; i++) {
            System.out.println(listaAlumnos.get(i));
        }

    }

    private static void addElement(String[] array, String value, int index) {
        array[index] = value;
    }

    private static void delete(String[] array, int index) {
        array[index] = null;
    }

    private static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]" + "=" + array[i]);
        }
    }
}
