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
public class DibujaLineal extends JPanel implements Dibujar {

    @Override
    public void paint(int dimensiones[], Graphics g) {
        g.setColor(new Color(34,85,114));  
        g.fillRect(100, 100, dimensiones[0],dimensiones[1]);  
    }
}
