package POD93;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;

public class PoD
{

    public static void main( String [] args ) {

        Scanner in = new Scanner( System.in );

        //PLEASE START WORK HERE
        //==============================================

        HashSet<String> marketTables=new HashSet<>();
        while (in.hasNextLine()){
            String[] line= in.nextLine().split(",");

            marketTables.add(line[1]);
        }

// WRITE YOUR CODE HERE

        //===============================================
        //PLEASE END WORK HERE

        ArrayList<String> saleItems = new ArrayList<>();
        saleItems.add("fruit");
        saleItems.add("vegetables");
        saleItems.add("meats");
        saleItems.add("cheeses");
        saleItems.add("prepared foods");

        System.out.println(marketTables);


        boolean goodMarket = false;

        if (marketTables.containsAll(saleItems))
        {
            goodMarket = true;
        }

        if (goodMarket)
        {
            System.out.println("This is a good market!");
        }
        else
        {
            System.out.println("This market may not have everything that you need.");
        }

        in.close();
        System.out.print("END OF OUTPUT");
    }


}
