/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author jsken
 */
public class FactoryMap {
    
    
    public IMap<String, List<String>> getMap(int implementacion) throws IOException {
        
        IMap<String, List<String>> myMap;

        switch (implementacion) {
            case 1:
                // HashMap
                myMap = new HashMap<String, List<String>>();
            case 2:
                // TreeMap
                myMap =  new TreeMap<String, List<String>>();
            case 3:
                // LinkedHashMap
                myMap =  new LinkedHashMap<String, List<String>>();
            default:
                myMap = null;
                break;     
            return myMap;
        }

        return null;
    }
   
}
