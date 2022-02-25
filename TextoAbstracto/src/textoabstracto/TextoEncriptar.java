/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoabstracto;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JTextPane;
//import textoBase.Texto;

/**
 *
 * @author Andree
 */
public class TextoEncriptar extends Texto {

    public boolean encripta = false;

    @Override
    public String leer() {
        return null;
    }

    @Override
    public void escribir(String dato, JTextPane contenedor) {
        this.dato=dato;
        this.contenedor=contenedor;
       if (!encripta) {
           System.out.println(encripta);
            contenedor.setText(encriptar(dato));
        } else {
           System.out.println("pasaa aqui");
            contenedor.setText(desencriptar(dato));
        }
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
