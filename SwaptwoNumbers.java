import java.io.*;
import java.util.*;

public class SwaptwoNumbers{
    public static void tempswap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("The Swap of two numbers using temp is a="+a+"b="+b);
    }

    public static void MathSwap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The Swap of two numbers using mathformula is a="+a+"b="+b);

    }

public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a value");
    int a = sc.nextInt();
    System.out.println("Enter b value");
    int b = sc.nextInt();

    tempswap(a,b);
    MathSwap(a,b);

}}