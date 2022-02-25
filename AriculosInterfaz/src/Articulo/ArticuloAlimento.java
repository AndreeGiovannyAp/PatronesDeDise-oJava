/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;
import Tipo.TipoArticuloAlimento;
/**
 *
 * @author GadgetL
 */
public class ArticuloAlimento extends Articulo{
    private  String tipoAr="Alimento";
    public ArticuloAlimento(String nombre, String tipo,String tipodeltipo,double precio, int cantidad, int cantidadBodega) {
        super(nombre,tipo,precio,cantidad, cantidadBodega);
         gettipoArticulo(tipodeltipo);
    }

    @Override
    public void gettipoArticulo(String tipoNuevo) {
        Tipo.TipoArticulo ta= new TipoArticuloAlimento(tipoNuevo);
        tipo2=ta.tipoArt();
    }
    
}
