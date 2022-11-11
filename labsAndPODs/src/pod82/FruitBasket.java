package pod82;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;

public class FruitBasket
{
// WRITE YOUR CODE HERE

    ArrayList<Fruit> basket=new ArrayList<Fruit>();

    public FruitBasket() {

    }

    public void addFruit(Fruit fruit){
        basket.add(fruit);
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

