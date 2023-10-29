
import java.util.ArrayList;
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
public class Employees {
    private List<Person> listEmployees;

    public Employees() {
        this.listEmployees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.listEmployees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.listEmployees.add(person);
        }
    }
    
    public void print() {
        Iterator<Person> iterator = listEmployees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }        
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = listEmployees.iterator();
        
        while (iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if (currentPerson.getEducation() == education) {
                System.out.println(currentPerson.toString());
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = listEmployees.iterator();
        List<Person> personsToRemove = new ArrayList<>();
        
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
