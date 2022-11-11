package lab9real;

public class Contact implements Comparable<Contact>{
    protected String lastName;
    protected String firstName;
    protected String streetName;
    protected String phoneNumber;

    //constructor
    public Contact(String lastName, String firstName, String streetName, String phoneNumber){
        this.lastName=lastName;
        this.firstName=firstName;
        this.streetName=streetName;
        this.phoneNumber=phoneNumber;
    }


    /*
    //getter for all the attribute
    //@getLastName, getFirstName, getStreetName, getPhoneNumber
    //return firstName, lastName, streetName, phoneNumber
     */
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
    //get all the attribute as a string
    //@toString
    //return a string
     */
    public String toString(){
        return lastName+", "+firstName+": "+streetName+ ", "+phoneNumber;
    }
    public boolean equals(Contact o){
        return o.getLastName().equals(lastName)&&
                o.getFirstName().equals(firstName)&&
                o.getStreetName().equals(streetName)&&
                o.getPhoneNumber().equals(phoneNumber);
    }
    public int compareTo(Contact other){
        int x=lastName.compareTo(other.getLastName());
        if(x==0){
            int y=firstName.compareTo(other.getFirstName());
            if(y==0){
                return streetName.compareTo(other.getStreetName());
            }
            else{
                return y;
            }
        }
        else{
            return x;
        }
    }

}

