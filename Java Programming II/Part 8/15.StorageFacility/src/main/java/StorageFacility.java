
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());
        
        this.units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if (this.units.get(storageUnit).isEmpty()) {
            this.units.remove(storageUnit);
        } else {
            this.units.get(storageUnit).remove(item);
            if (this.units.get(storageUnit).isEmpty()) {
                this.units.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        
        Set<String> unitsKeys = this.units.keySet();
        
        for (String key : unitsKeys) {
            if (!this.units.get(key).isEmpty()) {
                unitsWithItems.add(key);
            }
        }
        
        return unitsWithItems;
    }
    
    
}
