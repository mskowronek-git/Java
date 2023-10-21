
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Abbreviations {
    HashMap<String, String> abbreviations;

    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        explanation = sanitizedString(explanation);
        
        if (abbreviations.containsKey(abbreviation)) {
            System.out.println("There is already!");
        } else {
            abbreviations.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (abbreviations.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizedString(abbreviation);
        
        if (abbreviations.containsKey(abbreviation)) {
            return abbreviations.get(abbreviation);
        } else {
            return null;
        }
    }
    
    public String sanitizedString(String word) {
        return word.toLowerCase().trim();
    }
    
    
}
