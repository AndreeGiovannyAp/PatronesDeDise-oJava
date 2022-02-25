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
public class TipoArticuloElectro extends TipoArticulo{

    public TipoArticuloElectro(String Tipo) {
        super(Tipo);
    }
   

    @Override
    public String tipoArt() {
        return Tipo;
    }
}
