import java.io.*;
import java.util.*;

public class Dayprogram {
        public static void Weeks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7");
        int day =sc.nextInt();

        switch (day) {
           case 1 -> System.out.println("Monday");
           case 2 -> System.out.println("Tuesday");
           case 3 -> System.out.println("Wednesday");
           case 4 -> System.out.println("Thursday");
           case 5 -> System.out.println("Friday");
           case 6 -> System.out.println("Saturday");
           case 7 -> System.out.println("Sunday");

        }
    }
    public static void Weekend(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7");
        int day =sc.nextInt();

        switch (day) {
           case 1 :
           case 2 :
           case 3 :
           case 4 :
           case 5 : 
                    System.out.println("Week days");
                    break;
           case 6 : 
           case 7 : 
                    System.out.println("Weekends");
                    break;

        }
    }
    public static void main(String args[]){
        Weeks();
        Weekend();
}


}
