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
public class Simplificar extends Decorador {
    
    public Simplificar(Polinomio p) {
        super(p);
        setPol(p.getPol());
    }

    @Override
    public void introducirLosDatos(int coeficiente, int exponente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrarPolinomio() {
       return  simplificarlo();
    }

    @Override
    public long evaluarPolinomio(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String simplificarlo() {
     boolean bandera=false;  
    ArrayList<int[]> aux= new ArrayList<int[]>();
    ArrayList<int[]> aux2=p.getPol();
        for (int i = 0; i <aux2.size(); i++) {
            for(int j = 0;j < aux.size(); j++) {
                 if(aux2.get(i)[1]==aux.get(j)[1]){
                    //System.out.println("entra");
                    aux.get(j)[0]=aux2.get(i)[0]+aux.get(j)[0];
                    bandera=true;
                 }
            }
            if(!bandera)
                aux.add(new int[]{aux2.get(i)[0],aux2.get(i)[1]});
            bandera=false;
        }
        p.setPol(aux);
        setPol(aux);
        return p.mostrarPolinomio();
        
    }

    @Override
    public String derivarlo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
