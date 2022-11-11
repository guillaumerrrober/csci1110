import java.util.ArrayList;
import java.util.Scanner;

public class QuestTester {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //create an arraylist for list of relics and characters
        ArrayList<Relic> relics=new ArrayList<Relic>();
        ArrayList<Character> characters=new ArrayList<Character>();

        //input for relic
        int noOfRelic= in.nextInt();
        for (int i=0; i<noOfRelic; i++) {
            String id = in.next();
            int availability = in.nextInt();
            int locationX = in.nextInt();
            int locationY = in.nextInt();
            int xDest = in.nextInt();
            int yDest = in.nextInt();
            relics.add(new Relic(id, availability, locationX, locationY, xDest, yDest));
        }

        //input for the character
        int speed=0;
        int noOfCharacter=in.nextInt();
        for(int i=0; i<noOfCharacter; i++){
            String name=in.next();
            String tribe=in.next();

            //each tribe has its own space that is speed that it can move
            if(tribe.equals("dwarf")){
                speed=1;
            }else if(tribe.equals("elf")){
                speed=2;
            }else if(tribe.equals("gnome")){
                speed=3;
            }
            int x=in.nextInt();
            int y = in.nextInt();
            int xDest= in.nextInt();
            int yDest= in.nextInt();

            //check for the player playing
            if(tribe.equals("elf")) {
                characters.add(new Elf(name, x, y, speed, xDest, yDest));
            }else if(tribe.equals("gnome")) {
                characters.add(new Gnome(name, x, y, speed, xDest, yDest));
            }else if(tribe.equals("dwarf")) {
                characters.add(new Dwarf(name, x, y, speed, xDest, yDest));
            }
        }


        //create a boolean to be true;
        boolean playersCanMove = true;
        while(playersCanMove){
            //move character
            for(Character c: characters){
                if(c.x!= c.xDest|| c.y!=c.yDest) {
                    c.move();
                    for(Guide g: c.collection) {
                        if (c.x == g.xDest && c.y == g.yDest) {
                            g.setVisited(true);
                        }
                    }
                    for (int i = 0; i < relics.size(); i++) {
                        if (relics.get(i).isHere(c.x, c.y)) {
                            if (relics.get(i).collect()) {
                                //collect the relics if
                                c.addGuide(relics.get(i));
                                //update the destination if gotten to the destination

                            }
                        }
                    }

                }
                else {
                    for(Guide g: c.collection) {
                        if (c.xDest == g.xDest && c.yDest == g.yDest) {
                            g.setVisited(true);
                        }
                    }

                }
                c.update();
                //this is to get advise from the
                for(Character d:characters) {
                    if(!c.equals(d)) {
                        if (c.inSameLocation(d)) {
                            c.advise(d);
                        }
                    }
                }

                System.out.println(c.getCharacter());

            }

            //if there is a player that can move then the loop continue
            playersCanMove=false;
            for(Character c:characters) {

                if(c.x!= c.xDest|| c.y!=c.yDest){
                    playersCanMove=true;
                }
                for(Guide g:c.collection){
                    if(g instanceof Relic){
                        if(!g.hasVisited()){
                            playersCanMove=true;
                        }
                    }
                }
            }
        }
        System.out.println("Quest completed.");


    }
}
