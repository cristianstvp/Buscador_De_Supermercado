/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author USUARIO
 */
public class PanelDerecho extends JPanel 
{
    private JLabel lbDatos;
    public JButton btBorrar;
    private Image fondo=null;

    public PanelDerecho()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        this.setOpaque(true);
        
        
        //Creación y adición de etiquetas 
        lbDatos=new JLabel("CONSEJOS SALUDABLES", JLabel.CENTER);
        lbDatos.setBounds(-15,20,300,30);
        lbDatos.setFont(new Font("arial",Font.BOLD,20));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("Coma alimentos variados", JLabel.CENTER);
        lbDatos.setBounds(-30,60,340,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("Alimentos ricos en hidratos de carbono", JLabel.CENTER);
        lbDatos.setBounds(-13,90,300,40);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        lbDatos=new JLabel("No omitas los alimentos ricos en fibra", JLabel.CENTER);
        lbDatos.setBounds(-10,150,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("Sin azúcar no significa sin carbohidratos");
        lbDatos.setBounds(0,190,300,40);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("Mira los carbohidratos totales.");
        lbDatos.setBounds(0,230,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        lbDatos=new JLabel("Limita las grasas no saludables.");
        lbDatos.setBounds(0,290,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        
        lbDatos=new JLabel("Lo que comes depende de ti...",JLabel.CENTER);
        lbDatos.setBounds(-20,410,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

   
}
}