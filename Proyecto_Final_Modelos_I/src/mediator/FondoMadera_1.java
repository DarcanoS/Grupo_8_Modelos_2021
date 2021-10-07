/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import juego.Variables;
import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author Stivel
 */
public class FondoMadera_1 extends JPanel implements Component{
    
    private Mediator mediator;

    private static final long serialVersionUID = 1L;
    Image fondo;
    String path = Variables.PATH;
    
    @Override
    public void setMediator(Mediator _mediator) {
        this.mediator = _mediator;
    }
    
    @Override
    public String getName() {
        return "FondoMadera_1";
    }

    public FondoMadera_1() {
        fondo = new ImageIcon(path + "mesamadera.jpg").getImage();
    }

    public void paint(Graphics g) {
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), null);
    }

    
}
