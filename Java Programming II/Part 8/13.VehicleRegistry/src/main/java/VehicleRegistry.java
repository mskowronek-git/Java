
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!owners.containsKey(licensePlate)) {
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            return owners.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!owners.containsKey(licensePlate)) {
            return false;
        }
        owners.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for (LicensePlate plate : owners.keySet()) {
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        
        for (String owner : owners.values()) {
            if (printed.contains(owner)) {
                continue;
            } else {
                System.out.println(owner);
                printed.add(owner);
            }
            
        }
    }
    
    
}
