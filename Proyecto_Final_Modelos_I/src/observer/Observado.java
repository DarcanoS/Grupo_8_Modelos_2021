/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author Stivel
 */
public abstract class Observado {
    
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();
    
    public void agregarObservador(IObservador o)
    {
        this.observadores.add(o);
        
        notificarObservadores("Se ha agregado un observador.");
    }
    
     public void eliminarObservador(IObservador o) {
        this.observadores.remove(o);
    }
    
     public void notificarObservadores(String _mensaje)
    {
         for (IObservador obj : this.observadores) {
             obj.observarEstado(_mensaje);
        }
    }
    
}
