package POD93;

/**
 * CSCI 1110
 * @author ASiegel
 */

import java.util.*;


public class MarketTable
{
    //attributes
    protected String name = null;
    protected String tableType = null;

    //constructor
    public MarketTable(String name, String type)
    {
        this.name = name;
        this.tableType = type;
    }

    public String toString()
    {
        String tableDetails = name+" ("+tableType+")";
        return tableDetails;
    }

    public boolean equals(MarketTable comparisonTable)
    {
        boolean sameTable = false;

        if ((this.name.equals(comparisonTable.name))
                && (this.tableType.equals(comparisonTable.tableType)))

        {
            sameTable = true;
        }

        return sameTable;
    }

}


