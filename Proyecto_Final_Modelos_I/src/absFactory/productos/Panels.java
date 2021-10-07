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
public class Panels implements Panel {

    JPanel pPrincipal1;
    JPanel pPrincipal2;

    JPanel pSub1Principal1;
    JPanel pSub2Principal1;

    @Override
    public void crearPanel() {
        this.pPrincipal1 = new JPanel();
        this.pPrincipal2 = new JPanel();
        this.pSub1Principal1 = new JPanel();
        this.pSub2Principal1 = new JPanel();

        this.confiPanel();
    }

    @Override
    public void confiPanel() {
        this.pPrincipal1.setLayout(null);
        this.pPrincipal1.setBounds(0, 0, 250, 480);

        this.pPrincipal2.setLayout(null);
        this.pPrincipal2.setBounds(250, 0, 700, 415);

        this.pSub1Principal1.setLayout(null);
        this.pSub1Principal1.setBounds(0, 0, 250, 200);

        this.pSub2Principal1.setLayout(null);
        this.pSub2Principal1.setBounds(0, 200, 280, 250);
    }

    @Override
    public ArrayList<JPanel> getPaneles() {
//        switch (_panel) {
//            case "pPrincipal1":
//                System.out.println("Llego hasta aqui");
//                return this.pPrincipal1;
//
//            case "pPrincipal2":
//                System.out.println("Llego hasta aqui 2");
//                return this.pPrincipal2;
//
//            case "pSub1Principal1":
//                return this.pSub1Principal1;
//
//            case "pSub2Principal1":
//                return this.pSub2Principal1;
//            default:
//                return null;
//
//        }
        ArrayList<JPanel> paneles = new ArrayList();
        paneles.add(pPrincipal1);
        paneles.add(pPrincipal2);
        paneles.add(pSub1Principal1);
        paneles.add(pSub2Principal1);
        JPanel prueba1 = paneles.get(0);
        if(prueba1 instanceof JPanel){
            System.out.println("Lo es!!!");
        }
        return paneles;

    }

}
