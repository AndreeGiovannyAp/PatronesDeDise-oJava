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
public class IteradorLista implements Iterator{
private LinkedList listA;
private int indice=0;
public IteradorLista(LinkedList la){
    listA=la;
}
    @Override
    public boolean hasNext() {
        return indice < listA.size();
    }
    public Object actual(){
        return listA.get(indice);
    }

    @Override
    public Object next() {
        return listA.get(indice++);
    }
    
    
    
}
