/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import mediator.*;

/**
 *
 * @author Stivel
 */
public class Facade {

    private static Facade instancia;

    private FondoGeneral fondoGeneral = new FondoGeneral();
    private FondoMadera_1 fondoMadera_1 = new FondoMadera_1();
    private FondoMadera_2 fondoMadera_2 = new FondoMadera_2();
    private Paneles paneles = new Paneles();
    private Menus menus = new Menus();
    private Labels labels = new Labels();
    private Texts texts = new Texts();
    private Buttons buttons = new Buttons();
    private CartasJugadorCupier cardJugador = new CartasJugadorCupier();
    private CartasJugadorCupier cardCupier = new CartasJugadorCupier();
    private Baraja b = new Baraja();

    private Mediator mediadorInterfaz = new MediatorInterfaz();
    private Mediator mediadorLogica = new MediatorLogica();

    //Implemenacion del patron Singleton
    public static Facade obtenerInstancia() {
        if (instancia == null) {
            instancia = new Facade();
        }
        return instancia;
    }

    public Mediator getMediatorInterfaz() {
        this.mediadorInterfaz.registerComponent(paneles);
        this.mediadorInterfaz.registerComponent(menus);
        this.mediadorInterfaz.registerComponent(labels);
        this.mediadorInterfaz.registerComponent(texts);
        this.mediadorInterfaz.registerComponent(buttons);
        this.mediadorInterfaz.registerComponent(fondoGeneral);
        this.mediadorInterfaz.registerComponent(fondoMadera_1);
        this.mediadorInterfaz.registerComponent(fondoMadera_2);

        return this.mediadorInterfaz;
    }

    public Mediator getMediatorLogica(ActionEvent _ae) {
        this.mediadorLogica.registerComponent(paneles);
        this.mediadorLogica.registerComponent(menus);
        this.mediadorLogica.registerComponent(labels);
        this.mediadorLogica.registerComponent(texts);
        this.mediadorLogica.registerComponent(buttons);
        this.mediadorLogica.registerComponent(fondoGeneral);
        this.mediadorLogica.registerComponent(fondoMadera_1);
        this.mediadorLogica.registerComponent(fondoMadera_2);
        cardJugador.setName("cardJugador");
        cardCupier.setName("cardCupier");
        this.mediadorLogica.registerComponent(cardJugador);
        this.mediadorLogica.registerComponent(cardCupier);
        this.mediadorLogica.registerComponent(b);

        mediadorLogica.setAe(_ae);

        return this.mediadorLogica;
    }

}
