import java.io.*;
import java.util.*;
public class Switchdemo {
    public static void Switch1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fruits");
        String fruits=sc.next();
        
        switch (fruits) {
            case "mango":
                System.out.println("mango is a seasonal fruit");
                break;
            case "orange":
                System.out.println("Orange is my favor fruit");
                break;
        
            default:
                System.out.println("invalid choice");
        }
    }
    public static void SwitchpreciseFormat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fruits");
        String fruits=sc.next();
        
        switch (fruits) {
            case "mango" -> System.out.println("mango is a seasonal fruit");
            case "orange" -> System.out.println("Orange is my favor fruit");
            default -> System.out.println("invalid");
    }
}
public static void main(String args[]){
    Switch1();
    SwitchpreciseFormat();
}
}