/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perimetro;

/**
 *
 * @author Andree
 */
public class PerimetroLineal implements Perimetro{

    @Override
    public double calcularPerimetro(int dimensiones[]) {
        double perimetro=0;
        for (int i = 0; i < dimensiones.length; i++) 
                perimetro+=dimensiones[i];
        return perimetro;
    }
    
}
