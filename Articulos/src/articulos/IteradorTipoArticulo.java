/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

import java.util.LinkedList;

/**
 *
 * @author Andree
 */
public class IteradorTipoArticulo implements java.util.Iterator {

    private LinkedList listA;
    private Articulo a;
    private int indiceArti=-1;
    private int indice = 0;

    public IteradorTipoArticulo(LinkedList la, Articulo a) {
        this.a=a;
        listA= la;
    }
    @Override
    public boolean hasNext() {
        return indice < listA.size();
    }
    public Object actual(){
      if(indiceArti>=0)
        return listA.get(indiceArti);
        return null;
    }
    @Override
    public Object next() {
        if(((Articulo)listA.get(indice)).getTipo().equals(a.getTipo())){
            indiceArti=indice;
            return listA.get(indice++);
        }else{
            //System.out.println("ssss");
            indice++;
            return (hasNext()) ? next() : null;
        }
    }

}
