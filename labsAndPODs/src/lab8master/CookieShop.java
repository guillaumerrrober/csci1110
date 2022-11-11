package lab8master;

import java.text.DecimalFormat;

public class CookieShop {
    protected String shopID;
    protected int sales;
    protected int allSales;
    protected int shopCount;
    protected double price;

    //constructor
    public CookieShop(String shopID, int sales,int allSales, int shopCount, double price){
        this.shopID=shopID;
        this.sales=sales;
        this.allSales=allSales;
        this.shopCount=shopCount;
        this.price=price;
    }
    public void sales(){
        sales++;
    }
    public int getSales(){
        return sales;
    }
    public String getShopID(){
        return shopID;
    }
    public void setPrice(double price){
        this.price=this.price+price;
    }
    public double getPrice(){
        return price;
    }
    public int getAllSales(){
        return shopCount++;
    }
    public int getShopCount(){
        return shopCount;
    }
    public String toString(){
        DecimalFormat df=new DecimalFormat("#0.00");
        return "Shop: "+shopID +" Sales: "+sales +" Revenue: $"+df.format(price);
    }
}
