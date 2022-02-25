/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disor_a_c3_.prac_com_alfaroperezandree;

import CampoLabel.CampoLabel;
import Examen.Examen;
import Opciones.PreguntaRespuesta;
import com.toedter.calendar.JDateChooser;
import com_grafico.Grafico;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Andree
 */
public class Inicio extends JFrame {
    JDateChooser ds= new JDateChooser();
    private PreguntaRespuesta pr;// new PreguntaRespuesta(pregun, respuest, WIDTH)
    private Examen e; //new Examen(preguntas, respuestas, bien, tit)
    private Grafico g; //new Grafico(encabezado, tLeyenda)
    private CampoLabel cl[];// new CampoLabel(titu, pos, WIDTH, HEIGHT);
    private String res[] = {"mayor a 15", "menos a 15"};
    JPanel jp = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    private String eti[] = {"Nombre", "Apellido Matrerno", "Apellido Paterno", "Telefono ", "Direccion"};
    private int tipos[] = {1, 1, 1, 0, 2};
    private int longitu[] = {12, 12, 12, 10, 20};
    JButton jb = new JButton("Aceptar");
   private  Cuestionario cues;

    public Inicio() {
        setVisible(true);
        setSize(600, 300);
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
        //add(ex);
        setLayout(new GridLayout(3, 1));
        pr = new PreguntaRespuesta("¿Cuantos años tienes", res, 1);
        jp.add(pr);
        jp.add(ds);
        cl = new CampoLabel[5];
        for (int i = 0; i < cl.length; i++) {
            cl[i] = new CampoLabel(eti[i], "izquierda", tipos[i], longitu[i]);
            if (i < 2) {
                jp2.add(cl[i]);
            } else {
                jp3.add(cl[i]);
            }
        }
        add(jp);
        add(jp2);
        add(jp3);
        jp3.add(jb);
        repaint();
        revalidate();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean bien = true;
                for (int i = 0; i < cl.length; i++) {
                    if (cl[i].getDato().equals("")) {
                        bien = false;
                    }
                }
                if (pr.Contestada() && bien) {
                    if (pr.VerificaRespuesta()) {
                        cues = new Cuestionario();
                        dispose();
                    }else{
                    JOptionPane.showMessageDialog(null,"Intenta de nuevo");
                    Inicio in= new Inicio();
                    dispose();
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "da aceptar y continua o llena todos los campos }");
                }
            }
        });
    }

}
