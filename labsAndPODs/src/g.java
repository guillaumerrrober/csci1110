import java.util.Scanner;
public class g {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String Player=in.next();
        Player player1=new Player(Player);
        Player player2=new Player(Player);



        player1.setPosition(12);
        player2.setHasWon(true);

        System.out.println();
    }
}