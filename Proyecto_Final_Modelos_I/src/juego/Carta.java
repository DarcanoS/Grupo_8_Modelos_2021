/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.ImageIcon;
import juego.Variables;
import mediator.Component;
import mediator.Mediator;

/**
 *
 * @author Stivel
 */
public class Carta {

    private int valorCarta;
    private ImageIcon imagenCarta;
    String path = Variables.PATH;

    public Carta(int valorCarta, int i) {
        this.valorCarta = valorCarta;
        this.imagenCarta = new ImageIcon(path + valorCarta + "-" + i + ".png");
    }

    public int getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    public ImageIcon getImagenCarta() {
        return imagenCarta;
    }

}
