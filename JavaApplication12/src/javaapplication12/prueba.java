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
public class prueba {
    public static void main(String args[]){
        Pila p= new Pila();
        ListaSimple ls =new ListaSimple();
        Cola c= new Cola();
        p.ingresaDatos(2);
        ls.ingresaDatos(3);
        c.ingresaDatos(4);
        p.sacarElemento();
        ls.sacarElemento();
        c.sacarElemento();
    }
}
