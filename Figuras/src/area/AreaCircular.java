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
public class AreaCircular implements Area{

    @Override
    public double area(int[] dimensiones) {
        if(dimensiones[0]==dimensiones[1])
            return Math.PI*Math.pow(dimensiones[0],2);
        else 
            return dimensiones[0]*dimensiones[1]*Math.PI;
        //return throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
