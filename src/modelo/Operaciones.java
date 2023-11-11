/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author USUARIO
 */
public class Operaciones
{
//    private static final String RUTA = "C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\APP_ComponentesProductos\\src\\Datos\\Productos.properties";
    private String Ent;
    private String Sal;
    
    public Operaciones(String pEnt)
    {
        this.Ent=pEnt;
    }
    
    public void hallar()
    {
        try
        {
            Properties p = new Properties();
//            FileInputStream ar = new FileInputStream(RUTA);
            p.load(getClass().getResourceAsStream("/Datos/Productos.properties"));
            
            if(Ent.endsWith("Coca Cola")){
                Sal=p.getProperty("CocaCola");
            }
            if(Ent.endsWith("Aceite Vegetal")){
                Sal=p.getProperty("AceiteVegetal");
            }
            if(Ent.endsWith("Atún")){
                Sal=p.getProperty("Atún");
            }
            if(Ent.endsWith("Arroz")){
                Sal=p.getProperty("Arroz");
            }
            if(Ent.endsWith("Azúcar")){
                Sal=p.getProperty("Azúcar");
            }
            if(Ent.endsWith("Café")){
                Sal=p.getProperty("Café");
            }
            if(Ent.endsWith("Carne Enlatada")){
                Sal=p.getProperty("CarneEnlatada");
            }
            if(Ent.endsWith("Frijol")){
                Sal=p.getProperty("Frijol");
            }
            if(Ent.endsWith("Leche")){
                Sal=p.getProperty("Leche");
            }
            if(Ent.endsWith("Maíz Enlatado")){
                Sal=p.getProperty("MaízEnlatado");
            }
            if(Ent.endsWith("Manteca")){
                Sal=p.getProperty("Manteca");
            }
            if(Ent.endsWith("Miel")){
                Sal=p.getProperty("Miel");
            }
            if(Ent.endsWith("Lentejas")){
                Sal=p.getProperty("Lentejas");
            }
            if(Ent.endsWith("Pan")){
                Sal=p.getProperty("Pan");
            }
            if(Ent.endsWith("Pastas")){
                Sal=p.getProperty("Pastas");
            }
            if(Ent.endsWith("Pollo")){
                Sal=p.getProperty("Pollo");
            }
            if(Ent.endsWith("Sal De Mesa")){
                Sal=p.getProperty("SalDeMesa");
            }
            if(Ent.endsWith("Tomates Enlatados")){
                Sal=p.getProperty("TomatesEnlatados");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public String getSal()
    {
        return this.Sal;
    }
}
