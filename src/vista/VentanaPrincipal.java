/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class VentanaPrincipal extends JFrame
{
    public PanelBienvenida miBienvenida;
    public PanelBusqueda miBusqueda;
    public PanelResultado miResultado;
    public BarraMenu miBarraMenu;
    public DialogoConfiguraciones miDialogConfig;
    public DialogoAbout miDialogoAyuda;
    public PrimerVentana pPrimerVentana;
    public PanelDerecho pPanelDerecho;
    public VentanaPrincipal()
    {
        
        setLayout(null);
        
        miBienvenida = new PanelBienvenida();
        miBienvenida.setBounds(5,5,310,525); 
        add(miBienvenida);
        miBienvenida.setBackground(new Color(0,0,0,55));
        
        pPanelDerecho = new PanelDerecho();
        pPanelDerecho.setBounds(705,5,275,525); 
        add(pPanelDerecho);
        pPanelDerecho.setBackground(new Color(0,0,0,55));
               
        miBusqueda = new PanelBusqueda();
        miBusqueda.setBounds(310, 5, 520, 60);
        add(miBusqueda);
        
        miResultado = new PanelResultado();
        miResultado.setBounds(310, 70, 390, 460);
        add(miResultado);
        
        
        pPrimerVentana = new PrimerVentana();
        pPrimerVentana.setBounds(0, 0, 1015, 615);
	add(pPrimerVentana);
        
        //Barra Menu        
        miBarraMenu = new BarraMenu();
        this.setJMenuBar(miBarraMenu);
        
        miDialogConfig = null;
        miDialogoAyuda = null;
        
        //Caracteristicas de la ventana
        setTitle("INFOCAZ");
        setSize(1000,600); //600 en y = 570 en pixeles utilizables
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }

    public void Configuracion()
    {
        miDialogConfig = new DialogoConfiguraciones(this,true);
        miDialogConfig.setLocationRelativeTo(this);
        miDialogConfig.setVisible(true);
    }
    
    public void DialogoAbout()
    {
        miDialogoAyuda = new DialogoAbout(this, true);
        miDialogoAyuda.setLocationRelativeTo(this);
        miDialogoAyuda.setVisible(true);
    }
    
}
