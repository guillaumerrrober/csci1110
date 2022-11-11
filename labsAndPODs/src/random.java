import java.util.Random;

public class random {
    public static void main(String[] args) {
        String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString="";
        int length = 5;

        Random rand =new Random();
        char[] text=new char[length];

        for(int i=0; i<length; i++){
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }
        for(int i=0; i<text.length; i++){
            randomString+=text[i];
        }
        System.out.println(randomString);
    }
}
