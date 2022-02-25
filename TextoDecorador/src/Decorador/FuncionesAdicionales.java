/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import textoBase.Texto;

/**
 *
 * @author Andree
 */
public abstract class FuncionesAdicionales extends Texto{
    protected Texto t; 

    public FuncionesAdicionales(Texto t) {
        this.t=t;
    }
   @Override
    public String leer() {
        return t.leer();
    }
    @Override
    public void escribir(String dato,JTextPane contenedor) {
        t.escribir(dato,contenedor);
    }
    @Override
    public void alinear(int tipo) {
        //t.alinear(tipo);
    }
    @Override
    public void justificar() {
    }
    @Override
    public String encriptar(String clave) {
        return null;
    }
    @Override
    public String desencriptar(String clave) {
        return null;
    }
    @Override
    public  JTextPane getContenedor(){
    return null;
    }
}
