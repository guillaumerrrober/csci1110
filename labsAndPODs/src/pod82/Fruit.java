package pod82;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;


public class Fruit
{
    //attributes
    protected String name = null;
    protected String colour = null;

    //constructor
    public Fruit(String name, String colour)
    {
        this.name = name;
        this.colour = colour;
    }

    //Getters
    public String getName(){return name;}
    public String getColour(){return colour;}

    //Setters
    public void setName(String name){this.name = name;}
    public void setColour(String colour){this.colour = colour;}


    public String toString()
    {
        String fruitDetails = name+" ("+colour+")";

        return fruitDetails;
    }
}



