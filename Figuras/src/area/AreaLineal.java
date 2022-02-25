/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author Andree
 */
public class AreaLineal implements Area{

    @Override
    public double area(int dimensiones[]) {
        return dimensiones[0]*dimensiones[1];
    }
    
}
