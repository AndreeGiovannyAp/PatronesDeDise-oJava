/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import Dibujar.Dibujar;
import Perimetro.Perimetro;
import area.Area;
import java.awt.Graphics;

/**
 *
 * @author Andree
 */
public abstract class Figuras {
    protected int dimensiones[];
    protected Dibujar dibujar;
    protected Perimetro perimetro;
    protected Area area;
    /**
     * @param args the command line arguments
     */
    public Figuras(int[] dimensiones, Dibujar d){
        this.dimensiones=dimensiones;
        this.dibujar = d;
    }
   
    public  void  Edibujar(Graphics g){
        dibujar.paint(dimensiones, g);
    }
    public  double ePerimetro(){
        return perimetro.calcularPerimetro(dimensiones);
    }

    public Dibujar getDibujar() {
        return dibujar;
    }

    public void setDibujar(Dibujar dibujar) {
        this.dibujar = dibujar;
    }
    /*public void Escalar(Graphics g,int escalado){
        dibujar.escalar(dimensiones, g,escala);
    }**/
    
    public  double area(){
        return area.area(dimensiones);
    }
   
}
