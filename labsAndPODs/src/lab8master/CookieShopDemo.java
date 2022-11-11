package lab8master;

import java.util.ArrayList;
import java.util.Scanner;

public class CookieShopDemo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double price=in.nextDouble();
        int size=in.nextInt();
        ArrayList<CookieShop> arr=new ArrayList<CookieShop>();
        int noOfSales= in.nextInt();
            String shopID=null;
            int Sales=0;
            int allSales=0;
            int shopCount=0;
            for(int i=0; i<size; i++) {
                int shopNo=i+1;
                shopID="C"+shopNo;
                double initialRev=0.00;
                CookieShop shop=new CookieShop(shopID, Sales,allSales,shopCount,initialRev);
                arr.add(shop);
            }
        double totalRev=0.00;
        for(int i=0; i<noOfSales; i++) {
            int index = in.nextInt();
            arr.get(index).sales();
            arr.get(index).setPrice(price);
          totalRev+=price;
        }

        for(int i=0; i<size; i++){
            System.out.println(arr.get(i).toString());
        }

        System.out.println("Total cookies sold in all shops: "+noOfSales);
        System.out.println(String.format("Total revenue from all shops: $" + totalRev+0));
        System.out.println("There are "+size+" Cookie shops.");

        int topSale=arr.get(0).getSales();
        String top=arr.get(0).getShopID();
        for(int i=0; i< arr.size(); i++){
            if(topSale<arr.get(i).getSales()){
                top=arr.get(i).getShopID();
            }
        }
        System.out.println("The top shop is : "+top);

    }
}
