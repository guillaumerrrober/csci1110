package PlayerTracker;

import java.util.ArrayList;

public class Player {
    private String name;
    private int dX;
    private int dY;
    private int health;
        //create an arraylist for eachPlayer charm
    ArrayList<Charm> arrCharm;


    //constructor
    public Player(String name, int dX, int dY){
        this.name=name;
        this.dX=dX;
        this.dY=dY;
        this.health=100;
        arrCharm = new ArrayList<>();
    }


    public void setArrCharm(ArrayList<Charm> charm){
        for(int i = 0; i < charm.size(); i++){
            arrCharm.add(charm.get(i));
        }

    }
    public void move(int dX, int dY){
        //update x and y

        if(health>=1) {
            this.dX = this.dX + dX;
            this.dY = this.dY + dY;
            health--;
        }

    }
    public int getHealth(){
        return health;
    }
    public void adjustHealth(int diff){
        //add diff to players health
        health= getHealth()+diff;
    }

    public String getName() {
        return name;
    }
    public boolean inSameLocation(Charm charm){
        //making the charm compare with the player
        return charm.isHere(dX, dY);
    }
    //check for each two players are at the same location
    public boolean inSameLocation(Player players2){
        return dX== players2.dX&& dY==players2.dY;
    }
    public boolean addCharm(Charm charm){
        return  arrCharm.add(charm);
    }
    public String toString(){
        //return a string representing players object
        String ouput =  name+" ("+dX+","+dY+") "+ health+"\n";
        for (int i = 0; i < arrCharm.size(); i++){
            ouput +="+ "+arrCharm.get(i)+"\n";
        }
        return ouput;
    }

    public void charmPlayer(Player player){
        for (int c = 0; c < arrCharm.size(); c++) {
            //If playerAs charm doesnt contains arrCharm(c)
            if(!player.containsCharm(arrCharm.get(c))) {
                player.adjustHealth(arrCharm.get(c).getEffect());
            }
        }
    }
    public boolean containsCharm(Charm charm) {
        boolean charmSame = false;
        for (Charm c : arrCharm) {
            if (c.getId().equals(charm.getId())) {
                charmSame = true;
            }
        }

        return charmSame;
    }
}
