/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

import java.util.Objects;

/**
 *
 * @author jsken
 */
public class TreeMapClass<K,V> implements IMap<K, V> {
    private int capacidad = 10;
    private MyMapBucket[] bucket;
    private int size = 0;

    public TreeMapClass() {
        this.bucket = new MyMapBucket[capacidad];
    }

    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % capacidad;
    }

    private MyKeyValueEntry getEntry(K key) {
        int hash = getHash(key);
        for (int i = 0; i < bucket[hash].getEntries().size(); i++) {
            MyKeyValueEntry myKeyValueEntry2 = bucket[hash].getEntries().get(i);
            if (myKeyValueEntry2.getKey().equals(key)) {
                return myKeyValueEntry2;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        if (containsKey(key)) {
            MyKeyValueEntry entry = getEntry(key);
            entry.setValue(value);
        } else {
            int hash = getHash(key);
            if (bucket[hash] == null) {
                bucket[hash] = new MyMapBucket();
            }
            bucket[hash].addEntry(new MyKeyValueEntry<>(key, value));
            size++;
        }
    }

    public V get(K key) {
        return containsKey(key) ? (V) getEntry(key).getValue() : null;
    }

    public boolean containsKey(K key) {
        int hash = getHash(key);
        return !(Objects.isNull(bucket[hash]) || Objects.isNull(getEntry(key)));
    }

    public void delete(K key) {
        if (containsKey(key)) {
            int hash = getHash(key);
            bucket[hash].removeEntry(getEntry(key));
            size--;
        }
    }

    public int size() {
        return size;
    }
}
