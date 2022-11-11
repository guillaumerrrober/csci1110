import java.util.ArrayList;

abstract class Character {
    protected String name;
    protected int speed;
    protected int x;
    protected int y;
    protected int xDest;
    protected int yDest;



    ArrayList<Guide> collection=new ArrayList<Guide>();

    //Constructor
    public Character(String name, int x, int y, int speed, int xDest, int yDest){
        this.name=name;
        this.speed=speed;
        this.x=x;
        this.y=y;
        this.xDest=xDest;
        this.yDest=yDest;
    }

    //move character to destination
    public void move() {
        for(int i=0; i<speed; i++){
            int diffX=xDest-x;
            int diffY=yDest-y;
            if(diffX>0){
                x++;
            }
            else if(diffX<0){
                x--;
            }
            if(diffY>0){
                y++;
            }
            else if(diffY<0){
                y--;
            }
        }

    }

    //check if relic is at the same location
    public boolean inSameLocation(Relic relic){
        return relic.isHere(x, y);
    }

    //if there is no guide add to character collection and return true else false
    public boolean addGuide(Guide guide){
        if(!collection.contains(guide)){
            collection.add(guide.clone());
            return true;
        }
        else{
            return false;
        }

    }

    //collect and update the character's destination and return true
    public boolean update() {
        if (x == xDest && y == yDest) {
            for(Guide r: collection){
                if (!r.hasVisited()) {
                    this.xDest = r.xDest;
                    this.yDest = r.yDest;
                    break;
                }

            }

            if (this.x != xDest || y != yDest) {
                return true;
            } else {
                return false;

            }
        }else {
            return false;
        }

    }

    //return string containing the character name location and destination
    public String getCharacter(){
        String id="";
        for(int i=0; i<collection.size(); i++ ){
            id=id+collection.get(i).idToString()+" ";
        }
        return name+" ("+x+","+y+") ("+xDest+","+yDest+") "+id;
    }

    public boolean inSameLocation(Character character){
        return (character.x==this.x && character.y==this.y);

    }
    public abstract void advise(Character character);


    public abstract String getTribe();

}
