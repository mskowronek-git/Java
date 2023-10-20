
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
public class Grades {
    private ArrayList<Integer> gradesList;

    public Grades() {
        this.gradesList = new ArrayList<>();
    }
    
    public double average() {
        double sum = 0;
        double count = 0;
        
        for (int grade : gradesList) {
            sum += grade;
            count++;
        }
        
        return sum/count;
    }
    
    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.gradesList.add(grade);
        }
    }
    
    public String averagePassing() {
        double sum = 0;
        double count = 0;
        
        for (int grade : gradesList) {
            if (grade >= 50) {
                sum += grade;
                count++;               
            }
        }
        
        if (sum == 0) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + sum/count;        
    }
    
    public double passPercentage() {
        int passedCount = 0;
        
        for (int grade : gradesList) {
            if (grade >= 50) {
                passedCount++;
            }
        }
        
        return 100.0*passedCount/this.gradesList.size();
    }
    
    public String gradeDistribution() {
        String five = "";
        String four = "";
        String three = "";
        String two = "";
        String one = "";
        String zero = "";
        
        for (int grade : this.gradesList) {
            if (grade < 50 && grade >= 0) {
                zero += "*";
            } else if (grade < 60 && grade >= 0) {
                one += "*";
            } else if (grade < 70 && grade >= 0) {
                two += "*";
            } else if (grade < 80 && grade >= 0) {
                three += "*";
            } else if (grade < 90 && grade >= 0) {
                four += "*";
            } else if (grade <= 100 && grade >= 0) {
                five += "*";
            }
        }
        
        return "5: " + five + "\n4: " + four + "\n3: " + three + "\n2: " + two + "\n1: " + one + "\n0: " + zero;
    }
    
    
    
    
}
