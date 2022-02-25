/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Andree
 */
public abstract class ManejoLista {

    protected FormaIn ingresar;
    protected FormaRe recuperar;
    protected FormaAcc Acceder;
    protected int numElementos;
    protected int elementos[];
    
    public abstract void manejoLista(int elementos );
    public abstract int getElementos();
    public abstract void setElementos(int elementos);
    public abstract int ingresaDatos(int elemento);
    public abstract int recuperarDatos(int elemento);
    public abstract int accederDatos(int elemento);
    public abstract void mostrarDatos();
    public abstract void sacarElemento();
    
    
    
}
