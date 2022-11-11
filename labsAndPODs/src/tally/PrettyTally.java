package tally;

public class PrettyTally {
    protected String next;
    protected int count=0;
    //constructor
    public PrettyTally(String next)
    {
        this.next=next;
        this.count=0;
    }

    public void increment()
    {
        this.count++;
    }
    public void decrement() {
        this.count--;
    }
    public int get()
    {
        return this.count;
    }
    public String toString() {
        return get()+next;
    }
}
