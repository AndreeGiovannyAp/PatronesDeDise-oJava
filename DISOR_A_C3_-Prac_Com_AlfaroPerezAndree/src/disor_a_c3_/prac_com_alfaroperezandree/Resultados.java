/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disor_a_c3_.prac_com_alfaroperezandree;

import com_grafico.Grafico;
import javax.swing.JFrame;

/**
 *
 * @author Andree
 */
public class Resultados extends JFrame{
   public Resultados(int buenas,int malas){
   
        String et[] = {"Buenas","Malas"};
        int va[] = {buenas,malas};
        Grafico gr= new Grafico("Respuestas", et);
        gr.setValores(va);
        add(gr);
        setVisible(true);
        setSize(516,530);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
   
   }
}
