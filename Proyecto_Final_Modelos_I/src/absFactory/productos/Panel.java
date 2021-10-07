/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absFactory.productos;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Stivel
 */
public interface Panel {

    public JPanel pPrincipal1 = new JPanel();

    public void crearPanel();

    public void confiPanel();
    
    public ArrayList<JPanel> getPaneles();
    
}
