
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
public class BoxWithMaxWeight extends Box{
    private int maxweight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxweight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.weightOfItems() + item.getWeight() > this.maxweight) {  
            return;
        }
        
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();
        }
 
        return weight;
    }
}
