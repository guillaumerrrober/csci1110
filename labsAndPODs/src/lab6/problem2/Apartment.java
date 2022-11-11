package lab6.problem2;

public class Apartment {
    private String name;
    private String street;
    private int units;
    //constructor
    public Apartment(){}
    //main constructor
    public Apartment( String name, String street, int units){
        this.name=name;
        this.street=street;
        this.units=units;
    }

    //boolean that return true if the street are the same
    public boolean sameStreet(String street){
        return street==getStreet();
    }

    //boolean that return true if the object as more units
    public boolean moreUnits(int units){
        return getUnits()>units;
    }

    //these are the getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String toString(String name, String street, int units){
        return name+" on\n"
                +street+" has\n"
                +units+" units";
    }
}
