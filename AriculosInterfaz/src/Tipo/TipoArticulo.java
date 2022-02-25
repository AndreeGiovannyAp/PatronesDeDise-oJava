/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipo;

/**
 *
 * @author GadgetL
 */
public abstract class TipoArticulo {
     protected String Tipo;
    
    public TipoArticulo(String Tipo){
        this.Tipo = Tipo;
    }
    public abstract String tipoArt();
}
