/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JDialog;

/**
 *
 * @author USUARIO
 */
public class DialogoAbout extends JDialog
{
    //Elementos de la ventana
    private PanelDialogoAbout miPanelAbout;
    
    //metodo constructor
    public DialogoAbout(VentanaPrincipal miVentanaPrincipal, boolean b) 
    {
        super(miVentanaPrincipal,b);
        setLayout(null);
        
        miPanelAbout = new PanelDialogoAbout();
        miPanelAbout.setBounds(0, 0, 370, 200);
        add(miPanelAbout);
        
        //Caracteristicas de la ventana
        setSize(375,200);
        setTitle("Ventana Ayuda");
        setResizable(false);    
    } 
}
