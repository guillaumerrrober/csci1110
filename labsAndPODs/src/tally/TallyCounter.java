package tally; /**
 * CSCI 1110
 * @author ASiegel
 */


import java.util.*;

public class TallyCounter {

    protected int count=0;

    //constructor
    public TallyCounter()
    {
        this.count = 0;
    }

    public void increment()
    {
        this.count++;
    }

    public int get()
    {
        return this.count;
    }
}