/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import facade.*;
import observer.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Stivel
 */
public class Interfaz extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    Container contenedor = getContentPane();
    //llamado utiulizando el patron singleton
    Facade fachada = Facade.obtenerInstancia();

    FondoGeneral fondoGeneral;
    FondoMadera_1 fondoMadera_1;
    FondoMadera_2 fondoMadera_2;

    Paneles paneles;
    JPanel pPrincipal1, pPrincipal2, pSub1Principal1, pSub2Principal1;

    Menus menus;
    //JMenu inicio, autores;
    JMenuItem salir, quienesSomos;
    JMenuBar barraDeOpciones;

    Labels labels;

    Texts texts;

    Buttons buttons;
    JButton bRepartir;

    Observador observador = new Observador();
    ObservadoConcreto objObservado = new ObservadoConcreto();

    public Interfaz() {

        super(Variables.TITULO);
        contenedor.setLayout(null);

        //Se agrega un observador
        objObservado.agregarObservador(observador);

        //Se crean, se configuran y se asiganal los fondos
        fondoGeneral = fachada.getFondoGeneral();
        fondoGeneral.setLayout(null);
        fondoMadera_1 = fachada.getFondoMadera_1();
        fondoMadera_1.setLayout(null);
        fondoMadera_2 = fachada.getFondoMadera_2();
        fondoMadera_2.setLayout(null);

        //Se crean, se configuran y se asignan los paneles principales
        paneles = fachada.getPaneles();
        pPrincipal1 = paneles.getpPrincipal1();
        pPrincipal2 = paneles.getpPrincipal2();
        pSub1Principal1 = paneles.getpSub1Principal1();
        pSub2Principal1 = paneles.getpSub2Principal1();

        //Se crean, se configuran y se asignan los menus
        menus = fachada.gerMenus(this);
        salir = menus.getSalir();
        quienesSomos = menus.getQuienesSomos();
        setJMenuBar(menus.getBarraDeOpciones());

        //Se crean, se configuran y se asignan los labels
        labels = fachada.getLabels();

        //Se crean, se configuran y se asignan los texts
        texts = fachada.getTexts();

        //Se crean, se configuran y se asignan los botones
        buttons = fachada.getButtons(this);
        bRepartir = buttons.getbRepartir();

        //Se agregar los labels y los text al panel pSub1Principal1
        paneles.configPSub1(labels, texts);

        //Se agregar buttons panel pSub2Principal1
        paneles.configPSub2(buttons);

        //Se agregar los fondos a los sub-paneles
        paneles.configPSubs(fondoMadera_1, fondoMadera_2);

        //se agregan los sub-paneles al panel pPrincipal1
        paneles.configPrincipal1();

        //se configura el panel pPrincipal2
        paneles.configPrincipal2(labels, texts, buttons, fondoGeneral);

        //se agregan los paneles parincipales
        paneles.configContendor(contenedor);

        setSize(950, 465);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(salir)) {
            objObservado.notificarObservadores("Se ha decidio salir de la aplicacion.");
            System.exit(0);
        }
        if (ae.getSource().equals(quienesSomos)) {
            objObservado.notificarObservadores("Se ha decidio ver los autores.");
            JOptionPane.showMessageDialog(null, "Miguel Orlando Gonzalez Gonzalez - 20192020099" + "\n"
                    + "Santiago Martínez Solano - 20192020072" + "\n"
                    + "Stivel Pinilla Puerta - 20191020024", "Quienes Somos", 1);
        }
        if (ae.getSource() == bRepartir) {

        }
    }
}
