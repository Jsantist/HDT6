/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author jsken
 */
public class FactoryMap {
    public IMap<String, List<String>> getMap(Integer implementacion) {

        if (implementacion.equals(1)) { // HashMap
            return (IMap<String, List<String>>) new HashMap<String, List<String>>();

        } else if (implementacion.equals(2)) { // TreeMap
            return (IMap<String, List<String>>) new TreeMap<String, List<String>>();

        } else if (implementacion.equals(3)) { // LinkedHashMap
            return (IMap<String, List<String>>) new LinkedHashMap<String, List<String>>();

        }

        return null;
    }
   
}
