/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import observer.ObservadoConcreto;
import observer.Observador;
import proxy.*;

/**
 *
 * @author Stivel
 */
public class MediatorInterfaz implements Mediator {

    ActionEvent _ae;
    private Buttons buttons;
    private FondoGeneral fondoGeneral;
    private FondoMadera_1 fondoMadera_1;
    private FondoMadera_2 fondoMadera_2;
    private Labels labels;
    private Menus menus;
    private Paneles paneles;
    private Texts texts;

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "Buttons":
                buttons = (Buttons) component;
                break;
            case "FondoGeneral":
                fondoGeneral = (FondoGeneral) component;
                break;
            case "FondoMadera_1":
                fondoMadera_1 = (FondoMadera_1) component;
                break;
            case "FondoMadera_2":
                fondoMadera_2 = (FondoMadera_2) component;
                break;
            case "Labels":
                labels = (Labels) component;
                break;
            case "Menus":
                menus = (Menus) component;
                break;
            case "Paneles":
                paneles = (Paneles) component;
                break;
            case "Texts":
                texts = (Texts) component;
                break;
        }
    }

    @Override
    public void crear(JFrame _frame, ActionListener _listener,
            ObservadoConcreto _observado, Observador _observador, Proxy _proxy) {
        JPanel pPrincipal1, pPrincipal2, pSub1Principal1, pSub2Principal1;

        //Se agrega un observador
        _observado.agregarObservador(_observador);
        
        _proxy.doAction();

        Container contenedor = _frame.getContentPane();
        contenedor.setLayout(null);

        //Se configuran y se asiganal los fondos
        fondoGeneral.setLayout(null);
        fondoMadera_1.setLayout(null);
        fondoMadera_2.setLayout(null);

        //Se asignan los paneles principales
        pPrincipal1 = paneles.getpPrincipal1();
        pPrincipal2 = paneles.getpPrincipal2();
        pSub1Principal1 = paneles.getpSub1Principal1();
        pSub2Principal1 = paneles.getpSub2Principal1();

        //Se crean y se agregar los menus
        menus.listener(_listener);
        _frame.setJMenuBar(menus.getBarraDeOpciones());

        //Se crean y se agregar los buttons
        buttons.listener(_listener);

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

        _frame.setSize(950, 465);
        _frame.setLocationRelativeTo(null);
        _frame.setResizable(false);
        _frame.setVisible(true);

    }

    @Override
    public void setAe(ActionEvent _ae) {
        this._ae = _ae;
    }

}
