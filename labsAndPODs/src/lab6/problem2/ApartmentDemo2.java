package lab6.problem2;

import java.util.Scanner;
public class ApartmentDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Apartment home1 = new Apartment(in.next(), in.next(), in.nextInt());
        Apartment home2 = new Apartment(in.next(), in.next(), in.nextInt());
        System.out.println(home1.toString(home1.getName(), home1.getStreet(), home1.getUnits()));
        System.out.println(home2.toString(home2.getName(), home2.getStreet(), home2.getUnits()));

        if(home1.moreUnits(home1.getUnits())){
            System.out.println(home2.toString(home2.getName(), home2.getStreet(), home2.getUnits()));
        }
    }
}
