/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;

import Precio.Precio;
import Precio.PrecioMayorista;
import Precio.PrecioNormal;
import Tipo.TipoArticuloAbarrote;

/**
 *
 * @author GadgetL
 */
public class ArticuloAbarrote extends Articulo{
    private  String tipoAr="Abarrote";
    public ArticuloAbarrote(String nombre,String tipo, String tipodeltipo, double precio, int existencia, int cantidadBodega) {
        super(nombre,tipo,precio,existencia, cantidadBodega);
        gettipoArticulo(tipodeltipo);
    }

    @Override
    public void gettipoArticulo(String tipoNuevo) {
        Tipo.TipoArticulo ta= new TipoArticuloAbarrote(tipoNuevo);
        tipo2=ta.tipoArt();
    }

    
    
    
}
