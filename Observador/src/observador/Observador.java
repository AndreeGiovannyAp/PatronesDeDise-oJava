/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Andree
 */
public interface Observador {

    /**
     * @param args the command line arguments
     */
   public void setTemperatura(float temp);
   public void setPresion(float presion);
   public void setHumedad(float humedad);
   
    
}
