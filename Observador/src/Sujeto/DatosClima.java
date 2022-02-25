/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
1.- Hacer que los valores de humedad, presion y temperaturase generen en forma aleatoria

2.- Evitar que un observador se registre dos veces 

3.- Hacer que los observadores se registren solo para cuando un tipo de dato meterologio sea registrado para eso hacer que cada dato registe en forma 
aislada (No simultanea)
*/
package Sujeto;

import Sujeto.Sujeto;
import java.util.ArrayList;
import observador.Observador;

/**
 *
 * @author Andree
 */
public class DatosClima implements Sujeto {

    private ArrayList observadores;
    private float temperatura;
    private float humedad;
    private float presion;
    private boolean pres=false,hume=false,temp=false;
    public DatosClima() {
        observadores = new ArrayList();
    }
    
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
            if(hume)
            observador.setHumedad(humedad);
            if(temp)
            observador.setTemperatura(temperatura);
            if(pres)
            observador.setPresion(presion);
        }
        hume=false;
        pres=false;
        temp=false;
    }

    public void cambioMediciones() {
        notificarObservador();
    }

    public void asignarMedicionesTem(float temperatura) {
        this.temperatura = temperatura;
        temp=true;
        cambioMediciones();
    }
    public void asignarMedicionesHumedad(float humedad){
        this.humedad = humedad;
        hume=true;
        cambioMediciones();
    
    }
    public void asignarMedicionePres(float presion){
        this.presion = presion;
        pres=true;
        cambioMediciones();
    }
    public float temperatura(){
        return temperatura;
    }
    public float  humedad(){
        return humedad;
    }
    public float  presion(){
        return presion;
    }

    @Override
    public void registrarObservador(Observador o) {
        if(verifica(o))
            observadores.add(o);
        else
            System.out.println("Ya existe");
        
    }
    public boolean verifica(Observador o){
       // boolean verifica=true;
        for (int i = 0; i < observadores.size(); i++) {
            if(observadores.get(i).equals(o))
                return false;//verifica=false;
        }
    return true;
    }

}
