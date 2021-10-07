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
public class Proxy implements Subject{
    
    private int jugadas;
    
    public Proxy(){
        this.jugadas = 0;
        System.out.println("Proxy:");
    }

    @Override
    public String doAction() {
        RealSubject r = new RealSubject();
        jugadas++;
        return r.doAction()+jugadas+" movimientos.";
    }
}
