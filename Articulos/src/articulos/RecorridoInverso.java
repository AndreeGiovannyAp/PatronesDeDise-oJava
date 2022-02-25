/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Andree
 */
public class RecorridoInverso implements Iterator{
private LinkedList listA;
private int indice=0;
public RecorridoInverso(LinkedList la){
    listA=la;
    indice=listA.size()-1;
}
    @Override
    public boolean hasNext() {
          return indice >= 0;
    }
    public Object actual(){
        return listA.get(indice);
    }
    @Override
    public Object next() {
        return listA.get(indice--);   
    }
    
}
