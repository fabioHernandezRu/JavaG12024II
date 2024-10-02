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
public class Mojarra extends Pez{
    
    
    
    public Mojarra(boolean tieneEscamas, int id) {
        super(tieneEscamas, "Mojarra"+id, id);
    }    
    
    @Override
      public void comer(){
        System.out.println("La mojarra "+ nombre + " está comiendo");
    }
}
