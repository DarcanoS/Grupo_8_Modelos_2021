/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Stivel
 */
public class Menus implements Component{
    
    private Mediator mediator;

    JMenu inicio, autores;
    JMenuItem salir, quienesSomos;
    JMenuBar barraDeOpciones;
    
    @Override
    public void setMediator(Mediator _mediator) {
        this.mediator = _mediator;
    }

    @Override
    public String getName() {
        return "Menus";
    }

    public void listener(ActionListener _this) {
        inicio = new JMenu("Inicio ");
        autores = new JMenu("Autores ");
        salir = new JMenuItem("Salir ");
        salir.addActionListener(_this);
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        quienesSomos = new JMenuItem("Quienes Somos ");
        quienesSomos.addActionListener(_this);
        quienesSomos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        barraDeOpciones = new JMenuBar();

        inicio.add(salir);
        autores.add(quienesSomos);
        barraDeOpciones.add(inicio);
        barraDeOpciones.add(autores);
    }

    public JMenu getInicio() {
        return inicio;
    }

    public JMenu getAutores() {
        return autores;
    }

    public JMenuItem getSalir() {
        return salir;
    }

    public JMenuItem getQuienesSomos() {
        return quienesSomos;
    }

    public JMenuBar getBarraDeOpciones() {
        return barraDeOpciones;
    }

    

}
