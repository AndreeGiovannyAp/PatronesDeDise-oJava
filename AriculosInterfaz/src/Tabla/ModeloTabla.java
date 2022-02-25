/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import Articulo.Articulo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author GadgetL
 */
public abstract class ModeloTabla extends AbstractTableModel {
    protected String []columnNames;
    protected ArrayList<Object[]> datos= new ArrayList<Object[]>();
    protected Class [] clases;
    @Override
    public int getRowCount() {
        return datos.size();
    }
    @Override
    public String getColumnName(int columnIndex){
        return columnNames[columnIndex];
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         return datos.get(rowIndex)[columnIndex];
    }
    @Override
    public abstract boolean isCellEditable(int row, int col) ;
    @Override
    public abstract void setValueAt(Object value, int row, int col);
    public abstract void hacerTabla(ArrayList<Articulo> datos2, String tipo);
}
