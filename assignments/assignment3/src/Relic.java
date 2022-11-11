public class Relic extends Guide {
    protected int available;
    protected int x;
    protected int y;


    //constructor
    public Relic(String id, int available, int x, int y, int xDest, int yDest) {
        super(id, xDest, yDest);
        this.available=available;
        this.x=x;
        this.y=y;
        this.xDest=xDest;
        this.yDest=yDest;
    }

    //check if relic object is in the same location
    public boolean isHere(int x, int y){
        return this.x==x && this.y==y;
    }

    //if relic is available decrement availability and return true else false
    public boolean collect(){
        if(available==0){
            return false;
        }
        else {
            available--;
            return true;
        }
    }
    //if there is available
    public boolean isAvailable(){
        return available!=0 ;
    }

    //create the Relic relic constructor
    public Relic(Relic relic) {
        super(relic.id, relic.xDest, relic.yDest);
        x= relic.x;
        y=relic.y;
    }


    //create the clone method that overrides other subclasses
    @Override
    public Guide clone(){
        Guide cloned = new Relic(id, available, x, y, xDest, yDest);
        return cloned;
    }

}

