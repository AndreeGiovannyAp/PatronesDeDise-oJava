/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import textoBase.Texto;

/**
 *
 * @author Andree
 */
public class TextoAlinear extends FuncionesAdicionales{
private static int indice=1;
    public TextoAlinear(Texto t) {
        super(t);
    }

    
    @Override
    public String leer() {
        return null;
    }
    @Override
    public void escribir(String dato,JTextPane contenedor) {
        t.escribir(dato,contenedor);
        alinear(indice);
    }
    @Override
    public void alinear(int tipo) {
        System.out.println("este es el tipo "+tipo);
        StyledDocument doc = t.getContenedor().getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        if(tipo==1)
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        if(tipo==2)
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_RIGHT);
        if(tipo==3)
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_LEFT);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        indice++;
        if(indice>3)
            indice=1;
                
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
    public JTextPane getContenedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
