/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;


import Tipo.TipoArticuloElectro;

/**
 *
 * @author GadgetL
 */
public class ArticuloElectrodomestico extends Articulo{
    private  String tipoAr="Electrodomestico";
    public ArticuloElectrodomestico(String nombre,String tipo,String tipodeltipo, double precio, int existencia, int cantidadBodega) {
        super(nombre,tipo,precio,existencia, cantidadBodega);
         gettipoArticulo(tipodeltipo);
    }

    @Override
    public void gettipoArticulo(String tipoNuevo) {
        Tipo.TipoArticulo ta= new TipoArticuloElectro(tipoNuevo);
        tipo2=ta.tipoArt();
    }
    
}
