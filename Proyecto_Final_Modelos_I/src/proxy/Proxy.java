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
public class Proxy implements Subject {

    private int jugadas;

    public Proxy() {
        this.jugadas = 1;
    }
    
    public void reset(){
        this.jugadas = 1;
    }

    @Override
    public String doAction() {
        RealSubject r = new RealSubject();
        jugadas++;
        return "Proxy:\n" + r.doAction() + jugadas + " movimientos.";
    }
}
