/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulos;

/**
 *
 * @author Andree
 */
public class Prueba { 
    public static void main(String args[]){
     Articulo a= new Articulo("Fresa",10, 20,"Es rojo","Fruta");
     Articulo a1= new Articulo("Tasajo",20, 100,"Esta crudo","Carne");
     Articulo a2= new Articulo("Lechuga",30, 10,"es verde","Verdura");
     Articulo a3= new Articulo("pepino",40, 50,"es verde y tiene semillas","Verdura");
     Articulo a4= new Articulo("Chorizo",50, 100,"Esta crudo y es rojo ","Carne");
     Articulo a5= new Articulo("Brocoli",60, 40,"es verde y parece arbol","Verdura");
     Articulo a6= new Articulo("Nanranja",70, 90,"Es Naranja","Fruta");
     Articulo a67= new Articulo("Nanranja2",80, 10,"Es Naranja","Fruta");
     Articulo a7= new Articulo("Kiwi",90, 100,"Es Naranja","Fruta");
     Articulo a8= new Articulo("Sandia",13, 30,"Es Naranja","Fruta");
     
     ListaArticulos la= new ListaArticulos();
     la.add(a);
     la.add(a1);
     la.add(a2);
     la.add(a3);
     la.add(a4);
     la.add(a8);
     la.add(a5);
     la.add(a6);
     //IteradorLista it= new IteradorLista(la.getLinked());  
     //RecorridoInverso it2= new RecorridoInverso(la.getLinked());   
     IteradorTipoArticulo it3= new IteradorTipoArticulo(la.getLinked(), a);
     //System.out.println("*************Normal*************");
     //la.imprimir(it);
     //System.out.println("**********Inverso **************");
     //la.imprimir(it2);
     System.out.println("**********Por tipo**************");
     la.add(a67);
     la.add(a7);
     la.imprimir(it3);
    }
    
}
