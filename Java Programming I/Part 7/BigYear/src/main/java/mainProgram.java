
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine().toLowerCase();
            
            if (command.equals("add")) {
                birds.add(add(scan));
            }
            
            if (command.equals("quit")) {
                break;
            }
            
            if (command.equals("observation")) {
                observation(scan, birds);
            }
            
            if (command.equals("all")) {
                showAll(birds);
            }
            
            if (command.equals("one")) {
                showOne(scan, birds);
            }
        }

    }
    
    public static Bird add(Scanner scan) {
        System.out.println("Name: ");
        String name = scan.nextLine();
        
        System.out.println("Name in Latin: ");
        String latinName = scan.nextLine();
        
        return new Bird(name, latinName);
    }

    public static void observation(Scanner scan, ArrayList<Bird> birds) {
        System.out.println("Bird? ");
        String name = scan.nextLine();
        
        boolean flag = true;
        
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                flag = false;
            }
        }
        
        if (flag) {
            System.out.println("Not a bird!");
        }
    }
    
    public static void showAll(ArrayList<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
    
    public static void showOne(Scanner scan, ArrayList<Bird> birds) {
        System.out.println("Bird? ");
        String name = scan.nextLine();
        
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird.toString());
            }
        }
    }    

}
