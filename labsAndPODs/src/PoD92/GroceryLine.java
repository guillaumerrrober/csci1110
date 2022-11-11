package PoD92;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.beans.PersistenceDelegate;
import java.util.*;

public class GroceryLine
{
    //attributes
    protected LinkedList<Person> groceryLine = new LinkedList<Person>();

    //PLEASE FINISH THIS CLASS HERE
    //===============================================

    //constructor
// WRITE YOUR CODE HERE
    public  GroceryLine(){

    }

    // method: nextCustomer()
    // @returns Person
    // Next (first) customer in the line goes is called to the cashier
// WRITE YOUR CODE HERE
    public Person nextCustomer(){
        return  groceryLine.removeFirst();
    }
    // method: newCustomer(Person)
    // @params Person
    // @returns void
    // A new customer (Person) joins the end of the line.
// WRITE YOUR CODE HERE
    public void newCustomer(Person  person){
        groceryLine.add(person);
    }
    // method: newCashier()
    // @returns person
    // A new cashier opens up. The last person in the line chooses to leave the current line.
// WRITE YOUR CODE HERE
    public Person newCashier(){
        return groceryLine.removeLast();
    }
    //===============================================
    //PLEASE END WORK HERE

    public String toString()
    {

        String lineMembers = "GROCERY LINE:\n";
        int lineCount = 0;

        for (Person person: groceryLine)
        {
            lineCount++;
            lineMembers += lineCount + ". " + person.toString();
        }
        return lineMembers;
    }
}
