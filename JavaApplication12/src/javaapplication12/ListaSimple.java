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
public class ListaSimple  extends ManejoLista{

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
        System.out.println("se agrego elemento a la fila ");
        return elemento;
    }
    
    @Override
    public int recuperarDatos(int elemento) {
        System.out.println("se recupero el elemento de la pos "+ elemento);
return elemento;
    }

    @Override
    public int accederDatos(int elemento) {
        System.out.println("se accecido al dato de la lista");
        return elemento ;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("se recorrio la lista ");
    }

    @Override
    public void sacarElemento() {
        System.out.println("se saco el elemento ");
    }
    
}
