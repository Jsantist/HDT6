/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

/**
 *
 * @author jsken
 */
public class MyKeyValueEntry <K, V>{
    private K key;
    private V value;

    public MyKeyValueEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // getters & setters
    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    
}
