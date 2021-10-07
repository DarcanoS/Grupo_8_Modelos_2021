/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import juego.Variables;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Stivel
 */
public class FondoGeneral extends JPanel{

    private static final long serialVersionUID = 1L;
    Image fondo;
    String path = Variables.PATH;

    public FondoGeneral() {
        fondo = new ImageIcon(path + "mesa.gif").getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
    }
}
