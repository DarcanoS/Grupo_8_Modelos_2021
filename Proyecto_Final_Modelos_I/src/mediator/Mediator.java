/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import observer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import proxy.Proxy;

/**
 *
 * @author Stivel
 */
public interface Mediator {

    public void registerComponent(Component component);

    public void crear(JFrame _frame, ActionListener _listener,
            ObservadoConcreto _observado, Observador _observador, Proxy _proxy);
    
    public void setAe(ActionEvent _ae);
}
