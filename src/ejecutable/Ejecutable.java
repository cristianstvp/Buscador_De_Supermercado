/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutable;

import controlador.Controlador;
import modelo.Operaciones;
import vista.VentanaPrincipal;

/**
 *
 * @author USUARIO
 */
public class Ejecutable 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVenPrin = new VentanaPrincipal();
        Operaciones miModel = null;
        Controlador miControl = new Controlador(miVenPrin, miModel);
        miVenPrin.miBusqueda.BaseDeDatosutocompletar();
    }
}
