package Inheritance;

public class Main {
    public static void main(String[] args) {
         BoxPrice boxprice = new BoxPrice(1,2,3,4,5);
        System.out.println(boxprice.weight);
        System.out.println(boxprice.h);
        System.out.println(boxprice.price);


        BoxWeight boxWeight = new BoxWeight(2,4,7,9);
        System.out.println(boxWeight.weight);
    }
}


