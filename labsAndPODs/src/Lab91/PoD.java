package Lab91;

/**
 * CSCI 1110
 * @author YourName
 */

import java.util.*;

public class PoD
{

    public static void main( String [] args ) {

        Scanner in = new Scanner( System.in );

        FruitBasket fruitBasket = new FruitBasket();


        while(in.hasNextLine())
        {
            String line = in.nextLine();
            String[] fruitDetails = line.split(" ");

            Fruit nextFruit = new Fruit(fruitDetails[0],fruitDetails[1]);
            fruitBasket.addFruit(nextFruit);
        }

        System.out.println(fruitBasket);

        System.out.println("--- FRUIT TO EAT ---");
        Fruit fruitToBeEaten = fruitBasket.takeLastFruit();
        System.out.println(fruitToBeEaten);
        System.out.println();

        System.out.println("--- FRUIT REMAINING ---");
        System.out.println(fruitBasket);



        in.close();
        System.out.print("END OF OUTPUT");
    }
}


