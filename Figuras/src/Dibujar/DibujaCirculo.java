/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dibujar;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Andree
 */
public class DibujaCirculo extends JFrame implements Dibujar{

    @Override
    public void paint(int dimensiones[], Graphics g) {
        g.setColor(new Color(52, 130, 175));
        g.fillOval(100, 100, dimensiones[0], dimensiones[1]); //Dibuja un circulo
    }
/*
    @Override
    public void escalar(int[] dimensiones, Graphics g, int s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

*/
    
}
