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

/**
 *
 * @author jsken
 */
public class Datos {
    FileReader leer;
    FileWriter escribir;
    PrintWriter linea;
    BufferedReader almacenamiento;
    
    public void newOperation(File datos) throws IOException{
        //método para ingresar una nueva operación en caso de que no exista ninguna 
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        escribir= new FileWriter(datos,true);
        linea = new PrintWriter(escribir);
        
        System.out.println("Ingrese una operacion");
        String cadena= br.readLine();
        
        
        linea.println(cadena);
       
        linea.close();
        escribir.close();
        
    }
    
    public void leerOperaciones(File Datos) throws IOException{
        //método para leer todas las operaciones dentro del archivo
        String caracter="",cadena;
        int cont=0;
        Datos = new File("datos.txt");
        leer = new FileReader(Datos);
        almacenamiento = new BufferedReader(leer);
        
         while (caracter!= null){
             cont = cont+1;
             caracter=almacenamiento.readLine();
             cadena=caracter;
         }
        
    }
}
