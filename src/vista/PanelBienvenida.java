/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import javax.swing.BorderFactory;
/**
 *
 * @author USUARIO
 */
public class PanelBienvenida extends JPanel 
{
    private JLabel lbDatos;
    private JLabel etiquetaReloj;
    public JButton btBorrar;
    private Thread hilo;
    private Image fondo=null;

    public PanelBienvenida()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        this.setOpaque(true);
        
        
        //Creación y adición de etiquetas 
        lbDatos=new JLabel("Bienvenido", JLabel.CENTER);
        lbDatos.setBounds(0,20,300,30);
        lbDatos.setFont(new Font("arial",Font.BOLD,20));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("  Aqui podra conseguir informacion detallada   ", JLabel.CENTER);
        lbDatos.setBounds(-15,60,340,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,14));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("del producto que desea.", JLabel.CENTER);
        lbDatos.setBounds(0,90,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("Metodo:");
        lbDatos.setBounds(10,150,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,20));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("• Escriba el nombre del producto.");
        lbDatos.setBounds(10,190,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);

        lbDatos=new JLabel("• Si esta disponible la información");
        lbDatos.setBounds(10,230,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        lbDatos=new JLabel("se mostrara el nombre del producto.");
        lbDatos.setBounds(10,250,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        lbDatos=new JLabel("• Precione el boton \"Buscar\".");
        lbDatos.setBounds(10,290,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        
        lbDatos=new JLabel("QUE TENGA UN BUEN DIA",JLabel.CENTER);
        lbDatos.setBounds(0,410,300,20);
        lbDatos.setFont(new Font("arial",Font.BOLD,15));
        lbDatos.setForeground(Color.WHITE);
        add(lbDatos);
        
        
        //------------------------------ Reloj ---------------------------------
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        Runnable runnable = new Runnable() 
        {
            @Override
            
            public void run() 
            {
                while (true) 
                {
                    try 
                    {
                        Thread.sleep(500);
                        etiquetaReloj.setText(formateador.format(LocalDateTime.now()));
                        etiquetaReloj.setOpaque(true);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        hilo = new Thread(runnable);
        hilo.start();
        //mostrar hora
        etiquetaReloj=new JLabel();
        etiquetaReloj.setBounds(110,440,80,20);
        etiquetaReloj.setFont(new Font("Arial", 1, 20));
        etiquetaReloj.setOpaque(true);
        add(etiquetaReloj);
        etiquetaReloj.setVisible(true);

        
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(100, 490, 100, 20);
        add(btBorrar);
        btBorrar.setActionCommand("borrar");
    }
    public void agregarOyentesBotones(ActionListener pAL){
        btBorrar.addActionListener(pAL);
    }
    
    public void descativarReloj(){
        etiquetaReloj.setVisible(false);
    }
    
    public void activarReloj(){
        etiquetaReloj.setVisible(true);
    }

    private void set0paque(boolean b) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}