/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

/**
 *
 * @author Andree
 */
public class Articulo {

    private String nombre;
    private int cantidad;
    private int precio;
    private String descripcion;
    private String tipo;

    public Articulo(String n, int c, int p, String d, String t) {
        nombre = n;
        cantidad = c;
        precio = p;
        descripcion = d;
        tipo = t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return nombre + " - " + cantidad + " - " + precio;
    }

}
