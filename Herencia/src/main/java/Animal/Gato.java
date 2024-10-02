/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author User
 */
public class Gato extends Animal{
    
    protected int numeroBigotes;

    public Gato(int numeroBigotes, String nombre, int id) {
        super(nombre, id);
        this.numeroBigotes = numeroBigotes;
    }

    @Override
    public void comer(){
        System.out.println("el gato "+ nombre + " está comiendo");
    }
    
    public void Maullar(){
        System.out.println("el gato "+ nombre + " está maullando");
    }
    
    
}
