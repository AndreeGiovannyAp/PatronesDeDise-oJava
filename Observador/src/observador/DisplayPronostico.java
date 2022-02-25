/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file,029.92f choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import Sujeto.DatosClima;

/**
 *
 * @author Andree
 */
public class DisplayPronostico implements Observador, DisplayValores{
    private float presionActual = 29.92f;
    private float presionAnterior;
    private DatosClima datosClima;
    public DisplayPronostico(DatosClima datosClima){
        this.datosClima=datosClima;
        //datosClima.registrarObservador(this);
    }
    @Override
    public void display() {
        System.out.println("Pronostico: ");
        if(presionActual > presionAnterior){
            System.out.println(presionAnterior+"PACT"+ presionActual+" Mejoramiento de las condiciones");
        }else if(presionActual==presionAnterior){
            System.out.println(presionAnterior+"PACT"+ presionActual+" No cambiaron las condiciones ");
        }else if(presionActual< presionAnterior){
            System.out.println(presionAnterior+"PACT"+ presionActual+" Clima lluvioso (lleve paraguas)");
        }
    }

    @Override
    public void setTemperatura(float temp) {
    }
    @Override
    public void setHumedad(float humedad) {
    }
     @Override
    public void setPresion(float presion) {
         presionAnterior=presionActual;
         presionActual = presion;
         display();
    }
    
}
