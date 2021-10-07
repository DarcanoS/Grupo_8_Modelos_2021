/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import juego.Variables;
import observer.ObservadoConcreto;
import observer.Observador;
import proxy.*;

/**
 *
 * @author Stivel
 */
public class MediatorLogica implements Mediator {

    ActionEvent _ae;
    private Buttons buttons;
    private FondoGeneral fondoGeneral;
    private FondoMadera_1 fondoMadera_1;
    private FondoMadera_2 fondoMadera_2;
    private Labels labels;
    private Menus menus;
    private Paneles paneles;
    private Texts texts;

    private CartasJugadorCupier cardJugador;
    private CartasJugadorCupier cardCupier;
    private Baraja b;

    private String hasPerdido = Variables.LOSE;
    private String hasGanado = Variables.WIN;
    

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
            case "cardJugador":
                cardJugador = (CartasJugadorCupier) component;
                break;
            case "cardCupier":
                cardCupier = (CartasJugadorCupier) component;
                break;
            case "Baraja":
                b = (Baraja) component;
                break;
        }
    }

    @Override
    public void crear(JFrame _frame, ActionListener _listener,
            ObservadoConcreto _observado, Observador _observador, Proxy _proxy) {
        if (_ae.getSource().equals(menus.getSalir())) {
            _observado.notificarObservadores("Se ha decidio salir de la aplicacion.");
            System.exit(0);
        }
        if (_ae.getSource().equals(menus.getQuienesSomos())) {
            _observado.notificarObservadores("Se ha decidio ver los autores.");
            JOptionPane.showMessageDialog(null, "Miguel Orlando Gonzalez Gonzalez - 20192020099" + "\n"
                    + "Santiago Martínez Solano - 20192020072" + "\n"
                    + "Stivel Pinilla Puerta - 20191020024", "Quienes Somos", 1);
        }
        if (_ae.getSource() == buttons.getbRepartir()) {
            buttons.getFicha1().setEnabled(false);
            buttons.getFicha5().setEnabled(false);
            buttons.getFicha10().setEnabled(false);
            buttons.getFicha25().setEnabled(false);
            buttons.getFicha50().setEnabled(false);
            buttons.getFicha100().setEnabled(false);
            buttons.getbOtraCarta().setEnabled(true);
            buttons.getbSeguro().setEnabled(true);
            buttons.getbRepartir().setEnabled(false);
            buttons.getbOtroJuego().setEnabled(true);

            cardCupier.setCarta(b.getCarta());
            if (cardCupier.getCarta(0).getValorCarta() == 1) {
                cardCupier.getCarta(0).setValorCarta(11);
            }
            labels.getCartaTapadaCupier().setIcon(cardCupier.getCarta(0).getImagenCarta());
            texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());

            cardJugador.setCarta(b.getCarta());
            if (cardJugador.getCarta(0).getValorCarta() == 1) {
                cardJugador.getCarta(0).setValorCarta(11);
            }
            labels.getCartaTapadaJugador().setIcon(cardJugador.getCarta(0).getImagenCarta());
            texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());

            cardJugador.setCarta(b.getCarta());
            if (cardJugador.getCarta(1).getValorCarta() == 1) {
                cardJugador.getCarta(1).setValorCarta(11);
            }
            labels.getCarta2().setIcon(cardJugador.getCarta(1).getImagenCarta());
            texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());

            if (cardJugador.CalcularTotal() == 21) {
                hasGanado();
            }
            gameOver();
        }

        if (_ae.getSource() == buttons.getbOtraCarta()) {
            
            _proxy.doAction();
            buttons.getbRepartir().setEnabled(false);
            int temp;
            temp = cardJugador.calcularTamano();
            switch (temp) {
                case 2:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(2);
                    labels.getCarta3().setIcon(cardJugador.getCarta(2).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 3:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(3);
                    labels.getCarta4().setIcon(cardJugador.getCarta(3).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 4:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(4);
                    labels.getCarta5().setIcon(cardJugador.getCarta(4).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 5:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(5);
                    labels.getCarta6().setIcon(cardJugador.getCarta(5).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 6:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(6);
                    labels.getCarta7().setIcon(cardJugador.getCarta(6).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 7:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(7);
                    labels.getCarta8().setIcon(cardJugador.getCarta(7).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 8:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(8);
                    labels.getCarta9().setIcon(cardJugador.getCarta(8).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 9:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(9);
                    labels.getCarta10().setIcon(cardJugador.getCarta(9).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                case 10:
                    cardJugador.setCarta(b.getCarta());
                    cardJugador.cambiarValorAs(10);
                    labels.getCarta11().setIcon(cardJugador.getCarta(10).getImagenCarta());
                    texts.getFieldPuntajeJugador().setText("" + cardJugador.CalcularTotal());
                    break;
                default:
                    break;
            }

            if (Integer.parseInt(texts.getFieldPuntajeJugador().getText()) == 21) {
                hasGanado();
            }

            if (Integer.parseInt(texts.getFieldPuntajeJugador().getText()) > 21) {
                hasPerdido();
            }
            gameOver();
        }

        if (_ae.getSource() == buttons.getbSeguro()) {
            buttons.getbOtraCarta().setEnabled(false);
            int temp;

            do {

                temp = cardCupier.calcularTamano();

                switch (temp) {
                    case 1:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(1);
                        labels.getCartaCup2().setIcon(cardCupier.getCarta(1).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 2:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(2);
                        labels.getCartaCup3().setIcon(cardCupier.getCarta(2).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 3:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(3);
                        labels.getCartaCup4().setIcon(cardCupier.getCarta(3).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 4:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(4);
                        labels.getCartaCup5().setIcon(cardCupier.getCarta(4).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 5:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(5);
                        labels.getCartaCup6().setIcon(cardCupier.getCarta(5).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 6:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(6);
                        labels.getCartaCup7().setIcon(cardCupier.getCarta(6).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 7:
                        cardCupier.setCarta(b.getCarta());

                        labels.getCartaCup8().setIcon(cardCupier.getCarta(7).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        cambiarAsCup(7);
                        break;
                    case 8:
                        cardCupier.setCarta(b.getCarta());
                        cardCupier.cambiarValorAs(8);
                        labels.getCartaCup9().setIcon(cardCupier.getCarta(8).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 9:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(9);
                        labels.getCartaCup10().setIcon(cardCupier.getCarta(9).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());
                        break;
                    case 10:
                        cardCupier.setCarta(b.getCarta());
                        cambiarAsCup(10);
                        labels.getCartaCup11().setIcon(cardCupier.getCarta(10).getImagenCarta());
                        texts.getFieldPuntajeCupier().setText("" + cardCupier.CalcularTotal());

                        break;
                }
            } while (Integer.parseInt(texts.getFieldPuntajeJugador().getText()) < 21
                    && Integer.parseInt(texts.getFieldPuntajeJugador().getText()) >= Integer.parseInt(texts.getFieldPuntajeCupier().getText()));

            if (Integer.parseInt(texts.getFieldPuntajeJugador().getText()) > Integer.parseInt(texts.getFieldPuntajeCupier().getText())
                    || Integer.parseInt(texts.getFieldPuntajeJugador().getText()) <= 21 && Integer.parseInt(texts.getFieldPuntajeCupier().getText()) > 21) {
                hasGanado();
            } else {
                hasPerdido();
            }
            gameOver();
        }
        if (_ae.getSource() == buttons.getFicha1()) {
            int valorFicha = 1;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getFicha5()) {
            int valorFicha = 5;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getFicha10()) {
            int valorFicha = 10;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getFicha25()) {
            int valorFicha = 25;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getFicha50()) {
            int valorFicha = 50;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getFicha100()) {
            int valorFicha = 100;
            sumarFicha(valorFicha);
        }
        if (_ae.getSource() == buttons.getbOtroJuego()) {
            buttons.getFicha1().setEnabled(true);
            buttons.getFicha5().setEnabled(true);
            buttons.getFicha10().setEnabled(true);
            buttons.getFicha25().setEnabled(true);
            buttons.getFicha50().setEnabled(true);
            buttons.getFicha100().setEnabled(true);
            buttons.getbRepartir().setEnabled(false);
            buttons.getbOtroJuego().setEnabled(false);
            buttons.getbOtraCarta().setEnabled(false);
            buttons.getbSeguro().setEnabled(false);
            texts.getFieldApuesta().setText("" + 0);
            texts.getFieldPuntajeCupier().setText("" + 0);
            texts.getFieldPuntajeJugador().setText("" + 0);
            labels.getMensajes().setText("*** Haga Su Apuesta ***");
            labels.getCartaTapadaCupier().setIcon(labels.getcTapada());
            labels.getCartaTapadaJugador().setIcon(labels.getcTapada());
            labels.getCarta2().setIcon(null);
            labels.getCarta3().setIcon(null);
            labels.getCarta4().setIcon(null);
            labels.getCarta5().setIcon(null);
            labels.getCarta6().setIcon(null);
            labels.getCarta7().setIcon(null);
            labels.getCarta8().setIcon(null);
            labels.getCarta9().setIcon(null);
            labels.getCarta10().setIcon(null);
            labels.getCarta11().setIcon(null);
            labels.getCartaCup2().setIcon(null);
            labels.getCartaCup3().setIcon(null);
            labels.getCartaCup4().setIcon(null);
            labels.getCartaCup5().setIcon(null);
            labels.getCartaCup6().setIcon(null);
            labels.getCartaCup7().setIcon(null);
            labels.getCartaCup8().setIcon(null);
            labels.getCartaCup9().setIcon(null);
            labels.getCartaCup10().setIcon(null);
            labels.getCartaCup11().setIcon(null);
            b.creaBaraja();
            cardJugador.reiniciar();
            cardCupier.reiniciar();
        }

    }

    public void cambiarAsCup(int n) {
        if (cardCupier.getCarta(n).getValorCarta() == 1) {
            if (Integer.parseInt(texts.getFieldPuntajeCupier().getText()) <= 10) {
                cardCupier.getCarta(n).setValorCarta(11);
            } else {
                cardCupier.getCarta(n).setValorCarta(1);
            }
        }
    }

    public void gameOver() {
        if (Integer.parseInt(texts.getFieldApuesta().getText()) == 0
                && Integer.parseInt(texts.getFieldEfectivo().getText()) == 0) {
            JOptionPane.showMessageDialog(labels.getCartaTapadaJugador(), "GAME OVER", "Black Jack 21", 0);
            System.exit(0);
        }
    }

    public void hasGanado() {
        labels.getMensajes().setText(hasGanado);
        int dineroGanado;
        dineroGanado = (Integer.parseInt(texts.getFieldApuesta().getText()) * 2)
                + Integer.parseInt(texts.getFieldEfectivo().getText());
        texts.getFieldEfectivo().setText("" + dineroGanado);
        texts.getFieldApuesta().setText("0");
        buttons.getbSeguro().setEnabled(false);
        buttons.getbOtraCarta().setEnabled(false);
    }

    public void hasPerdido() {
        labels.getMensajes().setText(hasPerdido);
        texts.getFieldApuesta().setText("0");
        buttons.getbSeguro().setEnabled(false);
        buttons.getbOtraCarta().setEnabled(false);
    }

    public void sumarFicha(int i) {
        int aux = Integer.parseInt(texts.getFieldApuesta().getText());
        int aux2 = Integer.parseInt(texts.getFieldEfectivo().getText());
        int total = i + aux;
        int total2 = aux2 - i;

        buttons.getbRepartir().setEnabled(true);
        if ((aux2 - i) < 0) {
            texts.getFieldApuesta().setText("" + aux);
            texts.getFieldEfectivo().setText("" + aux2);
        } else {
            texts.getFieldApuesta().setText("" + total);
            texts.getFieldEfectivo().setText("" + total2);
        }
    }

    public void setAe(ActionEvent _ae) {
        this._ae = _ae;
    }

}
