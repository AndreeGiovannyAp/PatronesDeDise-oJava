/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import Dibujar.DibujaCirculo;
import Perimetro.Perimetro;
import Perimetro.PerimetroCirculo;
import area.AreaCircular;

/**
 *
 * @author Andree
 */
public class Circulo extends Figuras{
    public Circulo(int radio) {
        super(new int[]{radio,radio}, new DibujaCirculo());
        this.perimetro = new PerimetroCirculo();
        area= new AreaCircular();
    }
}
