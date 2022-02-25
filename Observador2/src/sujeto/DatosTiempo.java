/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sujeto;

import java.util.ArrayList;
import observador.Observador;

/**
 *
 * @author Andree
 */
public class DatosTiempo implements Sujeto {

    private ArrayList observadores;

    @Override
    public void removerObservador(Observador o) {
        int i = observadores.indexOf(o);
        if (i >= 0) {
            observadores.remove(i);
        }
    }

    @Override
    public void notificarObservador() {
        for (int i = 0; i < observadores.size(); i++) {
            Observador observador = (Observador) observadores.get(i);
            //if(hume)
            //observador.setHumedad(humedad);
            //if(temp)
            //observador.setTemperatura(temperatura);
            //if(pres)
            //observador.setPresion(presion);
        }
        //hume=false;
        //pres=false;
        //temp=false;
    }

    @Override
    public void registrarObservador(Observador o) {
        if (verifica(o)) {
            observadores.add(o);
        } else {
            System.out.println("Ya existe");
        }

    }

    public boolean verifica(Observador o) {
        // boolean verifica=true;
        for (int i = 0; i < observadores.size(); i++) {
            if (observadores.get(i).equals(o)) {
                return false;//verifica=false;
            }
        }
        return true;
    }
}
