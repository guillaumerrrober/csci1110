
package lab6.problem1;
public class Apartment {
    private String name;
    private String street;
    private int units;
    //constructor
    public Apartment(){
    }
    public Apartment( String name, String street, int units){
        this.name=name;
        this.street=street;
        this.units=units;
    }

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


