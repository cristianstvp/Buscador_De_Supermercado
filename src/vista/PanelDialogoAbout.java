/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class PanelDialogoAbout extends JPanel
{
    private JLabel lbB;
    
    public PanelDialogoAbout()
    {
        setLayout(null);
        setBackground(Color.white);   

        lbB = new JLabel("INFOCAS Socorro", JLabel.CENTER);
        lbB.setBounds(0, 10, 350, 20);
        lbB.setFont(new Font("Arial", 1, 17));
        lbB.setForeground(Color.black);
        add(lbB);    
        
        lbB = new JLabel("Para mas informacion comunicarse al:", JLabel.CENTER);
        lbB.setBounds(0, 40, 350, 20);
        lbB.setFont(new Font("Arial", 0, 12));
        lbB.setForeground(Color.black);
        add(lbB); 
        
        lbB = new JLabel("3107875655", JLabel.CENTER);
        lbB.setBounds(0, 60, 350, 20);
        lbB.setFont(new Font("Arial", 0, 12));
        lbB.setForeground(Color.black);
        add(lbB); 
        
        lbB = new JLabel("Whatsapp: +57 3187583902", JLabel.CENTER);
        lbB.setBounds(0, 80, 350, 20);
        lbB.setFont(new Font("Arial", 0, 12));
        lbB.setForeground(Color.black);
        add(lbB); 
        
        lbB = new JLabel("Valoranos en infocassocorro.com", JLabel.CENTER);
        lbB.setBounds(0, 120, 350, 20);
        lbB.setFont(new Font("Arial", 0, 12));
        lbB.setForeground(Color.black);
        add(lbB); 
        
        lbB = new JLabel("Derechos reservados IFR™", JLabel.CENTER);
        lbB.setBounds(0, 140, 350, 20);
        lbB.setFont(new Font("Arial", 0, 12));
        lbB.setForeground(Color.black);
        add(lbB); 
    }
}
