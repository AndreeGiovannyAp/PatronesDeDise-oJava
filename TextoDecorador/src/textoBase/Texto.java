/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoBase;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author Andree
 */
public abstract class Texto{
    protected String dato;
    protected JTextPane contenedor;
    
    public abstract String leer(); //retorna (lee) el valor del dato
    public abstract void escribir(String dato,JTextPane contenedor); //escribir el valor del dato
    
    public abstract void alinear(int tipo);
    public abstract void justificar();
    public abstract String encriptar(String clave);
    public abstract String desencriptar(String clave);
    public abstract JTextPane getContenedor();
   // public abstract void setContenedor();
}
