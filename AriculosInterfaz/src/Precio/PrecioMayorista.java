/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Precio;

/**
 *
 * @author GadgetL
 */
public class PrecioMayorista extends Precio{

    public PrecioMayorista(double precio) {
        super(precio);
    }

    @Override
    public double calculaPrecio() {
        return precio+(precio*0.10);
    }
    
}
