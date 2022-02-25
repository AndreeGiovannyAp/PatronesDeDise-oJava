/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author Andree
 */
public interface Observador {

    public void setDia(int d);

    public void setMes(int m);

    public void setAño(int a);

    public void setHora(int h);

    public void setMinuto(int m);

    public void setSegundo(int s);
}
