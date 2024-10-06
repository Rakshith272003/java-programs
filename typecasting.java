import java.io.*;
import java.util.*;

public class typecasting{
    public static void first() {
        int num = (int)(89.98f);
        System.out.println(num);

    }
    public static void second () {
        Scanner sc =new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println(a);

        int num=(int)a;
        System.out.println(num);
        
    }
    public static void automatic() {
        byte a =100;
        byte b= 20;
        int multi= a*b;//here the byte value exceeds even though it exceeds java covertys it into integer
        System.out.println(multi);
        
    }
    public static  void inttobyte() {
        int a=100;
        byte num=(byte)(a);
        System.out.println(num);

        int b=257;      //257 % 256 =1 
        byte num1=(byte)(b);
        System.out.println(num1);

        int c=259;
        byte num2=(byte)(c);
        System.out.println(num2);

        int d ='A';
        System.out.println(d);

        
    }
    
    public static void main(String[] args) {
        first();
        second();
        automatic();
        inttobyte();
    }

}