package PlayerTracker;

/*
 * CSCI 1110
 * @author Guillaume Robert
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerTracker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get the input for public charm
        int charm = in.nextInt();

        String playerName = null;
        //create an array list of charm and player
        ArrayList<Charm> charms = new ArrayList<Charm>();
        ArrayList<Player> players = new ArrayList<Player>();
        for (int i = 0; i < charm; i++) {
            String id = in.next();
            int locationX = in.nextInt();
            int locationY = in.nextInt();
            int effect = in.nextInt();
            String charmText = in.nextLine();

            charms.add(new Charm(id, locationX, locationY, effect, charmText));
        }

            //get the input of player
        int playerTracked = in.nextInt();
        for (int i = 0; i < playerTracked; i++) {
            playerName = in.next();
            int dx = in.nextInt();
            int dy = in.nextInt();
            players.add(new Player(playerName, dx, dy));
        }

        int moveNo = in.nextInt();
        for (int i = 0; i < moveNo; i++) {
            String name1 = in.next();
            //if the player is the same with the player to be tracked
                for (int j = 0; j < playerTracked; j++) {
                    if (players.get(j).getName().equals(name1)) {
                        int dx = in.nextInt();
                        int dy = in.nextInt();
                        players.get(j).move(dx, dy);

                        //write code to check other players if they are in the same location
                        for(int a=0; a<playerTracked; a++) {
                          if(a!=j && players.get(j).inSameLocation(players.get(a))) {
                              players.get(j).charmPlayer(players.get(a));
//                              players.get(a).charmPlayer(players.get(j));
                          }
                        }



                        //check if the players are in the same location add charm adjust the health and remove th health
                        for(int k=0; k<charms.size(); k++){
                            if(players.get(j).inSameLocation(charms.get(k))){
                                players.get(j).addCharm(charms.get(k));
                                players.get(j).adjustHealth(charms.get(k).getEffect());
                                charms.remove(k);
                                k--;

                            }
                        }

                        //get the health of the player
                        players.get(j).getHealth();
                }
            }
        }
        //print out the output
        for (Player p: players) {
            System.out.print(p);
        }

    }

}

