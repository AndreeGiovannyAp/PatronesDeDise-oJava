/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompIndexado;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author GadgetL
 */

public class CompCuestionario extends JComponent implements ActionListener, Serializable{
    private JLabel preguntaLabel;
    private JRadioButton[] opcionesJRButton;
    private String respuestasString[] = {"respuesta 1", "respuesta 2", "respuesta 3"};   
    private Map<Integer, String> respuestasMap;
    private JLabel respuestaLabel;
    private ButtonGroup grupoButton;    
    private int opcionCorrecta = 1;
    private JPanel panel1;
    private JPanel panel2;
    private JButton bAceptar;
    private boolean esContestada = false;
    
    public CompCuestionario() {        
        this.preguntaLabel = new JLabel("Pregunta 1");        
        this.opcionesJRButton = new JRadioButton[3];                
        iniComp();
    }

    public CompCuestionario(String p, String op[], int opCorrecta) {//recibe la preguntaLabel,opcionesJRButton y el index de la resp opcionCorrecta
        this.opcionCorrecta = opCorrecta; //indice opcion correcta
        this.preguntaLabel = new JLabel(p); //pregunta        
        this.opcionesJRButton = new JRadioButton[op.length];//opciones de la preguntaLabel  
        this.respuestasString = op; //guarda las opciones
        iniComp();
    }
    
    public void iniComp(){
        setLayout(new GridLayout(2, 1));
        add(preguntaLabel);
        this.respuestaLabel = new JLabel("Respuesta correcta"); 
        this.grupoButton = new ButtonGroup();
        this.respuestasMap = new HashMap<>();
        this.panel1 = new JPanel();
        this.panel2 = new JPanel();  
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        setSize(new Dimension(1000, HEIGHT));
        panel2.add(preguntaLabel);
        for (int i = 0; i < opcionesJRButton.length; i++) {
            respuestasMap.put(i+1, respuestasString[i]); //se introducen las resp con un indice
            opcionesJRButton[i] = new JRadioButton(respuestasMap.get(i+1)); //crea las opcionesJRButton            
            add(opcionesJRButton[i]); //agrega las opcionesJRButton del cuestionario
            panel2.add(opcionesJRButton[i]);
            grupoButton.add(opcionesJRButton[i]);            
        }
        panel1.add(panel2);
        bAceptar = new JButton("Aceptar");
        bAceptar.addActionListener(this);
        panel1.add(bAceptar);
        add(panel1);
    }
    
    public boolean isCorrect() { //se crea un método para verificar si la respuestaLabel es opcionCorrecta   
        if(opcionesJRButton[opcionCorrecta-1].isSelected()){             
            respuestaLabel.setText("Correcta"); //si es correcta lo pone en la JLabel
            respuestaLabel.setForeground(new Color(109, 226, 109)); //En color Verde
            panel1.add(respuestaLabel); 
            repaint();
            revalidate();
            return true;
        }
        else{
            respuestaLabel.setText("Incorrecta");
            panel1.add(respuestaLabel); 
            repaint();
            revalidate();
            return false;
        }           
    }
    
    public boolean verificarRespuesta(){        
        for(int i = 0; i < getOpcionesJRButton().length; i++){
            if(getOpcionesJRButton()[i].isSelected()) //Verifica si hay opciones seleccionadas
                esContestada = true;   
        }
        return esContestada;
    }
    
    public void cambiarRespuesta(int ind, String res){
        if(respuestasMap.containsKey(ind)){ //verifica si existe la opcion
            respuestasMap.remove(ind); //elimina la opcion existente 
        }        
        respuestasMap.put(ind, res); //agrega la nueva opcion
    }
    
    public JLabel getPreguntaLabel() {
        return preguntaLabel;
    }

    public void setPreguntaLabel(JLabel preguntaLabel) {
        this.preguntaLabel = preguntaLabel;
    }

    public JRadioButton[] getOpcionesJRButton() {
        return opcionesJRButton;
    }

    public void setOpcionesJRButton(JRadioButton[] opcionesJRButton) {
        this.opcionesJRButton = opcionesJRButton;
    }

    public String[] getRespuestasString() {
        return respuestasString;
    }

    public void setRespuestasString(String[] respuestasString) {
        this.respuestasString = respuestasString;
        iniComp();
    }

    public Map<Integer, String> getRespuestasMap() {
        return respuestasMap;
    }

    public void setRespuestasMap(Map<Integer, String> respuestasMap) {
        this.respuestasMap = respuestasMap;
    }

    public JLabel getRespuestaLabel() {
        return respuestaLabel;
    }

    public void setRespuestaLabel(JLabel respuestaLabel) {
        this.respuestaLabel = respuestaLabel;
    }

    public ButtonGroup getGrupoButton() {
        return grupoButton;
    }

    public void setGrupoButton(ButtonGroup grupoButton) {
        this.grupoButton = grupoButton;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(int opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(verificarRespuesta()){
            for (int i = 0; i < getOpcionesJRButton().length; i++){
                getOpcionesJRButton()[i].setEnabled(false);
                //isCorrect();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Elija una respuesta");
        }
    }    
}
