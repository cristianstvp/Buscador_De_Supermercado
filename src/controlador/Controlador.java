package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Operaciones;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener 
{

    private VentanaPrincipal venPrin;
    private Operaciones modelOp;

    public Controlador(VentanaPrincipal pVenPrin, Operaciones pModelOp) {
        this.venPrin = pVenPrin;
        this.modelOp = pModelOp;
        this.venPrin.miBienvenida.agregarOyentesBotones(this);
        this.venPrin.miBusqueda.agregarOyentesBotones(this);
        this.venPrin.miBarraMenu.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        if (comando.equals("buscar")) 
        {
            try 
            {
//                Captura de datos
                String A = venPrin.miBusqueda.DAT();
                modelOp = new Operaciones(A);
                modelOp.hallar();
                
                if(modelOp.getSal()==null)
                {
                    venPrin.miResultado.mostrarResultado("Error en la busqueda\nPrueba las palabras sugeridas");
                }
                else
                {
                    venPrin.miResultado.mostrarResultado("Buscando...\n" + modelOp.getSal());
                }
            } catch (Exception e) 
            {
                e.printStackTrace();
                venPrin.miResultado.Error();
            }
            finally
            {
                venPrin.miResultado.mostrarResultado("\nFIN DE LA BUSQUEDA\n\n");
            }
        }
//        Accion general Borrar
        if (comando.equals("borrar")) 
        {
            venPrin.miBusqueda.BorrarB();
            venPrin.miResultado.BorrarR();   
        }
//        MB.Salir
        if (comando.equals("salir")) 
        {
            System.exit(0);
        }
//        MB.Imprimir
        if (comando.equals("imprima")) 
        {
            venPrin.miResultado.imprimirResultado();//imprime el TextArea ejemplo

        }
//        MB.Diaog_Configuraciones
        if(comando.equals("Config"))
        {
            venPrin.Configuracion();
            this.venPrin.miDialogConfig.PanelConfg.agregarOyentesBotones(this);
        }
//        MB.Dialog.Config.Button_Acciones
        //Desactivar botones operacionales
        if(venPrin.miDialogConfig.PanelConfg.desactivarBotones()==true){
            venPrin.miBarraMenu.desactivarOperaciones();
        }else{
            venPrin.miBarraMenu.activarOperaciones();
        }
        //Desactivar reloj
        if (venPrin.miDialogConfig.PanelConfg.desactivarReloj()==true) {
            venPrin.miBienvenida.descativarReloj();
        }else{
            venPrin.miBienvenida.activarReloj();
        }
//        MB_Acerca de
        if(comando.equals("about"))
        {
            venPrin.DialogoAbout();
        }
//        MB_INformación
        if(comando.equals("infoSystem"))
        {
            
        }
    }
}
