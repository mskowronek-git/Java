
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
public class IOU {
    private HashMap<String, Double> sums;

    public IOU() {
        this.sums = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        sums.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return sums.getOrDefault(toWhom, 0.0);
    }
    
    
}
