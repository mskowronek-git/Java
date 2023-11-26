
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        
        Random rand = new Random();
        while (this.numbers.size() < 7) {
            int randNumber = rand.nextInt(40) + 1;
            boolean numberWasAlreadyDrawn = this.containsNumber(randNumber);
            
            if (!numberWasAlreadyDrawn) {
                this.numbers.add(randNumber);
            }           
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

