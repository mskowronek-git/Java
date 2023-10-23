
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString(); //To change body of generated methods, choose Tools | Templates.
    }  
    
    public double maxValue() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double max = 0.0;
        
        for (Double amount : history) {
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }
    
    public double minValue() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double min = this.history.get(0);
        
        for (Double amount : history) {
            if (amount < min) {
                min = amount;
            }
        }
        return min;
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        int count = 0;
        
        for (Double amount : history) {
            sum += amount;
            count++;
        }
        return sum/count;
    }
}
