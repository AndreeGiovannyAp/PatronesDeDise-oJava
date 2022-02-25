/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import Dibujar.DibujaLineal;
import Perimetro.PerimetroLineal;
import area.AreaLineal;

/**
 *
 * @author Andree
 */
public class Cuadrado extends Figuras {

    public Cuadrado(int lado) {
        super(new int[]{lado,lado,lado,lado},new DibujaLineal());
        perimetro = new PerimetroLineal();
        area= new AreaLineal();
    }
}
