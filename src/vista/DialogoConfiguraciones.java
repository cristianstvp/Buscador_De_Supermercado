/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

/**
 *
 * @author USUARIO
 */
public class DialogoConfiguraciones extends JDialog implements ActionListener
{
    public PanelConfiguraciones PanelConfg;
    
    public DialogoConfiguraciones(VentanaPrincipal principal,boolean p)
    {
        super(principal,p);
        setLayout(null);
        
        PanelConfg = new PanelConfiguraciones();
        PanelConfg.setBounds(10,10,515,491);
        add(PanelConfg);
        PanelConfg.agregarOyentesBotones(this);
        
        setTitle("Configuraciones");
        setSize(550,550);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comandoCfg = e.getActionCommand();
        
        if(comandoCfg.equals("AceparConfig"))
        {
            this.setVisible(false);
        }
    }
}
