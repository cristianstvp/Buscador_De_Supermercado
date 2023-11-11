/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author USUARIO
 */
public class BarraMenu extends JMenuBar
{
    private JMenu mOperaciones, mAyuda;
    private JMenuItem miCalcular, miBorrar, miSalir, miImprecion, miConfiguracion, miInfo, miAbout;
    
    public BarraMenu()
    {
    // <editor-fold desc="Operaciones">
        //menu operaciones
        mOperaciones = new JMenu ("Operaciones");
        mOperaciones.setMnemonic('o');        
        this.add(mOperaciones);
        ImageIcon pOperaciones= new ImageIcon(getClass().getResource("/img/operation.png"));
        mOperaciones.setIcon(new ImageIcon(pOperaciones.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a operaciones
        miCalcular = new JMenuItem("Buscar");
        miCalcular.setActionCommand("buscar");        
        miCalcular.setMnemonic('b');
        mOperaciones.add(miCalcular);
        miCalcular.setVisible(true);
        ImageIcon mCalcular= new ImageIcon(getClass().getResource("/img/search.png"));
        miCalcular.setIcon(new ImageIcon(mCalcular.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a operaciones
        miBorrar = new JMenuItem("Borrar");
        miBorrar.setActionCommand("borrar");
        miBorrar.setMnemonic('r');
        mOperaciones.add(miBorrar);
        miBorrar.setVisible(true);
        ImageIcon mBorrar= new ImageIcon(getClass().getResource("/img/delete.png"));
        miBorrar.setIcon(new ImageIcon(mBorrar.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a operaciones
        miSalir = new JMenuItem("Salir");
        miSalir.setActionCommand("salir");
        miSalir.setMnemonic('s');
        mOperaciones.add(miSalir);
        miSalir.setVisible(true);
        ImageIcon mSalir= new ImageIcon(getClass().getResource("/img/exit.png"));
        miSalir.setIcon(new ImageIcon(mSalir.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a operaciones
        miImprecion = new JMenuItem("Imprimir resultado");
        miImprecion.setActionCommand("imprima");
        miImprecion.setMnemonic('i');
        mOperaciones.add(miImprecion);
        miImprecion.setVisible(true);
        ImageIcon mImprecion= new ImageIcon(getClass().getResource("/img/print.png"));
        miImprecion.setIcon(new ImageIcon(mImprecion.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
    // </editor-fold> 
        
    // <editor-fold desc="Ayuda">
        //menu Ayuda
        mAyuda = new JMenu ("Ayuda");
        mAyuda.setMnemonic('a');        
        this.add(mAyuda);
        ImageIcon pAyuda= new ImageIcon(getClass().getResource("/img/help.png"));
        mAyuda.setIcon(new ImageIcon(pAyuda.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a Ayuda
        miConfiguracion = new JMenuItem("Configuraciones");
        miConfiguracion.setActionCommand("Config");        
        miConfiguracion.setMnemonic('c');
        mAyuda.add(miConfiguracion);
        miConfiguracion.setVisible(true);
        ImageIcon mConfiguraciones= new ImageIcon(getClass().getResource("/img/setings.png"));
        miConfiguracion.setIcon(new ImageIcon(mConfiguraciones.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a Ayuda
        miInfo = new JMenuItem("Informacion");
        miInfo.setActionCommand("infoSystem");  
        miInfo.setMnemonic('n');
        mAyuda.add(miInfo);
        miInfo.setVisible(true);
        ImageIcon mInfo= new ImageIcon(getClass().getResource("/img/info.png"));
        miInfo.setIcon(new ImageIcon(mInfo.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
        //submenu pertenece a Ayuda
        miAbout = new JMenuItem("acerca de");
        miAbout.setActionCommand("about");        
        miAbout.setMnemonic('d');
        mAyuda.add(miAbout);
        miAbout.setVisible(true);
        ImageIcon mAbout= new ImageIcon(getClass().getResource("/img/about.png"));
        miAbout.setIcon(new ImageIcon(mAbout.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH))); 
    // </editor-fold>   
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        miCalcular.addActionListener(pAL);
        miBorrar.addActionListener(pAL);
        miSalir.addActionListener(pAL);
        miConfiguracion.addActionListener(pAL);
        miInfo.addActionListener(pAL);
        miAbout.addActionListener(pAL);
        miImprecion.addActionListener(pAL);
    }
    
    public void desactivarOperaciones()
    {
        miCalcular.setVisible(false);
        miBorrar.setVisible(false);
        miSalir.setVisible(false);
    }
    
    public void activarOperaciones()
    {
        miCalcular.setVisible(true);
        miBorrar.setVisible(true);
        miSalir.setVisible(true);
    }
}
