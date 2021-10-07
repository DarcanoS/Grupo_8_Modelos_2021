/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absFactory.fabricas;

import absFactory.productos.Panel;
import absFactory.productos.Panels;

/**
 *
 * @author Stivel
 */
public class FabricaPanel implements FabricaAbstracta{

    @Override
    public Panel getPanel() {
        return new Panels();
    }
    
}
