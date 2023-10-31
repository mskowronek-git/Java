/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author micha
 */
public class TemperatureSensor implements Sensor{
    private boolean mode;

    public TemperatureSensor() {
        this.mode = false;
    }
    
    @Override
    public boolean isOn() {
        return this.mode;
    }

    @Override
    public void setOn() {
        this.mode = true;
    }

    @Override
    public void setOff() {
        this.mode = false;
    }

    @Override
    public int read(){
        if (this.mode) {
            return new Random().nextInt(61) - 30;
        } else {
            throw new IllegalStateException("Grade must be between 0 and 5."); 
        }
    }
    
    
}
