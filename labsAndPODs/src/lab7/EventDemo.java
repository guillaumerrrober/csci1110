package lab7;

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            String type = in.next();
            double price = in.nextDouble();
            Event event=new Event(type, price);

            int sale=in.nextInt();
            //Event sales=new Event(sales);

            System.out.println(event.toString());

    }
}
