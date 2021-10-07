package juego;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 */
/**
 *
 * @author Stivel
 */
public class Juego {

    static private String path = Variables.PATH;

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        interfaz.setIconImage(new ImageIcon(path + "icono.gif").getImage());
    }
}
