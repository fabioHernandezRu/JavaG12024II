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
public class Pez extends Animal {

    boolean tieneEscamas;

    public Pez(boolean tieneEscamas, String nombre, int id) {
        super(nombre, id);
        this.tieneEscamas = tieneEscamas;
    }

    public void nadar() {
        System.out.println("el pez " + nombre + " está nadando");
    }
    
    @Override
    public void comer(){
        System.out.println("el pez "+ nombre + " está comiendo");
    }
    
    @Override
    public String toString() {
        return "[" + super.toString() + "Pez{" + "tieneEscamas=" + tieneEscamas + '}' + "]";
    }

}
