package pod8;
/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;


public class Fruit implements Comparable<Fruit>
{
    //attributes
    protected String name = null;
    protected String colour = null;
    protected double weight = 0;

    //constructor
    public Fruit(String name, String colour, double weight)
    {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }

    //Getters
    public String getName(){return name;}
    public String getColour(){return colour;}
    public double getWeight(){return weight;}

    //Setters
    public void setName(String name){this.name = name;}
    public void setColour(String colour){this.colour = colour;}
    public void setWeight(double weight){this.weight = weight;}


    public String toString()
    {
        String fruitDetails = name+" (colour: "+colour+", weight: "+weight+")";

        return fruitDetails;
    }

    // Write the compareTo method here!
// WRITE YOUR CODE HERE
    @Override
    public int compareTo(Fruit o) {
        if(weight==getWeight()){
            return 0;
        }
        if(getWeight()>1){
            return 1;
        }
        else {
            return -1;
        }
    }
}

