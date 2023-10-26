
import java.util.HashMap;
import java.util.Map;
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
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> productPrice;

    public Warehouse() {
        this.products = new HashMap<>();
        this.productPrice = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.products.put(product, stock);
        this.productPrice.put(product, price);
    }
    
    public int price(String product) {
        if (productPrice.containsKey(product)) {
            return this.productPrice.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product) {
        if (products.containsKey(product)) {
            return this.products.get(product);
        }
        
        return 0;        
    }
    
    public boolean take(String product) {
        if (!products.containsKey(product)) {
            return false;
        }
        
        if (this.products.get(product) > 0) {
            int newStock = this.products.get(product) - 1;
            this.products.put(product, newStock);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }
    
    
}
