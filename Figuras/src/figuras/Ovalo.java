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
public class Ovalo extends Figuras{

    public Ovalo(int radioMayor, int radioMenor) {
        super(new int[]{radioMayor,radioMenor}, new DibujaCirculo());
         perimetro = new PerimetroCirculo();
         //dibujar = new DibujaCirculo();
         area=new AreaCircular();
    }
    
}
