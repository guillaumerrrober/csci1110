package Lab91;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;
public class FruitBasket
{
    //PLEASE START WORK HERE
    //===============================================
LinkedList<Fruit> basket;
//constructor
    public FruitBasket(){
        basket = new LinkedList<Fruit>();
    }
    public void addFruit(Fruit fruit){
     basket.add(fruit);
    }
    public Fruit takeLastFruit(){
        Fruit fruit=basket.removeLast();
        return fruit;
    }


    //===============================================
    //PLEASE END WORK HERE

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
