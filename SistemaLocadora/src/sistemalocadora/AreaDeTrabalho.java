/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalocadora;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Laboratorio
 */
public class AreaDeTrabalho extends JDesktopPane {
    private JInternalFrame janelaCliente;
    
    
    public void abrirJanelaCliente() {
        if (janelaCliente == null) {
            janelaCliente = new JanelaCliente();
            janelaCliente.setVisible(true);
            this.add(janelaCliente);
        }
    }
    
    public void fecharJanelaCliente() {
        janelaCliente = null;
    }
}
