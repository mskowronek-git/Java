
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Herd implements Movable{
    
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String herdPrint = "";
        
        for (Movable animal : this.herd) {
            herdPrint += animal.toString() + "\n";
        }

        return herdPrint;
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    
    @Override
    public void move(int dx, int dy) {
        for (Movable animal : this.herd) {
            animal.move(dx, dy);
        }
    }
    
}
