/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Articulo.Articulo;
import Tabla.ModeloEmpleado;
import Tabla.ModeloMayorista;
import Tabla.ModeloTabla;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Andree
 */
public class SeleccionEmpleado extends SeleccionTipo{

    /**
     * Creates new form SeleccionMayorista
     */
    public SeleccionEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    
    @Override
    public void ActionPerformed1(ActionEvent evt) {
        GenePe.setEnabled(true);
        ForPe.setEnabled(false);
        jComboBox1.setEnabled(false);
        ArrayList<Object[]> arti = new ArrayList<Object[]>();
        ModeloTabla mt= new ModeloEmpleado(auxil,jComboBox1.getSelectedItem().toString());
        setModel(mt);
        revalidate();
       jPanel2.setVisible(true);
    }

    @Override
    public void ActionPerformed2(ActionEvent evt) {
        for (int i = 0; i < jTable1.getRowCount(); i++) {
         if(Integer.parseInt(jTable1.getModel().getValueAt(i, 4).toString())!=0){
             prodcutos=true;
         cadena+= jTable1.getModel().getValueAt(i, 0)+" "+jTable1.getModel().getValueAt(i, 4)+ "  El total a pagar es "+jTable1.getModel().getValueAt(i, 5)+"\n";
            cantidad+=Double.parseDouble(jTable1.getModel().getValueAt(i, 5).toString());
         }
         //cadena+="El total a pagar es  "+cantidad;
        }
        if(prodcutos){
        jTextArea1.setText(cadena);
        finaliza.setEnabled(true);
         jTable1.setEnabled(false);
        }        
    }

    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionMayorista().setVisible(true);
            }
        });
    }
    * */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
