/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import facade.Facade;
import observer.*;
import java.awt.event.*;
import javax.swing.*;
import proxy.Proxy;

/**
 *
 * @author Stivel
 */
public class Interfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    //llamado utiulizando el patron singleton
    Facade fachada = Facade.obtenerInstancia();

    Observador observador = new Observador();
    ObservadoConcreto objObservado = new ObservadoConcreto();

    Proxy proxy = new Proxy();

    public Interfaz() {

        super(Variables.TITULO);

        fachada.getMediatorInterfaz().crear(this, this, objObservado, observador, proxy);

    }

    public void actionPerformed(ActionEvent ae) {

        fachada.getMediatorLogica(ae).crear(this, this, objObservado, observador, proxy);

    }
}
