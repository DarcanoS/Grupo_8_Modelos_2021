/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.awt.Container;
import javax.swing.JPanel;

/**
 *
 * @author Stivel
 */
public class Paneles {

    JPanel pPrincipal1;
    JPanel pPrincipal2;
    JPanel pSub1Principal1;
    JPanel pSub2Principal1;

    public Paneles() {
        this.pPrincipal1 = new JPanel();
        this.pPrincipal1.setLayout(null);
        this.pPrincipal1.setBounds(0, 0, 250, 480);

        this.pPrincipal2 = new JPanel();
        this.pPrincipal2.setLayout(null);
        this.pPrincipal2.setBounds(250, 0, 700, 415);

        this.pSub1Principal1 = new JPanel();
        this.pSub1Principal1.setLayout(null);
        this.pSub1Principal1.setBounds(0, 0, 250, 200);

        this.pSub2Principal1 = new JPanel();
        this.pSub2Principal1.setLayout(null);
        this.pSub2Principal1.setBounds(0, 200, 280, 250);
    }

    //Metodo para agregar los lebels y los texts al panel configPSub1
    public void configPSub1(Labels _labels, Texts _texts) {
        this.pSub1Principal1.add(_labels.getEfectivo());
        _labels.getEfectivo().setBounds(30, 30, 60, 30);

        this.pSub1Principal1.add(_texts.getFieldEfectivo());
        _texts.getFieldEfectivo().setBounds(30, 58, 60, 30);

        this.pSub1Principal1.add(_labels.getApuesta());
        _labels.getApuesta().setBounds(30, 100, 60, 30);

        this.pSub1Principal1.add(_texts.getFieldApuesta());
        _texts.getFieldApuesta().setBounds(30, 128, 60, 30);
    }

    //Metodo para agregar los buttons al panel configPSub2
    public void configPSub2(Buttons _buttons) {
        this.pSub2Principal1.add(_buttons.getFicha1());
        _buttons.getFicha1().setBounds(30, 50, 30, 30);

        this.pSub2Principal1.add(_buttons.getFicha5());
        _buttons.getFicha5().setBounds(100, 50, 30, 30);

        this.pSub2Principal1.add(_buttons.getFicha10());
        _buttons.getFicha10().setBounds(170, 50, 30, 30);

        this.pSub2Principal1.add(_buttons.getFicha25());
        _buttons.getFicha25().setBounds(30, 110, 30, 30);

        this.pSub2Principal1.add(_buttons.getFicha50());
        _buttons.getFicha50().setBounds(100, 110, 30, 30);

        this.pSub2Principal1.add(_buttons.getFicha100());
        _buttons.getFicha100().setBounds(170, 110, 30, 30);
    }
    //Metodo para agregar los fondos a los paneles

    public void configPSubs(FondoMadera_1 _madera1, FondoMadera_2 _madera2) {
        this.pSub1Principal1.add(_madera1);
        _madera1.setBounds(0, 0, 250, 200);

        this.pSub2Principal1.add(_madera2);
        _madera2.setBounds(0, 0, 250, 215);
    }

    //Metodo para agregar los sub-paneles al panel pPrincipal1
    public void configPrincipal1() {
        this.pPrincipal1.add(pSub1Principal1);
        this.pPrincipal1.add(pSub2Principal1);
    }

    public void configPrincipal2(Labels _labels, Texts _texts, Buttons _buttons, FondoGeneral _general) {
        this.pPrincipal2.add(_labels.getJugador());
        _labels.getJugador().setBounds(210, 20, 300, 30);

        this.pPrincipal2.add(_labels.getCartaTapadaJugador());
        _labels.getCartaTapadaJugador().setBounds(200, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta2());
        _labels.getCarta2().setBounds(185, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta3());
        _labels.getCarta3().setBounds(170, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta4());
        _labels.getCarta4().setBounds(155, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta5());
        _labels.getCarta5().setBounds(140, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta6());
        _labels.getCarta6().setBounds(125, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta7());
        _labels.getCarta7().setBounds(110, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta8());
        _labels.getCarta8().setBounds(95, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta9());
        _labels.getCarta9().setBounds(80, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCarta10());
        _labels.getCarta10().setBounds(65, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCupier());
        _labels.getCupier().setBounds(510, 20, 300, 30);

        this.pPrincipal2.add(_labels.getCartaTapadaCupier());
        _labels.getCartaTapadaCupier().setBounds(500, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup2());
        _labels.getCartaCup2().setBounds(485, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup3());
        _labels.getCartaCup3().setBounds(470, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup4());
        _labels.getCartaCup4().setBounds(455, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup5());
        _labels.getCartaCup5().setBounds(440, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup6());
        _labels.getCartaCup6().setBounds(425, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup7());
        _labels.getCartaCup7().setBounds(410, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup8());
        _labels.getCartaCup8().setBounds(395, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup9());
        _labels.getCartaCup9().setBounds(380, 50, 71, 96);

        this.pPrincipal2.add(_labels.getCartaCup10());
        _labels.getCartaCup10().setBounds(365, 50, 71, 96);

        this.pPrincipal2.add(_texts.getFieldPuntajeJugador());
        _texts.getFieldPuntajeJugador().setBounds(220, 255, 30, 30);

        this.pPrincipal2.add(_texts.getFieldPuntajeCupier());
        _texts.getFieldPuntajeCupier().setBounds(520, 255, 30, 30);

        this.pPrincipal2.add(_labels.getMensajes());
        _labels.getMensajes().setBounds(310, 300, 300, 30);

        this.pPrincipal2.add(_buttons.getbRepartir());
        _buttons.getbRepartir().setBounds(150, 375, 100, 30);

        this.pPrincipal2.add(_buttons.getbOtraCarta());
        _buttons.getbOtraCarta().setBounds(260, 375, 110, 30);

        this.pPrincipal2.add(_buttons.getbSeguro());
        _buttons.getbSeguro().setBounds(375, 375, 100, 30);

        this.pPrincipal2.add(_buttons.getbOtroJuego());
        _buttons.getbOtroJuego().setBounds(480, 375, 110, 30);

        this.pPrincipal2.add(_general);
        _general.setBounds(0, 0, 754, 426);
    }

    public void configContendor(Container _contenedor) {
        _contenedor.add(pPrincipal1);
        _contenedor.add(pPrincipal2);
    }

    public JPanel getpPrincipal1() {
        return this.pPrincipal1;
    }

    public JPanel getpPrincipal2() {
        return this.pPrincipal2;
    }

    public JPanel getpSub1Principal1() {
        return this.pSub1Principal1;
    }

    public JPanel getpSub2Principal1() {
        return pSub2Principal1;
    }

}
