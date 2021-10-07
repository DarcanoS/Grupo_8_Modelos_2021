/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import javax.swing.JTextField;

/**
 *
 * @author Stivel
 */
public class Texts implements Component{
    
    private Mediator mediator;

    JTextField fieldEfectivo, fieldApuesta, fieldPuntajeJugador, fieldPuntajeCupier;

    public Texts() {
        fieldEfectivo = new JTextField("1500");
        fieldEfectivo.setEditable(false);
        fieldApuesta = new JTextField("0");
        fieldApuesta.setEditable(false);
        fieldPuntajeJugador = new JTextField("0");
        fieldPuntajeJugador.setEditable(false);
        fieldPuntajeCupier = new JTextField("0");
        fieldPuntajeCupier.setEditable(false);
    }
    
    @Override
    public void setMediator(Mediator _mediator) {
        this.mediator = _mediator;
    }

    @Override
    public String getName() {
        return "Texts";
    }

    public JTextField getFieldEfectivo() {
        return fieldEfectivo;
    }

    public JTextField getFieldApuesta() {
        return fieldApuesta;
    }

    public JTextField getFieldPuntajeJugador() {
        return fieldPuntajeJugador;
    }

    public JTextField getFieldPuntajeCupier() {
        return fieldPuntajeCupier;
    }

    

}
