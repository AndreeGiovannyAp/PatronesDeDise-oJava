/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

import java.util.ArrayList;
import polinomios.Polinomio;

/**
 *
 * @author Andree
 */
public class Derivar extends Decorador{
    
    public Derivar(Polinomio p) {
        super(p);
        setPol(p.getPol());
    }

    @Override
    public void introducirLosDatos(int coeficiente, int exponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrarPolinomio() {
        return"";
    }

    @Override
    public long evaluarPolinomio(int valor) {
       return 0;
    }

    @Override
    public String simplificarlo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String derivarlo() {
        ArrayList<int[]> po=hacerDeribada();
         String cadenaPol="";
        String aux="";
        for (int i = 0; i < po.size(); i++) {
            int tupla[]= po.get(i);
            if(tupla[0]>0 && i!=0)
                aux="+"+tupla[0];
            else 
                aux=tupla[0]+"";
            
            if(tupla[1]>0)
                if(tupla[1]!=1)
                    cadenaPol+=aux+"x"+"^"+tupla[1];
                else 
                    cadenaPol+=aux+"x";
            else
                cadenaPol+=aux;
            
            aux="";
        }
        setPol(po);
        return "Derivada "+cadenaPol;
    }
    public ArrayList<int[]> hacerDeribada(){
        ArrayList<int[]>op = new ArrayList<int[]>();
        for (int i = 0; i < p.getPol().size(); i++) {
            int[] axu=p.getPol().get(i);
            if(axu[1]!=0)
            op.add(new int[]{axu[0]*axu[1],axu[1]-1});
        }
        return op;
    }
}
