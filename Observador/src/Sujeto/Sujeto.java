/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sujeto;

import observador.Observador;

/**
 *
 * @author Andree
 */
public interface Sujeto {
    public void removerObservador(Observador o);
    public void notificarObservador();
    public void registrarObservador(Observador o);
}
