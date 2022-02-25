/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package observador;

import Sujeto.Sujeto;

/**
 *
 * @author Andree
 */
public class MostrarCondicionActual implements Observador, DisplayValores{
private float temperatura;
private float humedad;
private boolean hum=false,tem=false;

    @Override
    public void display() {
        if(hum)
            System.out.println("Condiciones actuales: "+ humedad+"%humedad");
        if(tem)
            System.out.println("Condiciones actuales: "+ temperatura  +"°C ");
        hum=false;
        tem=false;
    }

    @Override
    public void setTemperatura(float temperatura) {
        this.temperatura= temperatura;
        tem=true;
        display();
    }
    
    @Override
    public void setHumedad(float humedad) {
        this.humedad=humedad;
        hum=true;
        display();
    }

    @Override
    public void setPresion(float presion) {
        
    }

    
    
}
