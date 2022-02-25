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
public class Cola extends ManejoLista {
    

    @Override
    public void manejoLista(int elementos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getElementos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setElementos(int elementos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int ingresaDatos(int elemento) {
        System.out.println("se agrego el dato"+elemento +" al principio de la cola");
        return elemento;
    }

    @Override
    public int recuperarDatos(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int accederDatos(int elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarDatos() {
        System.out.print("regresa pila");
    }

    @Override
    public void sacarElemento() {
        System.out.println("se quito el primer elemento que entro a la cola ");
    }
    
}
