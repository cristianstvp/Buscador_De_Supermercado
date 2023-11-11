/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class PanelConfiguraciones extends JPanel 
{
    private JLabel lbDatos;
    private JCheckBox CBX1,CBX2;
    private JButton bthecho;

    
    public PanelConfiguraciones()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        this.setOpaque(false);
        
        //Creación y adición de etiquetas 
        lbDatos=new JLabel("CONFIGURACIONES GENERALES",JLabel.CENTER);
        lbDatos.setBounds(0,7,515,20);
        lbDatos.setFont(new Font("Arial", 3, 15));
        add(lbDatos);
        
        lbDatos=new JLabel("Desactivar botones operacionales");
        lbDatos.setBounds(45,42,200,20);
        lbDatos.setFont(new Font("Arial", 1, 12));
        add(lbDatos);
        
        lbDatos=new JLabel("Desactivar Reloj");
        lbDatos.setBounds(45,77,200,20);
        lbDatos.setFont(new Font("Arial", 1, 12));
        add(lbDatos);
        //CheckBoxs
//        Botones operacionales
        CBX1 = new JCheckBox();
        CBX1.setBounds(5, 44, 20, 20);
        add(CBX1);
//        Reloj
        CBX2 = new JCheckBox();
        CBX2.setBounds(5, 79, 20, 20);
        add(CBX2);
        
        //Button
        bthecho = new JButton("Aceptar");
        bthecho.setBounds(212,460, 90, 25);
        add(bthecho);
        bthecho.setActionCommand("AceparConfig");
    }
    
    public void paintComponent(Graphics g)
    {
        //Llama el metodo paintComponent de la superclase
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;        

        //Capturo el ancho y alto del panel
        int w= this.getWidth();
        int h = this.getHeight();
        g2.setColor(Color.BLACK);
        g2.drawLine(0, 0, 0, h);
        g2.drawLine(30, 0, 30, h);
        g2.drawLine(w-1, 0, w-1, h);
        for(int i = 0;i<h;i+=35)
        {
            g2.drawLine(0, i, w, i);
        }
        g2.setColor(Color.WHITE);
        g2.drawLine(30, h-35, 30, h-1);
        g2.drawLine(30, 1, 30, 34);
    }
    
    public boolean desactivarBotones()
    {
        return CBX1.isSelected();
    }
    
    public boolean desactivarReloj()
    {
        return CBX2.isSelected();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        bthecho.addActionListener(pAL);
    }
}
