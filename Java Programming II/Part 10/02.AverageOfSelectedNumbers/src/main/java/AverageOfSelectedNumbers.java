
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input numbers, type \"end\" to stop.");       
        List<Integer> inputs = new ArrayList<>();
        
        while (true) {
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            inputs.add(Integer.valueOf(command));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choise = scanner.nextLine();
        if (choise.equals("n")) {
            System.out.println("Average of the negative numbers: " + inputs.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + inputs.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }

    }
}
