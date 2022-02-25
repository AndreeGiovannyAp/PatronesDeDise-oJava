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
public abstract class Precio {
    double precio;
    public  Precio (double precio){
        this.precio=precio;
    }
    
    public abstract double calculaPrecio();
}
