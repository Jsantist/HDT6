/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt6;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jsken
 */
public class MyMapBucket {
    private List<MyKeyValueEntry> entries;

    public MyMapBucket() {
        if (entries == null) {
            entries = new LinkedList<>();
        }
    }

    public List<MyKeyValueEntry> getEntries() {
        return entries;
    }

    public void addEntry(MyKeyValueEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(MyKeyValueEntry entry) {
        this.entries.remove(entry);
    }
}
