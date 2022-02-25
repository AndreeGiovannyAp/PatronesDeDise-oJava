/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoabstracto;

import javax.swing.JTextPane;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
//import textoBase.Texto;

/**
 *
 * @author Andree
 */
public class TextoJustificar extends Texto{


    @Override
    public String leer() {
        return null;
    }
    @Override
    public void escribir(String dato,JTextPane contenedor) {
        this.dato=dato;
        this.contenedor=contenedor;
        justificar();
    }
    @Override
    public void alinear(int tipo) {
    }
    @Override
    public void justificar() {
       StyledDocument doc =contenedor.getStyledDocument(); 
       SimpleAttributeSet center = new SimpleAttributeSet(); 
       StyleConstants.setAlignment(center, StyleConstants.ALIGN_JUSTIFIED); 
       doc.setParagraphAttributes(0, doc.getLength(), center, false); 
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
