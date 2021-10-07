/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.awt.event.ActionListener;

/**
 *
 * @author Stivel
 */
public class Facade {

    private static Facade instancia;

    private FondoGeneral fondoGeneral = new FondoGeneral();
    private FondoMadera_1 fondoMadera_1 = new FondoMadera_1();
    private FondoMadera_2 fondoMadera_2 = new FondoMadera_2();

    private Paneles paneles = new Paneles();
    private Menus menus = new Menus();
    private Labels labels = new Labels();
    private Texts texts = new Texts();
    private Buttons buttons = new Buttons();

    public static Facade obtenerInstancia() {
        if (instancia == null) {
            instancia = new Facade();
        }
        return instancia;
    }

    public FondoGeneral getFondoGeneral() {
        return this.fondoGeneral;
    }

    public FondoMadera_1 getFondoMadera_1() {
        return this.fondoMadera_1;
    }

    public FondoMadera_2 getFondoMadera_2() {
        return this.fondoMadera_2;
    }

    public Paneles getPaneles() {
        return this.paneles;
    }

    public Menus gerMenus(ActionListener _this) {
        this.menus.listener(_this);
        return this.menus;
    }

    public Labels getLabels() {
        return this.labels;
    }

    public Texts getTexts() {
        return this.texts;
    }

    public Buttons getButtons(ActionListener _this) {
        this.buttons.listener(_this);
        return this.buttons;
    }
}
