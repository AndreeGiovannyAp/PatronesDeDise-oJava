/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomios;

import java.util.ArrayList;

/**
 *
 * @author Andree
 */
public abstract class Polinomio {
    protected ArrayList<int[]> pol= new ArrayList<int[]>();

    public ArrayList<int[]> getPol() {
        return pol;
    }

    public void setPol(ArrayList<int[]> pol) {
        this.pol = pol;
    }
    public abstract void introducirLosDatos(int coeficiente, int exponente);
    public abstract String mostrarPolinomio();
    public abstract long evaluarPolinomio(int valor);
    public abstract String simplificarlo();
    public abstract String derivarlo();
    //public abstract void asignar(ArrayList<int[]> list);
    
    
    
}
