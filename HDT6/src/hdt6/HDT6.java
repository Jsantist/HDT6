/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hdt6;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author jsken
 */
public class HDT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        File Archivo;
        Archivo = new File("ListadoProducto.txt");
        Controlador dat = new Controlador();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Bienvenido a la tiendita online ");
        
        
        dat.Factory();
        dat.leerOperaciones(Archivo);
        
        IMap<String, List<String>> inventario = dat.getInventary();
        IMap<String, List<String>> colleccion = dat.getCollection();
        
        boolean Terminar = true;

        OUTER:
        while (Terminar) {
            System.out.println("1. Agregar producto a la collecion");
            System.out.println("2. Mostrar categoria de un producto");
            System.out.println("3. Mostrar coleccion del usuario");
            System.out.println("4. Mostrar coleccion del usuario (Ordenados por categoria)");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Mostrar inventario (Ordenados por categoria)");
            System.out.println("7. Salir");
            Integer option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:
                    dat.addProductToCollection();
                    break;
                case 2:
                    dat.showCategoryOfAProduct();
                    break;
                case 3:
                    System.out.println("\n colección de usuario \n");
                    dat.showIMAP(colleccion, false);
                    break;
                case 4:
                    System.out.println("\n  colección ordenada por categoría \n");
                    dat.showIMAP(colleccion, true);
                    break;
                case 5:
                    System.out.println("\n Inventario \n");
                    dat.showIMAP(inventario, false);
                    break;
                case 6:
                    System.out.println("\n Inventario ordenado por categoría \n");
                    dat.showIMAP(inventario, true);
                    break;
                case 7:
                    Terminar = false;
                    System.out.println("Ha finalizado el programa exitosamente ");
                    break OUTER;
                default:
                    break;
            }
        }
        
    }
    
}
