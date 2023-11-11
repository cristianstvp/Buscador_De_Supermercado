/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author USUARIO
 */
public class PanelResultado extends JPanel
{
    private JTextArea taResultado;
    private JScrollPane spResultado;
    private ImageIcon iLogo;
    private JLabel lbImagen;
    private JLabel lbDatos;
    
    public PanelResultado()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        this.setOpaque(false);
        
        //Creación y adicion del area de texto
        taResultado = new JTextArea();
        taResultado.setLineWrap(true);
        taResultado.setWrapStyleWord(true);
        
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,10, 380, 445);
        taResultado.setFont(new Font("Arial", 1, 15));
        taResultado.setEditable(false);
        add(spResultado);
    }
    
    //Mostrar resultado
    public void mostrarResultado(String msj)
    {
        taResultado.append(msj+"\n");
    } 
    
    public void BorrarR()
    {
        taResultado.setText("");
    }
    
    public void Error()
    {
        taResultado.append("Error interno");
    }
    
    public void imprimirResultado()
    {
        try
        {
            taResultado.print(new MessageFormat("Busquedas realizadas"), new MessageFormat("INFOCAZ"));
        }catch(Exception ea)
        {
            ea.printStackTrace();
        }
    }
}
