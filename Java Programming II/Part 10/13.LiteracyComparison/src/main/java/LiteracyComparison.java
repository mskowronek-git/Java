
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Country(parts[0].trim(), parts[1].trim(), parts[2].replace("(%)", "").trim(), parts[3].trim(), Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(country -> countries.add(country));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        countries.stream().sorted((p1, p2) -> {
            return Double.compare(p1.getLiteracyPer(), p2.getLiteracyPer());
        }).forEach(p -> System.out.println(p.getName() + " (" + p.getYear() + "), " + p.getGender() +", " + p.getLiteracyPer()));
    }
}
