/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import juego.Variables;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Stivel
 */
public class Buttons {
    JButton bRepartir, bOtraCarta, bSeguro, bOtroJuego, ficha1, ficha5, ficha10, ficha25, ficha50, ficha100;
    ImageIcon icoFicha1, icoFicha5, icoFicha10, icoFicha25, icoFicha50, icoFicha100, cTapada;
    final String PATH = Variables.PATH;
    
    public void listener(ActionListener _this){
        bOtraCarta = new JButton("Otra Carta");
		bOtraCarta.setEnabled(false);
		bOtraCarta.addActionListener(_this);
		bRepartir = new JButton(" Repartir ");
		bRepartir.setEnabled(false);
		bRepartir.addActionListener(_this);
		bSeguro = new JButton("Seguro");
		bSeguro.setEnabled(false);
		bSeguro.addActionListener(_this);
		bOtroJuego = new JButton("Otro Juego");
		bOtroJuego.addActionListener(_this);
                
                icoFicha1 = new ImageIcon(PATH+"m1.png");
		ficha1 = new JButton(icoFicha1);
		ficha1.addActionListener(_this);
		icoFicha5 = new ImageIcon(PATH+"m5.png");
		ficha5 = new JButton(icoFicha5);
		ficha5.addActionListener(_this);
		icoFicha10 = new ImageIcon(PATH+"m10.png");
		ficha10 = new JButton(icoFicha10);
		ficha10.addActionListener(_this);
		icoFicha25 = new ImageIcon(PATH+"m25.png");
		ficha25 = new JButton(icoFicha25);
		ficha25.addActionListener(_this);
		icoFicha50 = new ImageIcon(PATH+"m50.png");
		ficha50 = new JButton(icoFicha50);
		ficha50.addActionListener(_this);
		icoFicha100 = new ImageIcon(PATH+"m100.png");
		ficha100  = new JButton(icoFicha100);
		ficha100.addActionListener(_this);
    }

    public JButton getbRepartir() {
        return bRepartir;
    }

    public JButton getbOtraCarta() {
        return bOtraCarta;
    }

    public JButton getbSeguro() {
        return bSeguro;
    }

    public JButton getbOtroJuego() {
        return bOtroJuego;
    }

    public JButton getFicha1() {
        return ficha1;
    }

    public JButton getFicha5() {
        return ficha5;
    }

    public JButton getFicha10() {
        return ficha10;
    }

    public JButton getFicha25() {
        return ficha25;
    }

    public JButton getFicha50() {
        return ficha50;
    }

    public JButton getFicha100() {
        return ficha100;
    }

    public ImageIcon getIcoFicha1() {
        return icoFicha1;
    }

    public ImageIcon getIcoFicha5() {
        return icoFicha5;
    }

    public ImageIcon getIcoFicha10() {
        return icoFicha10;
    }

    public ImageIcon getIcoFicha25() {
        return icoFicha25;
    }

    public ImageIcon getIcoFicha50() {
        return icoFicha50;
    }

    public ImageIcon getIcoFicha100() {
        return icoFicha100;
    }

    public ImageIcon getcTapada() {
        return cTapada;
    }

    public String getPATH() {
        return PATH;
    }
    
    
}
