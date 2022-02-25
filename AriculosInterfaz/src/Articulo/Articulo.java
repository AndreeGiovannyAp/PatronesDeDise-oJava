/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;

import Precio.Precio;
import Precio.PrecioMayorista;
import Precio.PrecioNormal;
import Tipo.TipoArticulo;

/**
 *
 * @author GadgetL
 */
public abstract class Articulo {
    protected String nombreArticulo;
    protected double precio;
    
    protected String tipo;
    protected int existencia;
    protected int cantidadBodega;
    protected double importe;
    protected String tipo2;
     public Articulo(String nombre,String tipo,double precio,int existencia, int cantidadBodega){
        this.nombreArticulo = nombre;
        this.precio=precio;
        this.existencia = existencia;
        this.cantidadBodega=cantidadBodega;
        this.tipo=tipo;
        
        
    }

    public String getTipo2() {
        return tipo2;
    }



    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
     public  abstract void gettipoArticulo(String tipoNuevo);
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public double Precio(String tipo) {
         Precio p;
        if(tipo.equals("Mayorista"))
            p= new PrecioMayorista(precio);
        else 
           p= new PrecioNormal(precio);
        
        return p.calculaPrecio();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
