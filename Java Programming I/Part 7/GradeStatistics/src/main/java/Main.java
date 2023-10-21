
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter point totals, -1 stops:");
        Grades grades = new Grades();
        
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            
            if (grade == -1) {
                break;
            }
            
            grades.add(grade);
        }
        
        System.out.println("Point average (all): " + grades.average());
        System.out.println(grades.averagePassing());
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:\n" + grades.gradeDistribution());
    }
}
