/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import juego.Variables;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author Stivel
 */
public class FondoMadera_1 extends JPanel{

    private static final long serialVersionUID = 1L;
    Image fondo;
    String path = Variables.PATH;

    public FondoMadera_1() {
        fondo = new ImageIcon(path + "mesamadera.jpg").getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
    }
}
