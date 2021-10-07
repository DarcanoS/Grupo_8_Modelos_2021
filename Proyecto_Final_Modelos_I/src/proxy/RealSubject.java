/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Stivel
 */
public class RealSubject implements Subject{
    
    int contador=0;

    @Override
    public String doAction() {
        return "El jugador a realizado ";
    }
    
}
