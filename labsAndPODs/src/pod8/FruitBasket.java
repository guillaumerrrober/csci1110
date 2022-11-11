package pod8;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;

public class FruitBasket
{
    //attributes
    protected ArrayList<Fruit> basket = new ArrayList<Fruit>();

    //constructor
    public FruitBasket(){}

    //Setters
    public void addFruit(Fruit fruitToAdd)
    {
        this.basket.add(fruitToAdd);
    }

    public String toString()
    {
        String basketContents = "FRUIT BASKET:\n";
        for (Fruit fruit: basket)
        {
            basketContents += fruit.toString()+"\n";
        }

        return basketContents;
    }
}
