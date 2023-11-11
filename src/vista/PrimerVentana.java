package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PrimerVentana extends JPanel implements ActionListener
	
{
	
    private JLabel lbImagen;
    private ImageIcon iImagen;
    
    /*
    M�todo constructor de panel
    */
    public PrimerVentana()
    {
        //Definicion contenedor del panel
        setLayout(null);
        //Imagen o logotipo
        
        iImagen = new ImageIcon(getClass().getResource("/img/sano.jpg"));
        lbImagen = new JLabel(iImagen);
        add(lbImagen);
        lbImagen.setBounds(-100,-20, 1200,600);
    }
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	}	
	}