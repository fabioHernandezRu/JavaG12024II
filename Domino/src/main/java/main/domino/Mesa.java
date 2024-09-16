/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.domino;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private List<Ficha> fichasEnMesa;

    public Mesa() {
        fichasEnMesa = new ArrayList<>();
    }

    public void colocarFicha(Ficha ficha) {
        if (fichasEnMesa.isEmpty()) {
            fichasEnMesa.add(ficha);
        } else {
            Ficha primeraFicha = fichasEnMesa.get(0);
            Ficha ultimaFicha = fichasEnMesa.get(fichasEnMesa.size() - 1);

            if (ficha.getValorIzquierdo() == ultimaFicha.getValorDerecho()) {
                fichasEnMesa.add(ficha);
            } else if (ficha.getValorDerecho() == primeraFicha.getValorIzquierdo()) {
                fichasEnMesa.add(0, ficha);
            } else {
                // Intentar voltear la ficha
                ficha.voltear();
                if (ficha.getValorIzquierdo() == ultimaFicha.getValorDerecho()) {
                    fichasEnMesa.add(ficha);
                } else if (ficha.getValorDerecho() == primeraFicha.getValorIzquierdo()) {
                    fichasEnMesa.add(0, ficha);
                } else {
                    System.out.println("La ficha " + ficha + " no encaja en ningún extremo.");
                }
            }
        }
    }

    public int getExtremoIzquierdo() {
        if (!fichasEnMesa.isEmpty()) {
            return fichasEnMesa.get(0).getValorIzquierdo();
        }
        return -1;
    }

    public int getExtremoDerecho() {
        if (!fichasEnMesa.isEmpty()) {
            return fichasEnMesa.get(fichasEnMesa.size() - 1).getValorDerecho();
        }
        return -1;
    }

    public void mostrarMesa() {
        System.out.println("Fichas en la mesa:");
        for (Ficha ficha : fichasEnMesa) {
            System.out.print(ficha + " ");
        }
        System.out.println();
    }
}