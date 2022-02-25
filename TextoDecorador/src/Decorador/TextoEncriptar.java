/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorador;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import textoBase.Texto;

/**
 *
 * @author Andree
 */
public class TextoEncriptar extends FuncionesAdicionales{
public boolean encripta=false;
    public TextoEncriptar(Texto t) {
        super(t);
    }
       @Override
    public String leer() {
        return null;
    }
    @Override
    public void escribir(String dato,JTextPane contenedor) {
        if(!encripta)
            t.escribir(encriptar(dato), contenedor);
        else
            t.escribir(desencriptar(dato), contenedor);
    }
    @Override
    public void alinear(int tipo) {
    }
    @Override
    public void justificar() {
    }
    @Override
    public String encriptar(String clave) {
        encripta = true;
        try {
            System.out.println("sirvee "+encripta);
            return Base64.getEncoder().encodeToString(clave.getBytes("utf-8"));
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Nooo  sirvee "+encripta);
            Logger.getLogger(TextoEncriptar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public String desencriptar(String clave) {
        encripta=false;
        byte[] decode = Base64.getDecoder().decode(clave.getBytes());
        try {
            return new String(decode, "utf-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TextoEncriptar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    @Override
    public JTextPane getContenedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
