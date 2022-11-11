package PlayerTracker;

public class Charm  {
    private String id;
    private int locationX;
    private int locationY;
    private int effect;
    private String charmText;

    //constructor
    public Charm(String id, int locationX, int locationY, int effect, String charmText ){
        this.id=id;
        this.locationX=locationX;
        this.locationY=locationY;
        this.effect=effect;
        this.charmText=charmText;
    }
    public boolean isHere(int locationX, int locationY){
        //return true if charm location is same as charm location
        return this.locationX==locationX && this.locationY==locationY;
    }
    public boolean isSameId(Charm charm){
        //return true by checking  if the id is the same
        return id.equals(charm.getId());
    }
    public int getEffect(){
        //return the effect of the charm
        return effect;
    }
    public String toString(){
        //return the Charm object that is
        return id+" ("+locationX+","+locationY+") "+effect+" "+charmText;
    }

        //create a getter to get id to check if they are the same
    public String getId() {
        return id;
    }


}
