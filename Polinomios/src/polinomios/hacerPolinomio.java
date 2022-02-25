/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomios;

/**
 *
 * @author Andree
 */
public class hacerPolinomio extends Polinomio{
    
    @Override
    public void introducirLosDatos(int coeficiente, int exponente) {
        pol.add(new int[]{coeficiente,exponente});
    }

    @Override
    public String mostrarPolinomio() {
        String cadenaPol="";
        String aux="";
        for (int i = 0; i < pol.size(); i++) {
            int tupla[]= pol.get(i);
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
        return cadenaPol;
    }

    @Override
    public long evaluarPolinomio(int valor) {
         long val=0;
        for (int i = 0; i < pol.size(); i++) {
            if(pol.get(i)[1]!=0)
                val+=Math.pow(valor,pol.get(i)[1]) * pol.get(i)[0];
            else
                val+=pol.get(i)[0];
        }
        return val;
    }

    @Override
    public String simplificarlo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String derivarlo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}