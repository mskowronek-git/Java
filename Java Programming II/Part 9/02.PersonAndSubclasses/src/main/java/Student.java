/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Student extends Person{
    private int studentCredits;

    public Student(String name, String address) {
        super(name, address);
        this.studentCredits = 0;
    }
    
    public void study() {
        this.studentCredits++;
    }
    
    public int credits() {
        return this.studentCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
