/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Stivel
 */
public class FondoMadera_2 extends JPanel{

    private static final long serialVersionUID = 1L;
    Image fondo;
    String path = "src/images/";

    public FondoMadera_2() {
        fondo = new ImageIcon(path + "mesamadera.jpg").getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
    }
}
