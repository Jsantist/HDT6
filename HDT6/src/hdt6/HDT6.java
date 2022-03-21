/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hdt6;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author jsken
 */
public class HDT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("prueba definitiva");
        
        File Archivo;
        Archivo = new File("ListadoProducto.txt");
        Datos dat = new Datos();
        
        System.out.println("Bienvenido a la tiendita online ");
        //si no existe ningún archivo, este lo crea. De lo contrario procede a operar
        if (!Archivo.exists()){
            try{
                Archivo.createNewFile();
                System.out.println("Al parecer no hay inventario, por favor ingrese uno nuevo ");
                dat.newOperation(Archivo);
                dat.leerOperaciones(Archivo);
                
            }catch(IOException ex){
                System.out.println(ex);
            }
        }else{
            dat.leerOperaciones(Archivo);
        }
    }
    
}
