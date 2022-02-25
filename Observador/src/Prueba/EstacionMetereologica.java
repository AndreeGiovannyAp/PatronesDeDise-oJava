/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Sujeto.DatosClima;
import observador.DisplayPronostico;
import observador.MostrarCondicionActual;

/**
 *
 * @author Andree
 */

public class EstacionMetereologica {
    public static  void main(String [] args){
        DatosClima datosClima = new DatosClima();
        MostrarCondicionActual muestraActual = new MostrarCondicionActual();
        DisplayPronostico muestraPronostico = new DisplayPronostico(datosClima);
        datosClima.registrarObservador(muestraActual);
        datosClima.registrarObservador(muestraActual);
        datosClima.registrarObservador(muestraPronostico);
        //datosClima.asignarMediciones((float)Math.random()*30+25,(float)Math.random()*65+98, (float)Math.random()*2+4);
        //datosClima.asignarMediciones((float)Math.random()*30+25,(float)Math.random()*65+98, (float)Math.random()*2+4);
        //datosClima.asignarMediciones((float)Math.random()*30+25,(float)Math.random()*65+98, (float)Math.random()*2+4);
        datosClima.asignarMedicionePres((float)Math.random()*2+4);
        datosClima.asignarMedicionesTem((float)Math.random()*30+25);
        datosClima.asignarMedicionesTem((float)Math.random()*30+25);
        datosClima.asignarMedicionesHumedad((float)Math.random()*65+98);
        
    }
}
