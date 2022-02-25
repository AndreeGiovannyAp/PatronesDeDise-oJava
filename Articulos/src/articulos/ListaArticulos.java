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
public class ListaArticulos {
    
    LinkedList<Articulo> articulos;
    public ListaArticulos(){
        articulos = new LinkedList<Articulo>();
    }
    public void add(Articulo art){
        articulos.add(art);  
    }
    public void imprimir(IteradorTipoArticulo il){
        Articulo as;
        Articulo a;
        while(il.hasNext()){
            as=((Articulo)il.next());  
            a= (Articulo) il.actual();
            if(as!=null && a!=null)
            System.out.println("el precio entre el actual "+ a.getNombre()+" y el siguiente es "+as.getNombre()+
                    " "+a.getPrecio()+"-" +as.getPrecio()+" = "+(a.getPrecio()-as.getPrecio()));
           
        }
    }
   
    public LinkedList<Articulo> getLinked(){
        return articulos;
    }
    
}
