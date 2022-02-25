/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import figuras.Figuras;
import java.awt.Graphics;

/**
 *
 * @author Andree
 */
public class Figura extends javax.swing.JFrame {
boolean escalar=false;
int escala;
    /**
     * Creates new form Figura
     */
    Figuras f;

    public void setF(Figuras f) {
        this.f = f;
    }
    public Figura() {
        initComponents();
        this.setSize(700,500);
    }
    public void paint(Graphics g) {  
        f.Edibujar(g);
        //if(escalar)
            //f.Escalar(g,escala);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figura");
        setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
