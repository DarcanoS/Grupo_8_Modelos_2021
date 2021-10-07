/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;
import juego.Variables;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Stivel
 */
public class Labels implements Component{
    
    private Mediator mediator;

    JLabel efectivo, apuesta, jugador, cupier, mensajes, cartaTapadaJugador, cartaTapadaCupier;
    JLabel carta2, carta3, carta4, carta5, carta6, carta7, carta8, carta9, carta10, carta11;
    JLabel cartaCup2, cartaCup3, cartaCup4, cartaCup5, cartaCup6, cartaCup7, cartaCup8, cartaCup9, cartaCup10, cartaCup11;
    ImageIcon cTapada;
    String PATH = Variables.PATH;
    

    public Labels() {
        efectivo = new JLabel("Efectivo");
        efectivo.setForeground(Color.WHITE);
        apuesta = new JLabel("Apuesta");
        apuesta.setForeground(Color.WHITE);
        jugador = new JLabel("Jugador");
        jugador.setForeground(Color.WHITE);
        cupier = new JLabel("Cupier");
        cupier.setForeground(Color.WHITE);
        mensajes = new JLabel("*** Haga Su Apuesta ***");
        mensajes.setForeground(Color.WHITE);

        carta2 = new JLabel();
        cartaCup2 = new JLabel();
        carta3 = new JLabel();
        cartaCup3 = new JLabel();
        carta4 = new JLabel();
        cartaCup4 = new JLabel();
        carta5 = new JLabel();
        cartaCup5 = new JLabel();
        carta6 = new JLabel();
        cartaCup6 = new JLabel();
        carta7 = new JLabel();
        cartaCup7 = new JLabel();
        carta8 = new JLabel();
        cartaCup8 = new JLabel();
        carta9 = new JLabel();
        cartaCup9 = new JLabel();
        carta10 = new JLabel();
        cartaCup10 = new JLabel();
        carta11 = new JLabel();
        cartaCup11 = new JLabel();
        cTapada = new ImageIcon(PATH + "tapada.png");
        cartaTapadaJugador = new JLabel(cTapada);
        cartaTapadaCupier = new JLabel(cTapada);
    }
    
    @Override
    public void setMediator(Mediator _mediator) {
        this.mediator = _mediator;
    }

    @Override
    public String getName() {
        return "Labels";
    }

    public JLabel getEfectivo() {
        return efectivo;
    }

    public JLabel getApuesta() {
        return apuesta;
    }

    public JLabel getJugador() {
        return jugador;
    }

    public JLabel getCupier() {
        return cupier;
    }

    public JLabel getMensajes() {
        return mensajes;
    }

    public JLabel getCartaTapadaJugador() {
        return cartaTapadaJugador;
    }

    public JLabel getCartaTapadaCupier() {
        return cartaTapadaCupier;
    }

    public JLabel getCarta2() {
        return carta2;
    }

    public JLabel getCarta3() {
        return carta3;
    }

    public JLabel getCarta4() {
        return carta4;
    }

    public JLabel getCarta5() {
        return carta5;
    }

    public JLabel getCarta6() {
        return carta6;
    }

    public JLabel getCarta7() {
        return carta7;
    }

    public JLabel getCarta8() {
        return carta8;
    }

    public JLabel getCarta9() {
        return carta9;
    }

    public JLabel getCarta10() {
        return carta10;
    }

    public JLabel getCarta11() {
        return carta11;
    }

    public JLabel getCartaCup2() {
        return cartaCup2;
    }

    public JLabel getCartaCup3() {
        return cartaCup3;
    }

    public JLabel getCartaCup4() {
        return cartaCup4;
    }

    public JLabel getCartaCup5() {
        return cartaCup5;
    }

    public JLabel getCartaCup6() {
        return cartaCup6;
    }

    public JLabel getCartaCup7() {
        return cartaCup7;
    }

    public JLabel getCartaCup8() {
        return cartaCup8;
    }

    public JLabel getCartaCup9() {
        return cartaCup9;
    }

    public JLabel getCartaCup10() {
        return cartaCup10;
    }

    public JLabel getCartaCup11() {
        return cartaCup11;
    }

    public ImageIcon getcTapada() {
        return cTapada;
    }

    
    
    
}
