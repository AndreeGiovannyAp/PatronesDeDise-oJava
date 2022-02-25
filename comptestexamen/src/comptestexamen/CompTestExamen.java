/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptestexamen;


import CompExamen.CompExamen;
import javax.swing.JFrame;

/**
 *
 * @author GadgetL
 */
public class CompTestExamen extends JFrame {
    CompExamen examen;
    
    private String preguntas[] = {"¿En que museo está la Mona Lisa?",
                                  "¿En que siglo nació Van Gogh?",
                                  "La piedad es una escultura de",
                                  "Qué parte de la capilla sixtina pintó Miguel Ángel"};
    private String[][] respuestas = {{"Museo del prado", "Museo British", "Louvre", "Galeria Uffizi"},
                                     {"Siglo XIX", "Siglo XX", "Siglo XVII", "Siglo XVIII"},
                                     {"Miguel Ángel", "Bernini", "Donatello", "Francis Bacon"},
                                     {"Las paredes", "El techo", "Las columnas", "Las puertas"}};
    private int aciertos[] = {3,1,1,2};

    
    public CompTestExamen(){
        examen = new CompExamen("Examen de Arte", preguntas, respuestas, aciertos);
        setVisible(true);
        setSize(900, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(examen);        
    }
    
    public static void main(String[] args) {
        CompTestExamen c =  new CompTestExamen();
    }
    
}
