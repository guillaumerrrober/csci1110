package lab9real;


import java.util.ArrayList;
import java.util.Collections;

public class AddressBook {
    private ArrayList<Contact> contact;

    //constructor
    public AddressBook() {
        this.contact = new ArrayList<>();
    }

    public ArrayList<Contact> getList() {
        return contact;
    }

    public void setContact(ArrayList<Contact> contact) {
        this.contact = contact;
    }

    public String toString() {
        String t = "";
        for (Contact c : contact) {
            t = t + c + "\n";
        }

        return t;
    }

    public void add(Contact c) {
        for (Contact c1: contact) {
            if (c1.equals(c)) {
                return;
            }
        }
        contact.add(c);

        Collections.sort(contact);
    }

    public int deleteContact(String lastName) {
        int counter = 0;
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getLastName().equals(lastName)) {
                contact.remove(i);
                counter++;
                i--;
            }
        }
        Collections.sort(contact);
        return counter;
    }


}


