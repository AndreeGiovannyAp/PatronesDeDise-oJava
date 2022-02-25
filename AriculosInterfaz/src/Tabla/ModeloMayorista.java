/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import Articulo.Articulo;
import java.util.ArrayList;

/**
 *
 * @author Andree
 */
public class ModeloMayorista extends ModeloTabla{

    public ModeloMayorista(ArrayList<Articulo> datos2,String tipo) {
        columnNames =new String[]{"Nombre", "Nombre tipo Articulo", "Precio unitario mayorista",
            "Existencia", "Cantidad","Importe"};
        clases= new Class [] {
                            java.lang.String.class,
                            java.lang.String.class,
                            java.lang.Double.class,
                            java.lang.Integer.class,
                            java.lang.Integer.class,
                            java.lang.Double.class };
        hacerTabla(datos2, tipo);
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return (col == 4)? true : false;
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
       int operador1, operador2;
   operador1=Integer.parseInt(value.toString());
   operador2=Integer.parseInt(datos.get(row)[3].toString());
    if(operador1<=operador2){
           datos.get(row)[3]=operador2-operador1;
           datos.get(row)[col]=operador1;
           datos.get(row)[col+1]=operador1*Double.parseDouble(datos.get(row)[2].toString());
    }
    this.fireTableCellUpdated(row, col);
    this.fireTableRowsUpdated(row, col);
    }

    @Override
    public void hacerTabla(ArrayList<Articulo> datos2, String tipo) {
        for (int i = 0; i < datos2.size(); i++) {
           Articulo a =datos2.get(i);
           if(a.getTipo().equals(tipo)){
            Object[] aux = {a.getNombreArticulo(),a.getTipo2(), a.Precio("Mayorista"), a.getExistencia()+a.getCantidadBodega(), 0, 0};
            datos.add(aux);
            }
        }
    }
    
}
