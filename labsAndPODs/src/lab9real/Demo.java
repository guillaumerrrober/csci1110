package lab9real;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contactNo = Integer.parseInt(in.next());
        AddressBook book=new AddressBook();
        for (int i = 0; i < contactNo; i++) {
            String lastName = in.next();
            String firstName = in.next();
            String streetName = in.next();
            String phoneNumber = in.next();
            Contact contact1 = new Contact(lastName, firstName, streetName, phoneNumber);
            book.add(contact1);
        }

        for(Contact b:book.getList()) {
            System.out.println(b);
        }
        System.out.println();

        String delLastName=in.next();
        System.out.println("Deleted contacts: "+book.deleteContact(delLastName));


        for(Contact b: book.getList()){
            System.out.println(b);
        }
        System.out.println();


        String newContact=in.next() + " " + in.next() + " " + in.next() + " " + in.next();
        String[] splitContact= newContact.split(" ");
        Contact contact=new Contact(splitContact[0], splitContact[1], splitContact[2],splitContact[3]);
        book.add(contact);

        for(Contact b: book.getList()){
            System.out.println(b);
        }
    }
}
