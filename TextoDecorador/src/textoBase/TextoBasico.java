/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoBase;


import javax.swing.JTextPane;

/**
 *
 * @author Andree
 */
public class TextoBasico extends Texto{

    @Override
    public String leer() {
        return dato;
    }

    @Override
    public void escribir(String dato,JTextPane contenedor) {
        this.dato=dato;
        this.contenedor=contenedor;
        this.contenedor.setText(dato);
    }

    @Override
    public void alinear(int tipo) {
    
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
    
    public JTextPane getContenedor(){
        return contenedor;
    }

    
    
}
