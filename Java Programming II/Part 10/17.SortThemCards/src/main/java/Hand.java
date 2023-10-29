
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Hand implements Comparable<Hand>{
    private List<Card> cardsOnHand;

    public Hand() {
        this.cardsOnHand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cardsOnHand.add(card);
    }
    
    public void print() {
        Iterator<Card> iter = cardsOnHand.iterator();
        
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }
    
    public void sort() {
        Comparator<Card> comparator = Comparator
                    .comparing(Card::getValue)
                    .thenComparing(Card::getSuit);

        Collections.sort(cardsOnHand, comparator);
    }

    @Override
    public int compareTo(Hand comparedHand) {
        return this.sumValues(this) - sumValues(comparedHand);
    }
    
    public int sumValues(Hand hand) {
        int sum = 0;
        for (Card card : hand.cardsOnHand) {
            sum += card.getValue();
        }
        
        return sum;
    }
    
    public void sortBySuit() {
        Collections.sort(cardsOnHand, new BySuitInValueOrder()); 
    }
    
    
}
