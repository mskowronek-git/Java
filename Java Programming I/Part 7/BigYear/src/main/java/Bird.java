
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Bird {
    private String name;
    private String latinName;
    private int timesSeen;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.timesSeen = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getTimesSeen() {
        return timesSeen;
    }
    
    public void addObservation() {
        this.timesSeen++;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.timesSeen + " observations";
    }
    
    
}
