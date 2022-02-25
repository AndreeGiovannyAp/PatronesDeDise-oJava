/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompExamen;


import CompIndexado.CompCuestionario;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author GadgetL
 */
public class CompExamen extends JComponent implements ActionListener,Serializable{
    
    private JLabel tituloExamen;
    private String titulo = "Examen Ejemplo";    
    private String preguntasString[] = {"Pregunta 1",
                                        "Pregunta 2",
                                        "Pregunta 3"};
    private String[][] respuestasString = {{"respuesta 1", "respuesta 2", "respuesta 3"},
                                           {"respuesta 1", "respuesta 2", "respuesta 3"},
                                           {"respuesta 1", "respuesta 2", "respuesta 3"}}; 
    private int[] respuestaCorrecta = {1,2,3};
    private CompCuestionario cuestionario[];
    private int aciertos;
    private JPanel panelPreguntas;    
    private JButton bAceptar;
    private JLabel labelAciertos;
            
    public CompExamen(){        
        initComp();

    }
    
    public CompExamen(String titulo, String preg[], String opc[][], int opCorrectas[]) {
        setTitulo(titulo);
        preguntasString = preg;
        respuestasString = opc;
        respuestaCorrecta = opCorrectas;
        initComp();
    }
    
    public void initComp(){
        tituloExamen = new JLabel(titulo);       
        panelPreguntas = new JPanel();        
        panelPreguntas.setLayout(new GridLayout(preguntasString.length,0,0,0));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(tituloExamen);
        cuestionario = new CompCuestionario[preguntasString.length];
        for (int i = 0; i < preguntasString.length; i++) { //crea compCuestionario
            cuestionario[i] = new CompCuestionario(preguntasString[i], //agrega los comp al arreglo
                                                   respuestasString[i], 
                                                   respuestaCorrecta[i]);            
            panelPreguntas.add(cuestionario[i]); //agrega la pregunta y las respuestas
        }        
        add(panelPreguntas);
        bAceptar = new JButton("Aceptar");
        bAceptar.addActionListener(this);
        add(bAceptar);
        labelAciertos = new JLabel("");
        add(labelAciertos);
        repaint();
        revalidate();
    }

    public boolean verificarPreguntas(){
        int resp = 0;
        for (int i = 0; i < cuestionario.length; i++) { 
            if(cuestionario[i].verificarRespuesta()){
                resp++;
            }
        }        
        return resp == cuestionario.length;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  
        if(verificarPreguntas()){
            for (int i = 0; i < cuestionario.length; i++) { 
                if(cuestionario[i].isCorrect())
                    aciertos++;            
            } 
        }
        else{
            JOptionPane.showMessageDialog(null, "Responde todas las preguntas");
        }         
        labelAciertos.setText("Total: " + aciertos + " aciertos");
    }

    public JLabel getTituloExamen() {
        return tituloExamen;
    }

    public void setTituloExamen(JLabel tituloExamen) {
        this.tituloExamen = tituloExamen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getPreguntasString() {
        return preguntasString;
    }

    public void setPreguntasString(String[] preguntasString) {
        this.preguntasString = preguntasString;
        initComp();
    }

    public String[][] getRespuestasString() {
        return respuestasString;
    }

    public void setRespuestasString(String[][] respuestasString) {
        this.respuestasString = respuestasString;
        initComp();
    }

    public int[] getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int[] respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public CompCuestionario[] getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(CompCuestionario[] cuestionario) {
        this.cuestionario = cuestionario;
    }

    public JButton getbAceptar() {
        return bAceptar;
    }

    public void setbAceptar(JButton bAceptar) {
        this.bAceptar = bAceptar;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public JPanel getPanelPreguntas() {
        return panelPreguntas;
    }

    public void setPanelPreguntas(JPanel panelPreguntas) {
        this.panelPreguntas = panelPreguntas;
    }
}
