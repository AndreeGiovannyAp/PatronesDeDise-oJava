/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import Dibujar.DibujaCirculo;
import Dibujar.DibujaLineal;
import Perimetro.Perimetro;
import Perimetro.PerimetroLineal;
import area.AreaLineal;

/**
 *
 * @author Andree
 */
public class Rectangulo extends Figuras{
    public Rectangulo(int lado1,int lado2) {
        super(new int[]{lado1,lado2,lado1,lado2}, new DibujaLineal());
        perimetro = new PerimetroLineal();
        //dibujar= new DibujaLineal();
        area = new AreaLineal();
    }
}
