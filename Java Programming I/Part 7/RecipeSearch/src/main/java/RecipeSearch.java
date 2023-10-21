
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        ArrayList<Recipe> recipes = createRecipes(fileName);
        
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

            while (true) {
                System.out.println("Enter command: ");
                String command = scanner.nextLine().toLowerCase();
                
                if (command.equals("list")) {
                    System.out.println("Recipes:");
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe.toString());
                    }
                }
                
                if (command.equals("stop")) {
                    break;
                }
                
                if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String word = scanner.nextLine();
                    System.out.println("Recipes:");
                    
                    for (Recipe recipe : recipes) {
                        if (recipe.getName().contains(word)){
                            System.out.println(recipe.toString());
                        }
                    }
                }

                if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    int maxTime = Integer.valueOf(scanner.nextLine());
                    System.out.println("Recipes:");
                    
                    for (Recipe recipe : recipes) {
                        if (recipe.getTime() <= maxTime){
                            System.out.println(recipe.toString());
                        }
                    }
                }

                if (command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    System.out.println("Recipes:");
                    
                    for (Recipe recipe : recipes) {
                        if (recipe.getIngredients().contains(ingredient)){
                            System.out.println(recipe.toString());
                        }
                    }
                }                
            }
    }
    
    public static ArrayList<Recipe> createRecipes(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try (Scanner scanFile = new Scanner(Paths.get(fileName))) {

            while (scanFile.hasNextLine()) {
                String name = scanFile.nextLine();
                
                int time = Integer.valueOf(scanFile.nextLine());
                
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanFile.hasNextLine()) {
                    String ingredient = scanFile.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    ingredients.add(ingredient);
                }
                
                Recipe newRecipe = new Recipe(name, time, ingredients);
                recipes.add(newRecipe);
                
            }
            
            return recipes;
            
        }   catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return null;
        }        
    }

}
