/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

import polinomios.Polinomio;

/**
 *
 * @author Andree
 */
public abstract class Decorador extends  Polinomio{
    Polinomio p;

    public Decorador(Polinomio p) {
        this.p = p;
       // System.out.println(p.getPol().size());
    }
      
 
}
