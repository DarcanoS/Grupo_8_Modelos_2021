/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import juego.Carta;
import java.util.Vector;

/**
 *
 * @author Stivel
 */
public class Baraja implements Component{
    
    private Mediator mediator;

    Vector<Carta> baraja = new Vector<Carta>();

    public Baraja() {
        creaBaraja();
        organizaBaraja();
    }
    
    @Override
    public void setMediator(Mediator _mediator) {
        this.mediator = _mediator;
    }

    @Override
    public String getName() {
        return "Baraja";
    }

    public void creaBaraja() {
        for (int valor = 1; valor <= 13; valor++) {
            for (int tipoDeCarta = 1; tipoDeCarta <= 4; tipoDeCarta++) {
                Carta c = new Carta(valor, tipoDeCarta);
                baraja.addElement(c);
            }
        }
    }

    public void organizaBaraja() {
        for (int i = 0; i < 51; i++) {
            if (baraja.get(i).getValorCarta() > 10) {
                baraja.get(i).setValorCarta(10);
            }
        }
    }

    public Carta getCarta() {
        int random;
        Carta card;
        random = (int) (Math.random() * (baraja.size()));
        card = baraja.get(random);
        baraja.removeElementAt(random);
        return card;
    }

    
}
