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
public class PerimetroCirculo implements Perimetro{

    @Override
    public double calcularPerimetro(int dimensiones[]) {
        
        if(dimensiones[0]==dimensiones[1])
            return dimensiones[0]*Math.PI;
        else
            return (2*3.1416)*Math.sqrt((Math.pow(dimensiones[0],2)+Math.pow(dimensiones[1], 2))/2);
        
    }
    
}
