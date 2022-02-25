/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disor_a_c3_.prac_com_alfaroperezandree;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import Examen.Examen;
import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
/**
 *
 * @author Andree
 */
public class Cuestionario extends JFrame{
Examen ex;
    private String preguntas[] = {"De las siguiente obras pictóricas, ¿cuáles fueron pintadas por Leonardo da Vinci?",
        "¿Quién sentó las bases para la mayoría de la mecánica clásica?",
        "¿Quién desarrolló la teoría general de la relatividad?",
        "¿Quién desarrolló la teoría del electromagnetismo clásico?"};
    private String[][] respuestas = {{"La Gioconda o Mona Lisa", "La Última Cena", "La Virgen de las Rocas"},
    {" Isaac Newton", " Albert Einstein", "James Clerk Maxwell"},
    {" Isaac Newton", " Albert Einstein", "James Clerk Maxwell"},
    {" Isaac Newton", " Albert Einstein", "James Clerk Maxwell"}};
    private int bien[] = {1, 1, 2, 3};
    String[][] respuestas2 = {{"respuesta1", "respuesta2", "respuesta3"},
    {"respuesta1", "respuesta2", "respuesta3"},
    {"respuesta1", "respuesta2", "respuesta3"},
    {"respuesta1", "respuesta2", "respuesta3"}};
    private JPanel jp = new JPanel();
    private JButton greficar=new JButton();
    Resultados re;
    public Cuestionario () {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
        ex = new Examen(preguntas, respuestas, bien, "Examen De prueba ");
        setVisible(true);
        setSize(600, 75 * (preguntas.length + 3));
        add(ex);
        jp.add(greficar);
        add(jp);
        greficar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ex.getContestado()){
                        re= new Resultados(ex.getNumerodeBuenas(), preguntas.length-ex.getNumerodeBuenas());
                        dispose();
                }
            }
        });
        
    }
}
