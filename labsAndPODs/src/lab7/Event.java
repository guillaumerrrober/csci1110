package lab7;

import java.text.DecimalFormat;
/*
 *Guillaume Robert
 *B00908938
 *gl917669@dal.ca
 */
public class Event {
    // WRITE YOUR CODE HERE
    private String type;
    private double price;
    private int sales;
    //constructor
    public Event(String type, double price){
     this.type=type;
     this.price=price;
    }

    //create the getter
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public int  getSales(){
        return sales;
    }

    //create the setter
    public void setType(String type){
        this.type=type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setSales(int sales){
        this.sales=sales;
    }


    public boolean moreSales(int sales){
        return sales>getSales();
    }
    public String toString(){
        return ("Event: "+type+" Price: $"+price+" Sales: "+sales);
    }


}
