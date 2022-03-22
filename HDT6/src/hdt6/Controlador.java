/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jsken
 */
public class Controlador<T> {
    FileReader leer;
    FileWriter escribir;
    PrintWriter linea;
    BufferedReader almacenamiento;
    
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    
    private FactoryMap factoryMap = new FactoryMap();
    private IMap<String, List<String>> collection;
    private IMap<String, List<String>> inventary;
    private List<String> categories = new ArrayList<String>();
    
    
    public void leerOperaciones(File Datos) throws IOException{
        //método para leer todas las operaciones dentro del archivo
        String caracter="",cadena;
        int cont=0;
        Datos = new File("ListadoProducto.txt");
        leer = new FileReader(Datos);
        almacenamiento = new BufferedReader(leer);
        
         while (caracter!= null){
             cont = cont+1;
             caracter=almacenamiento.readLine();
             cadena=caracter;
             String[] products = cadena.replace("|", ",").split(",");
                String category = products[0].trim().toUpperCase();
                String product = products[1].trim();

                try {

                    // Revisa si existe la categoria, si no existe la crea
                    if (inventary.get(category) != null) { // Existe la categoria

                        List<String> currentList = inventary.get(category);
                        currentList.add(product);
                        inventary.put(category, currentList);

                    } else { // No existe la categoria

                        List<String> newList = new ArrayList<String>();
                        newList.add(product);
                        inventary.put(category, newList);
                        categories.add(category);

                    }

                } catch (Exception e) {
                    System.out.println("[!] Error al agregar producto al inventario");
                }
             
         }
        
    }
    
    
    public void Factory() throws IOException{
        System.out.println(" :: TIENDA ONLINE ::");

        // Implementar patron de diseño Factory para seleccionar que tipo de MAP
        // utilizara
        System.out.println("Ingrese que MAP implementara: ");
        System.out.println("1. HashMAP");
        System.out.println("2. TreeMAP");
        System.out.println("3. LinkedHashMap");
        Integer optionMAP = Integer.parseInt(br.readLine());

        // Instanciar el tipo de MAP que se utilizara
        collection = factoryMap.getMap(optionMAP);
        inventary = factoryMap.getMap(optionMAP);
        
    }
    
    
    
}
