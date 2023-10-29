
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        
        Checker checker = new Checker();
        
        if(checker.isDayOfWeek(day)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
