/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Cursor;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author USUARIO
 */
public class PanelBusqueda extends JPanel
{
//    ---------
//    Atributos
//    ---------
    public JTextField tfBusqueda;
    public PlaceHolder  miHolder; 
    public JButton btBusq;
    private TextAutoCompleter taLeenartxt;
//    private static final String RUTA = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\APP_ComponentesProductos\\src\\Datos\\autocompletarBusqueda.properties";
    private JComboBox cbTipoDeProducto;
    
//    ---------
//    Metodo constructor del panel
//    ---------    
    public PanelBusqueda() 
    {
//    ---------
//    Defini contenedor del panel y color
//    ---------
        this.setOpaque(false);
        setLayout(null);
        setBackground(Color.WHITE);
//    ---------
//    Texto
//    ---------
        tfBusqueda = new JTextField(); 
        taLeenartxt = new TextAutoCompleter(tfBusqueda);
//        miHolder = new PlaceHolder(tfBusqueda,"Ingrese el producto");
        tfBusqueda.setFont(new Font("Arial", 0, 16));
        tfBusqueda.setCaretColor(Color.red);
        tfBusqueda.setSelectionColor(Color.blue);
        tfBusqueda.setBounds(30,19,230,22);
        add(tfBusqueda);
//    ---------
//    Botones
//    ---------        
        btBusq = new JButton("Buscar");
        btBusq.setBackground(new Color(18, 220, 15));
        btBusq.setBounds(260, 19, 90, 21);
        btBusq.setBorder(new BasicBorders.ButtonBorder(Color.green, Color.darkGray, Color.lightGray, Color.lightGray));
        btBusq.setCursor(new Cursor(12));
        btBusq.setFont(new Font("Arial", 0, 12));
        btBusq.setIcon(new ImageIcon(getClass().getResource("/img/lupa.png")));
        add(btBusq);
        btBusq.setActionCommand("buscar");
    }
    
    public String DAT()
    {
        return tfBusqueda.getText();
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btBusq.addActionListener(pAL);
    }
    public void BorrarB()
    {
        tfBusqueda.setText("");
//        miHolder = new PlaceHolder(tfBusqueda,"Ingrese el producto");
    }
    public void BaseDeDatosutocompletar()
    {
        try
        {
        Properties p = new Properties();
//        FileInputStream ar = new FileInputStream(RUTA);
        p.load(getClass().getResourceAsStream("/Datos/autocompletarBusqueda.properties"));
            for (int i = 0; i < p.size(); i++) 
            {
                taLeenartxt.addItem(p.getProperty(String.valueOf(i)));
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getCbTipoDeProducto()
    {
        return (String)cbTipoDeProducto.getSelectedItem();
    }
}
